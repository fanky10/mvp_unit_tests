package io.github.fanky10.android.mvpunittest.data.repository;

import java.util.List;

import io.github.fanky10.android.mvpunittest.data.entities.User;

public interface UsersRepository {
    List<User> getUsers();
}
