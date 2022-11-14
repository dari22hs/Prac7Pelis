package com.example.prac7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/*
Darío Huallpa
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        generaDatosPeli()
        iniRpelis()

    }//Fin onCreate

    private fun generaDatosPeli(): ArrayList<Pelicula>{
        var lista = ArrayList<Pelicula>()
        lista.add(Pelicula(R.drawable.movies1, "Título 1", "Género 1", 4.9,"Detalle 1"))
        lista.add(Pelicula(R.drawable.movies2, "Título 2", "Género 2", 4.1,"Detalle 2"))
        lista.add(Pelicula(R.drawable.movies3, "Título 3", "Género 3", 3.5,"Detalle 3"))
        lista.add(Pelicula(R.drawable.movies4, "Título 4", "Género 4", 3.9,"Detalle 4"))
        lista.add(Pelicula(R.drawable.movies5, "Título 5", "Género 5", 4.5,"Detalle 5"))

        return lista
    }//End fun generaDatosPeli

    public fun iniRpelis(){
        val rvPelis = findViewById<RecyclerView>(R.id.gPelis)
        rvPelis.layoutManager = LinearLayoutManager(this)
        rvPelis.adapter = Adapter(generaDatosPeli(),this)
    }//End fun iniRpelis


}//Fin class Main Activity