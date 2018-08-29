package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.MainScreen;

import android.app.Fragment;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.app.a2.studio.android.app.disco.discoapp.R;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.PageAdapter.PagerAdapter;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.Tabs.TabAllSongsList;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.Tabs.TabVoteList;

public class MainScreen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        TabVoteList.OnFragmentInteractionListener, TabAllSongsList.OnFragmentInteractionListener{

    // Attributes
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        // Instantiation of objects

        // Inicialization of all widgets on screen
        inicialiceToolbar();
        inicialiceFab();
        inicialiceDrawerLayout();
        inicialiceNavigationView();
        inicialiceTabLayout();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private void inicialiceToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.cms_toolbar);
        setSupportActionBar(mToolbar);
    }

    private void inicialiceFab(){
        FloatingActionButton mFab = (FloatingActionButton) findViewById(R.id.cms_fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });
    }

    private void inicialiceDrawerLayout(){
        DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    private void inicialiceNavigationView(){
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    private void inicialiceTabLayout(){
        TabLayout tabLayout = (TabLayout) findViewById(R.id.cms_tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText(getResources().getString(R.string.tab1_tittle)));
        tabLayout.addTab(tabLayout.newTab().setText(getResources().getString(R.string.tab2_tittle)));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.cms_viewPager);
        final PagerAdapter pageAdapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

                AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.cms_appBarLayout);
                AppBarLayout.LayoutParams mToolbarLayoutParams = (AppBarLayout.LayoutParams) mToolbar.getLayoutParams();

                switch (tab.getPosition()){
                    case 0:
                        viewPager.setCurrentItem(0);
                        appBarLayout.setExpanded(true, true);

                        if (!TabVoteList.newInstance(null, null).isRecyclerScrollable()){
                            mToolbarLayoutParams.setScrollFlags(0);
                            mToolbar.setLayoutParams(mToolbarLayoutParams);
                        }
                        else {
                            mToolbarLayoutParams.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL
                                    | AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
                                    | AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP);
                            mToolbar.setLayoutParams(mToolbarLayoutParams);
                        }

                        break;

                    case 1:
                        viewPager.setCurrentItem(1);
                        appBarLayout.setExpanded(true, true);

                        if (!TabAllSongsList.newInstance(null, null).isRecyclerScrollable()){
                            mToolbarLayoutParams.setScrollFlags(0);
                            mToolbar.setLayoutParams(mToolbarLayoutParams);
                        }
                        else {
                            mToolbarLayoutParams.setScrollFlags(AppBarLayout.LayoutParams.SCROLL_FLAG_SCROLL
                                    | AppBarLayout.LayoutParams.SCROLL_FLAG_ENTER_ALWAYS
                                    | AppBarLayout.LayoutParams.SCROLL_FLAG_SNAP);
                            mToolbar.setLayoutParams(mToolbarLayoutParams);
                        }
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    private void createSimpleAlertDialog(String title, String body){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        dialog.setTitle(title);
        dialog.setMessage(body);

        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
