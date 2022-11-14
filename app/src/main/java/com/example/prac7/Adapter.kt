package com.example.prac7

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (private var lista:ArrayList<Pelicula>,
               private var contexto: Context): RecyclerView.Adapter<Adapter.verHolder>()
{
    class verHolder(var vista: View, var contexto: Context):
        RecyclerView.ViewHolder(vista){
        val ctitulo = vista.findViewById<TextView>(R.id.gTitulo)
        val cgenero = vista.findViewById<TextView>(R.id.gGenero)
        val ccalif = vista.findViewById<RatingBar>(R.id.gCalif)
        val cimag = vista.findViewById<ImageView>(R.id.gImagen)
                fun bind(pelicula: Pelicula){
                    ctitulo.text = pelicula.titulo
                    cgenero.text = pelicula.genero
                    ccalif.rating = pelicula.calificacion.toFloat()
                    cimag.setImageResource(pelicula.imagen)
                }//End fun bind
            }//End RecyclerView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): verHolder {
        return verHolder(LayoutInflater.from(parent.context).inflate(R.layout.lista_pelis, parent, false),contexto)
    }

    override fun onBindViewHolder(holder: verHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int {
        return lista.size
    }

}