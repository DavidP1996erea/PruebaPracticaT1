package com.example.pruebapracticat1

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [tConf::class, tPedido::class, tPelicula::class], version =1)
abstract class cineDataBase : RoomDatabase() {

    abstract fun cineDaoTConf() : cineDaoTConf
    abstract fun cineDaoTPelicula() : cineDaoTPelicula
    abstract fun cineDaoTPedido() : cineDaoTPedido

}