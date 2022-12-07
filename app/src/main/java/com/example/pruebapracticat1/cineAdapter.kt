package com.example.pruebapracticat1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class cineAdapter (
    val listaJugadores: List< tConf>,

    ) : RecyclerView.Adapter< cineAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaJugadores[position]
        holder.bind(item)
    }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val layoutInflater = LayoutInflater.from(parent.context)
            return ViewHolder(layoutInflater.inflate(R.layout.items, parent, false))
        }

        override fun getItemCount(): Int {
            return listaJugadores.size
        }

        class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvSala = view.findViewById<TextView>(R.id.tvnumSala)
            val tvAsientos = view.findViewById<TextView>(R.id.tvnumAsientos)
            val tvPrecio = view.findViewById<TextView>(R.id.tvprecio)

            fun bind(
                task: tConf

            ) {
                

                tvSala.text = "-  Sala: " + task.numSalas.toString()
                tvAsientos.text = " Asientos : "+  task.numAsientos.toString()
                tvPrecio.text = "Precio: " + task.precio.toString()

            }
        }


}