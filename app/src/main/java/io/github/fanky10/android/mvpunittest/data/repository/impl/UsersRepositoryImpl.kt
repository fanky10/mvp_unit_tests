package io.github.fanky10.android.mvpunittest.data.repository.impl

import io.github.fanky10.android.mvpunittest.data.entities.User
import io.github.fanky10.android.mvpunittest.data.repository.UsersRepository
import java.util.*

class UsersRepositoryImpl : UsersRepository {
    override val users: List<User>
        get() {
            val users = ArrayList<User>()

            val mockUser = User()
            mockUser.username = "admin@example.com"
            mockUser.password = "admin"
            users.add(mockUser)

            return users
        }
}
