package com.app.a2.studio.android.app.disco.discoapp.Screens.RegisterActivity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;

import com.app.a2.studio.android.app.disco.discoapp.R;

public class RegisterActivity extends AppCompatActivity {

    private EditText mUsuario, mCorreo, mContrasena, mRepContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        findIDs();
        inicialiceToolbar();


        mUsuarioChangeListener();
        mCorreoChangeListener();
        mContrasenaChangeListener();
        mRepContrasenaChangeListener();
    }

    private void findIDs() {
        mUsuario = (EditText) findViewById(R.id.cr_et_Usuario);
        mCorreo = (EditText) findViewById(R.id.cr_et_Correo);
        mContrasena = (EditText) findViewById(R.id.cr_et_Contraseña);
        mRepContrasena = (EditText) findViewById(R.id.cr_et_repContraseña);
    }

    private void inicialiceToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    private void mUsuarioChangeListener(){
        mUsuario.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void mCorreoChangeListener(){
        mCorreo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void mContrasenaChangeListener(){
        mContrasena.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void mRepContrasenaChangeListener(){
        mRepContrasena.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}
