package com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Tabs.Tabs;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import com.app.a2.studio.android.app.disco.discoapp.R;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.Music.Music;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.RecyclerView_Adapter.MusicVoteListAdapter;
import com.app.a2.studio.android.app.disco.discoapp.Screens.MainScreen.SnapHelper_for_RecyclerView.StartSnapHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link TabVoteList.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link TabVoteList#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TabVoteList extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mRVadaper;
    private RecyclerView.LayoutManager mRVlManager;
    private static TabVoteList SigleTabVoteList = null;

    public TabVoteList() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TabVoteList.
     */
    // TODO: Rename and change types and number of parameters
    public static TabVoteList newInstance(String param1, String param2) {
        if (SigleTabVoteList == null) {
            SigleTabVoteList = new TabVoteList();
            Bundle args = new Bundle();
            args.putString(ARG_PARAM1, param1);
            args.putString(ARG_PARAM2, param2);
            SigleTabVoteList.setArguments(args);
        }
        return SigleTabVoteList;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_vote_list, container, false);

        List<Music> data = new ArrayList<>();
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));
        data.add(new Music("Stamp on the ground", "Italo Brothers", R.drawable.ic_launcher_background, "0"));



        mRecyclerView = view.findViewById(R.id.ftvl_RecyclerView);
        mRecyclerView.setHasFixedSize(true);

        mRVlManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mRVlManager);

        mRVadaper = new MusicVoteListAdapter(data);
        mRecyclerView.setAdapter(mRVadaper);

        StartSnapHelper startSnapHelper = new StartSnapHelper();
        startSnapHelper.attachToRecyclerView(mRecyclerView);

        fallDownAnimation();

        return view;
    }

    // Animation for RecyclerView //
    private void fallDownAnimation(){
        int resId = R.anim.layout_animation_fall_down;
        LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(getContext(), resId);
        mRecyclerView.setLayoutAnimation(animation);
    }

    // Method for repeat the animation
    private void runLayoutAnimation(final RecyclerView recyclerView) {
        final Context context = recyclerView.getContext();
        final LayoutAnimationController controller = AnimationUtils.loadLayoutAnimation(context, R.anim.layout_animation_fall_down);

        recyclerView.setLayoutAnimation(controller);
        recyclerView.getAdapter().notifyDataSetChanged();
        recyclerView.scheduleLayoutAnimation();
    }
    // *************************** //

    // Check if recyclerview is scrollable
    public boolean isRecyclerScrollable() {

        LinearLayoutManager layoutManager = (LinearLayoutManager) mRecyclerView.getLayoutManager();
        RecyclerView.Adapter adapter = mRecyclerView.getAdapter();
        return ((layoutManager != null && adapter != null) &&
                (layoutManager.findLastCompletelyVisibleItemPosition() < adapter.getItemCount() - 1));
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
