package io.github.fanky10.android.mvpunittest.mvp;

public interface LoginContract {
    interface Model {
        boolean authenticateUser(String username, String password);
    }

    interface View {
        void init();
        String getUsername();
        String getPassword();
        void showOnAuthenticationErrorMessage();
        void showWelcomeScreen();
        void showForgotPasswordScreen();
    }

    interface Presenter {
        void init();
        void onPause();
        void onResume();
        void onLoginPressed();
        void onForgotPasswordPressed();
    }
}
