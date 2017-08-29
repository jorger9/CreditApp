package com.credme.creditapp.login.interactor;

import android.app.Activity;

import com.credme.creditapp.login.presenter.LoginPresenter;
import com.credme.creditapp.login.repository.LoginRepository;
import com.credme.creditapp.login.repository.LoginRepositoryImpl;


/**
 * Created by jorger9 on 6/23/17.
 */

public class LoginInteractorImpl implements LoginInteractor {
    private LoginPresenter loginPresenter;
    private LoginRepository loginRepository;

    public LoginInteractorImpl(LoginPresenter loginPresenter) {
        this.loginPresenter = loginPresenter;
        loginRepository = new LoginRepositoryImpl(loginPresenter);
    }

    @Override
    public void signIn(String userName, String password, Activity activity) {

        loginRepository.signIn(userName,password, activity);

    }
}
