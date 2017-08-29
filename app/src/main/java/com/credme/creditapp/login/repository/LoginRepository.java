package com.credme.creditapp.login.repository;

import android.app.Activity;



/**
 * Created by jorger9 on 6/23/17.
 */

public interface LoginRepository {

    void signIn(String userName, String password, Activity activity);
}
