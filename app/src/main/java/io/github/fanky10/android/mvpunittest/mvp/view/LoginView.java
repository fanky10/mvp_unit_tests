package io.github.fanky10.android.mvpunittest.mvp.view;

import io.github.fanky10.android.mvpunittest.mvp.LoginContract;

public class LoginView implements LoginContract.View {
    @Override
    public void init() {

    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public void showOnAuthenticationErrorMessage() {

    }

    @Override
    public void showWelcomeScreen() {

    }

    @Override
    public void showForgotPasswordScreen() {

    }
}
