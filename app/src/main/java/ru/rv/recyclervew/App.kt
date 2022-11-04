package ru.rv.recyclervew

import android.app.Application
import ru.rv.recyclervew.model.UsersService

class App : Application() {

    val usersService = UsersService()
}