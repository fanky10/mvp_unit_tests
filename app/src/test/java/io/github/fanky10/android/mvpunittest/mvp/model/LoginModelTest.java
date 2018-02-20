package io.github.fanky10.android.mvpunittest.mvp.model;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import io.github.fanky10.android.mvpunittest.data.entities.User;
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

public class LoginModelTest {

    private @Mock UsersRepository usersRepository;
    private @Mock User user;
    private LoginModel loginModel;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        loginModel = new LoginModel(usersRepository);

        List<User> users = new ArrayList<>();
        users.add(user);
        when(usersRepository.getUsers()).thenReturn(users);
    }

    @Test
    public void shouldAuthenticateUser() throws Exception {
        when(user.getUsername()).thenReturn("mockUsername");
        when(user.getPassword()).thenReturn("mockPassword");
        assertTrue(loginModel.authenticateUser("mockUsername", "mockPassword"));
    }

    @Test
    public void shouldNotAuthenticateUser() throws Exception {
        when(user.getUsername()).thenReturn("mockUsername");
        when(user.getPassword()).thenReturn("mockPassword");
        assertFalse(loginModel.authenticateUser("username", "password"));
    }

}