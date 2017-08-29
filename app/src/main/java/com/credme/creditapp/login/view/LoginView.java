package com.credme.creditapp.login.view;

import android.view.View;

/**
 * Created by jorger9 on 8/28/17.
 */

public interface LoginView {

    void enableInputs();
    void disableInputs();

    void showProgressBar();
    void hideProgressBar();

    void loginError(String error);


    void goCreateAccount();
    void goHome();
    void openURL(View view);
}
