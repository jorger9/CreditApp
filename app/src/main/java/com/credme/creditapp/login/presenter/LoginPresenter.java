package com.credme.creditapp.login.presenter;

import android.app.Activity;

/**
 * Created by jorger9 on 8/28/17.
 */

public interface LoginPresenter {

    void signIn(String userName, String password, Activity activity);
    void loginSuccess();
    void loginError(String error);
}
