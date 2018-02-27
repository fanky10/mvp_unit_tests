package io.github.fanky10.android.mvpunittest.data.repository

import io.github.fanky10.android.mvpunittest.data.entities.User

interface UsersRepository {
    val users: List<User>
}
