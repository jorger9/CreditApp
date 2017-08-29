package com.credme.creditapp.login.interactor;

import android.app.Activity;


/**
 * Created by jorger9 on 6/23/17.
 */

public interface LoginInteractor {

    void signIn(String userName, String password, Activity activity);
}
