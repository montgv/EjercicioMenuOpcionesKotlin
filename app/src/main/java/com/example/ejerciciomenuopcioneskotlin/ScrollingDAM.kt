package com.example.ejerciciomenuopcioneskotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciomenuopcioneskotlin.databinding.ActivityScrollingDamBinding

class ScrollingDAM : AppCompatActivity() {
    //Creamos el binding que nos sirve para la vinculacion de vista
    private lateinit var binding: ActivityScrollingDamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Estas lineas hace que se nos vincule las vistas con el fragmento
        binding = ActivityScrollingDamBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Vinculacion con el Toolbar
        setSupportActionBar(findViewById(R.id.toolbar))
        //Poner un titulo al toolbar para que aparezca
        binding.toolbarLayout.title = title
        //Definimos un escuchador mediante el método setOnClickListener que esta asociado al boton
        // flotante con su vista, cuando se pulsa el botón, navegamos a un destino
        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}