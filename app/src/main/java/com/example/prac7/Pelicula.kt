package com.example.prac7

import java.io.Serializable

data class Pelicula (
    var imagen: Int,
    var titulo: String,
    var genero: String,
    var calificacion: Double,
    var detalle: String):Serializable {

}//Fin class Película