package io.github.fanky10.android.mvpunittest.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.github.fanky10.android.mvpunittest.R;
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository;
import io.github.fanky10.android.mvpunittest.data.repository.impl.UsersRepositoryImpl;
import io.github.fanky10.android.mvpunittest.mvp.LoginContract;
import io.github.fanky10.android.mvpunittest.mvp.model.LoginModel;
import io.github.fanky10.android.mvpunittest.mvp.presenter.LoginPresenter;
import io.github.fanky10.android.mvpunittest.mvp.view.LoginView;

public class LoginActivity extends AppCompatActivity {

    private LoginContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();
    }

    private void init() {
        ButterKnife.bind(this);
        // TODO: transform this into DI
        UsersRepository usersRepository = new UsersRepositoryImpl();
        LoginContract.View view = new LoginView(this);
        LoginContract.Model model = new LoginModel(usersRepository);

        presenter = new LoginPresenter(model, view);
        presenter.init();
    }

    @OnClick(R.id.btn_login)
    public void btnLoginClicked() {
        presenter.onLoginPressed();
    }
}
