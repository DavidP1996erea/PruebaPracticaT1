package com.example.pruebapracticat1

import androidx.room.*

@Dao
interface cineDaoTConf {

    @Query("Select * from tConf")
    suspend fun mostrarConf():MutableList<tConf>

    @Query("Select * from tConf where numSalas = :numSala")
    suspend fun mostrarConf(numSala:String) : tConf



    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertConf(persona:tConf)

    @Update
    suspend fun updateConf(persona:tConf)

    @Delete
    suspend fun eliminarConf(persona:tConf)


}


@Dao
interface cineDaoTPedido {

    @Query("Select * from tPedido")
    suspend fun mostrarPedido():MutableList<tPedido>

    @Query("Select numAsientosOcupados from tPedido where numSala=:numSala")

    suspend fun mostrarNumAsientos(numSala:Int) : Int




    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertPedido(persona:tPedido)

    @Update
    suspend fun updatePedido(persona:tPedido)

    @Delete
    suspend fun eliminarPedido(persona:tPedido)


}


@Dao
interface cineDaoTPelicula {

    @Query("Select * from tPelicula")
    suspend fun mostrarPelicula():MutableList<tPelicula>

    @Query("Select idPelicula from tPelicula where titulo=:nombrePelicula")
    suspend fun recogerIdPeliculaPorNombre(nombrePelicula:String) : tPelicula


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertPelicula(persona:tPelicula)

    @Update
    suspend fun updatePelicula(persona:tPelicula)

    @Delete
    suspend fun eliminarPelicula(persona:tPelicula)


}