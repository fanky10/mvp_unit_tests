package io.github.fanky10.android.mvpunittest.mvp

interface LoginContract {
    interface Model {
        fun authenticateUser(username: String, password: String): Boolean
    }

    interface View {
        val username: String
        val password: String
        fun init()
        fun showOnAuthenticationErrorMessage()
        fun showWelcomeScreen()
        fun showForgotPasswordScreen()
    }

    interface Presenter {
        fun init()
        fun onPause()
        fun onResume()
        fun onLoginPressed()
        fun onForgotPasswordPressed()
    }
}
