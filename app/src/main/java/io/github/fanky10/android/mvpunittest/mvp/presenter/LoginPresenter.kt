package io.github.fanky10.android.mvpunittest.mvp.presenter

import io.github.fanky10.android.mvpunittest.mvp.LoginContract
import io.github.fanky10.android.mvpunittest.mvp.LoginContract.Presenter

class LoginPresenter(private val loginModel: LoginContract.Model, private val loginView: LoginContract.View) : Presenter {

    override fun init() {
        loginView.init()
    }

    override fun onPause() {
        // TODO: unsubscribe observables
    }

    override fun onResume() {
        // TODO: subscribe observables
    }

    override fun onLoginPressed() {
        val username = loginView.username
        val password = loginView.password
        val isAuthenticated = loginModel.authenticateUser(username, password)
        if (isAuthenticated) {
            loginView.showWelcomeScreen()
        } else {
            loginView.showOnAuthenticationErrorMessage()
        }
    }

    override fun onForgotPasswordPressed() {
        loginView.showForgotPasswordScreen()
    }
}
