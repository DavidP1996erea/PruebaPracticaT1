package com.example.pruebapracticat1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class Configuracion : AppCompatActivity() {

    private lateinit var roomDB: cineDataBase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracion)


        roomDB = Room.databaseBuilder(
            this.applicationContext,
            cineDataBase::class.java,
            "examenDB"
        ).build()
    }




    fun insertarDatos(view: View){
        var recogerNumSala = findViewById<EditText>(R.id.numSala).text.toString().toInt()
        var recogerNumAsiento = findViewById<EditText>(R.id.numAsiento).text.toString().toInt()
        var recogerPrecio = findViewById<EditText>(R.id.precio).text.toString().toDouble()
        var contador=0;

        var a = Intent(this, ListadoSalas::class.java)

        GlobalScope.launch(Dispatchers.IO) {

            while (contador<=recogerNumSala){
                contador++
                val configuracion = tConf(contador,recogerNumAsiento,recogerPrecio)
                roomDB.cineDaoTConf().insertConf(configuracion)

            }

            startActivity(a)


        }

    }
}