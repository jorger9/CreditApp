package com.credme.creditapp.login.view;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.credme.creditapp.ContainerActivity;
import com.credme.creditapp.R;

public class LoginActivity extends AppCompatActivity {
    private TextInputEditText userName, password;
    private Button login;
    private ProgressBar progressBarLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userName         = (TextInputEditText)findViewById(R.id.username);
        password         = (TextInputEditText)findViewById(R.id.password);
        login            = (Button)findViewById(R.id.login);
        progressBarLogin = (ProgressBar)findViewById(R.id.progressbarlogin);


        hideProgressBar();
        //goHome();
    }

    public void goHome() {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    public void showProgressBar() {
        progressBarLogin.setVisibility(View.VISIBLE);

    }

    public void hideProgressBar() {
        progressBarLogin.setVisibility(View.GONE);

    }
}
