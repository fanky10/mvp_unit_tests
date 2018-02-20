package io.github.fanky10.android.mvpunittest.data.repository.impl;

import java.util.ArrayList;
import java.util.List;

import io.github.fanky10.android.mvpunittest.data.entities.User;
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository;

public class UsersRepositoryImpl implements UsersRepository {
    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();

        User mockUser = new User();
        mockUser.setUsername("admin@example.com");
        mockUser.setPassword("admin");
        users.add(mockUser);

        return users;
    }
}
