package io.github.fanky10.android.mvpunittest.mvp.model;

import android.support.annotation.NonNull;

import io.github.fanky10.android.mvpunittest.data.entities.User;
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository;
import io.github.fanky10.android.mvpunittest.mvp.LoginContract;

public class LoginModel implements LoginContract.Model {

    private final UsersRepository usersRepository;

    public LoginModel(@NonNull UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        if (usersRepository.getUsers() == null) {
            return false;
        }

        for (User user: usersRepository.getUsers()) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
               return true;
            }
        }
        return false;
    }
}
