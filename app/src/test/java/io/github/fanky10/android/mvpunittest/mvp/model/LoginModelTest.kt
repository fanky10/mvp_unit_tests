package io.github.fanky10.android.mvpunittest.mvp.model

import io.github.fanky10.android.mvpunittest.data.entities.User
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations
import java.util.*

class LoginModelTest {

    @Mock
    lateinit var usersRepository: UsersRepository
    @Mock
    lateinit var user: User
    lateinit var loginModel: LoginModel

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        loginModel = LoginModel(usersRepository)

        val users = ArrayList<User>()
        users.add(user)
        `when`(usersRepository.users).thenReturn(users)
    }

    @Test
    fun shouldAuthenticateUser() {
        user.username = "mockUsername"
        user.password = "mockPassword"
        assertTrue(loginModel.authenticateUser("mockUsername", "mockPassword"))
    }

    @Test
    fun shouldNotAuthenticateUser() {
        user.username = "mockUsername"
        user.password = "mockPassword"
        assertFalse(loginModel.authenticateUser("username", "password"))
    }

}