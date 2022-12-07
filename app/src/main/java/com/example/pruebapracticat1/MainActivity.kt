package com.example.pruebapracticat1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import androidx.room.Room
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater = menuInflater
        inflater.inflate(R.menu.main_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId){
            R.id.opcConfiguracion -> {
                Configuracion(null)
                true
            }

            else -> super.onOptionsItemSelected(item)
        }
    }

    fun Configuracion(view: View?){

        val opcMenu = Intent(this, Configuracion:: class.java).apply {  }
        startActivity(opcMenu)
    }



}