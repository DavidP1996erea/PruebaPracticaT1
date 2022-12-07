package com.example.pruebapracticat1

import android.app.Application
import androidx.room.Room

class cineApp : Application() {


    companion object {
        lateinit var database: cineDataBase
    }

    override fun onCreate() {
        super.onCreate()
        cineApp.database = Room.databaseBuilder(this, cineDataBase::class.java, "examenDB").build()
    }

}