package io.github.fanky10.android.mvpunittest.mvp.view;

import android.app.Activity;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.github.fanky10.android.mvpunittest.R;
import io.github.fanky10.android.mvpunittest.mvp.LoginContract;

// TODO: create BaseView to maintain common activity reference / showToast logic
public class LoginView implements LoginContract.View {

    @BindView(R.id.txt_username) EditText txtUsername;
    @BindView(R.id.txt_password) TextView txtPassword;
    @BindView(R.id.btn_login) TextView btnLogin;

    // activity should never be exposed publicly
    private WeakReference<Activity> activityWeak;

    public LoginView(Activity activity) {
        ButterKnife.bind(this, activity);
        this.activityWeak = new WeakReference<Activity>(activity);
    }

    @Override
    public void init() {

    }

    @Override
    public String getUsername() {
        return txtUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return txtPassword.getText().toString();
    }

    @Override
    public void showOnAuthenticationErrorMessage() {
        if (activityWeak.get() != null) {
            Toast.makeText(activityWeak.get(), "Authentication Error", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showWelcomeScreen() {
        if (activityWeak.get() != null) {
            Toast.makeText(activityWeak.get(), "Welcome Screen Here", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void showForgotPasswordScreen() {
        if (activityWeak.get() != null) {
            Toast.makeText(activityWeak.get(), "Forgot Password Screen Here", Toast.LENGTH_SHORT).show();
        }
    }
}
