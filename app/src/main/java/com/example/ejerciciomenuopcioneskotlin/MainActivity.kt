package com.example.ejerciciomenuopcioneskotlin

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciomenuopcioneskotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //Creamos el binding que nos sirve para la vinculacion de vista
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        //Estas lineas hace que se nos vincule las vistas con el fragmento
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Asociamos los menus contextuales a los controles
        registerForContextMenu(binding.idIVAsir)
        registerForContextMenu(binding.idIVDam)
        registerForContextMenu(binding.idIVDaw)
    }

    /*
    Sobreescribimos el evento encargado de construir los menus opciones asociados a los diferentes
    controles
     */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_opciones, menu)
        return true
    }

    /*
    Sobreescribimos el evento encargado de construir los menus contextuales asociados a los diferentes
    controles
     */
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_opciones, menu)
    }

    /*
    Implementamos las acciones a realizar tras pulsar una opcion determinada del menu
     */
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.idAsir -> {
                val intent1 = Intent(this, ScrollingASIR::class.java)
                startActivity(intent1)
                finish()
            }
            R.id.idDam -> {
                val intent2 = Intent(this, ScrollingDAM::class.java)
                startActivity(intent2)
                finish()
            }
            R.id.idDaw -> {
                val intent3 = Intent(this, ScrollingDAW::class.java)
                startActivity(intent3)
                finish()
            }
            else -> super.onOptionsItemSelected(item)
        }
        return true
    }

    /*
    Implementamos las acciones a realizar tras pulsar una opcion determinada del menu contextual
     */
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.idAsir -> {
                val intent1 = Intent(this, ScrollingASIR::class.java)
                startActivity(intent1)
                finish()
            }
            R.id.idDam -> {
                val intent2 = Intent(this, ScrollingDAM::class.java)
                startActivity(intent2)
                finish()
            }
            R.id.idDaw -> {
                val intent3 = Intent(this, ScrollingDAW::class.java)
                startActivity(intent3)
                finish()
            }
            else -> super.onContextItemSelected(item)
        }
        return true
    }
}