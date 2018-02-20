package io.github.fanky10.android.mvpunittest.mvp.presenter;

import io.github.fanky10.android.mvpunittest.mvp.LoginContract;
import io.github.fanky10.android.mvpunittest.mvp.LoginContract.Presenter;

public class LoginPresenter implements Presenter {

    private final LoginContract.Model loginModel;
    private final LoginContract.View loginView;

    public LoginPresenter(LoginContract.Model loginModel, LoginContract.View loginView) {
        this.loginModel = loginModel;
        this.loginView = loginView;
    }

    @Override
    public void init() {
        loginView.init();
    }

    @Override
    public void onPause() {
        // TODO: unsubscribe observables
    }

    @Override
    public void onResume() {
        // TODO: subscribe observables
    }

    @Override
    public void onLoginPressed() {
        String username = loginView.getUsername();
        String password = loginView.getPassword();
        boolean isAuthenticated = loginModel.authenticateUser(username, password);
        if (isAuthenticated) {
            loginView.showWelcomeScreen();
        } else {
            loginView.showOnAuthenticationErrorMessage();
        }
    }

    @Override
    public void onForgotPasswordPressed() {
        loginView.showForgotPasswordScreen();
    }
}
