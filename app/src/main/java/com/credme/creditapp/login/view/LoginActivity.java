package com.credme.creditapp.login.view;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.credme.creditapp.ContainerActivity;
import com.credme.creditapp.R;
import com.credme.creditapp.login.presenter.LoginPresenter;
import com.credme.creditapp.login.presenter.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements LoginView{
    private TextInputEditText userName, password;
    private Button login;
    private ProgressBar progressBarLogin;
    private static final String TAG = "LoginActivitys" ;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        userName         = (TextInputEditText)findViewById(R.id.username);
        password         = (TextInputEditText)findViewById(R.id.password);
        login            = (Button)findViewById(R.id.login);
        progressBarLogin = (ProgressBar)findViewById(R.id.progressbarlogin);

        presenter = new LoginPresenterImpl(this);

        login.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                signIn(userName.getText().toString(),password.getText().toString());

            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signIn(userName.getText().toString(),password.getText().toString());
            }
        });


        hideProgressBar();
    }

    private void signIn(String userName, String password) {
        presenter.signIn(userName,password,this);
    }

    public void goCreateAccount(View view){
        goCreateAccount();
    }


    @Override
    public void enableInputs() {

        userName.setEnabled(true);
        password.setEnabled(true);
        login.setEnabled(true);
    }

    @Override
    public void disableInputs() {

        userName.setEnabled(false);
        password.setEnabled(false);
        login.setEnabled(false);

    }

    @Override
    public void showProgressBar() {
        progressBarLogin.setVisibility(View.VISIBLE);

    }

    @Override
    public void hideProgressBar() {
        progressBarLogin.setVisibility(View.GONE);

    }

    @Override
    public void loginError(String error) {
        Toast.makeText(this, getString(R.string.login_error) + error, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goCreateAccount( ) {
        //Intent intent = new Intent(this, CreateAccountActivity.class);
       // startActivity(intent);
    }

    @Override
    public void goHome() {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }

    @Override
    public void openURL(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW);
        browserIntent.setData(Uri.parse("http://www.platzigram.com"));
        startActivity(browserIntent);
    }


    @Override
    protected void onStart() {
        super.onStart();
       // firebaseAuth.addAuthStateListener(authStateListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        //firebaseAuth.removeAuthStateListener(authStateListener);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
       // callbackManager.onActivityResult(requestCode, resultCode, data);
    }
}
