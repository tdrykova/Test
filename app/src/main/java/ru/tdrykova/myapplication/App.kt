package ru.tdrykova.myapplication

import android.app.Application

class App: Application() {
    override fun getClassLoader(): ClassLoader {
        return super.getClassLoader()
    }
}