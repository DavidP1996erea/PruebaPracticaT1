package com.example.pruebapracticat1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class ListadoSalas : AppCompatActivity() {



    lateinit var recyclerView: RecyclerView
    lateinit var adapter: cineAdapter
    lateinit var tasks: MutableList< tConf>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listado_salas)
        tasks = ArrayList()
        getTasks()
    }


    fun getTasks()= runBlocking {       // Corrutina que saca de la base de datos la lista de tareas
        launch {                        // Inicio del hilo
            tasks = cineApp.database.cineDaoTConf().mostrarConf()     // Se carga la lista de tareas
            setUpRecyclerView(tasks)        // se pasa la lista a la Vista
        }
    }



    fun setUpRecyclerView(tasks: List< tConf>) {    // Método que muestra la vista usando el adaptador
        adapter = cineAdapter(tasks)
        recyclerView = findViewById(R.id.rvRecycler)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}