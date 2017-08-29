package com.credme.creditapp.login.presenter;

import android.app.Activity;

import com.credme.creditapp.login.interactor.LoginInteractor;
import com.credme.creditapp.login.interactor.LoginInteractorImpl;
import com.credme.creditapp.login.view.LoginView;

/**
 * Created by jorger9 on 8/28/17.
 */



public class LoginPresenterImpl implements LoginPresenter {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        loginInteractor = new LoginInteractorImpl(this);
    }

    @Override
    public void signIn(String userName, String password, Activity activity) {

        loginView.disableInputs();
        loginView.showProgressBar();
        loginInteractor.signIn(userName,password, activity);
    }

    @Override
    public void loginSuccess() {
        loginView.goHome();
        loginView.hideProgressBar();

    }

    @Override
    public void loginError(String error) {
        loginView.enableInputs();
        loginView.hideProgressBar();
        loginView.loginError(error);

    }
}
