package com.example.pruebapracticat1

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity (tableName = "tConf")
data class tConf(

    @PrimaryKey()
    var numSalas :Int=0,
    var numAsientos:Int=0,
    var precio:Double=0.0,

)

@Entity (tableName = "tPedido")
data class tPedido(

    @PrimaryKey(autoGenerate = true)
    var id :Int=0 ,
    var numSala:Int=0,
    var idPelicula:Int=0,
    var numAsientosOcupados:Int=0,

    )

@Entity (tableName = "tPelicula")
data class tPelicula(

    @PrimaryKey(autoGenerate = true)
    var idPelicula :Int=0 ,
    var titulo:String="",
    )
