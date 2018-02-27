package io.github.fanky10.android.mvpunittest.mvp.model

import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository
import io.github.fanky10.android.mvpunittest.mvp.LoginContract

class LoginModel(private val usersRepository: UsersRepository) : LoginContract.Model {

    override fun authenticateUser(username: String, password: String): Boolean {
        for (user in usersRepository.users) {
            if (user.username == username && user.password == password) {
                return true
            }
        }
        return false
    }
}
