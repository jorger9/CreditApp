package com.credme.creditapp.login.repository;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.util.Log;

import com.credme.creditapp.login.presenter.LoginPresenter;

/**
 * Created by jorger9 on 6/23/17.
 */

public class LoginRepositoryImpl implements LoginRepository{

    private static final String TAG = "LoginRepository";
    private LoginPresenter loginPresenter;

    public LoginRepositoryImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
    }

    @Override
    public void signIn(final String userName, String password, final Activity activity) {

        //firebaseAuth.signInWithEmailAndPassword(userName, password).addOnCompleteListener(activity,new OnCompleteListener<AuthResult>() {
         if(true){
             loginPresenter.loginSuccess();
                }
                else {
                   // FirebaseCrash.logcat(Log.ERROR, TAG, "Ocurrió un error");
                    loginPresenter.loginError("Ocurrió un error");
                }
            }
}
