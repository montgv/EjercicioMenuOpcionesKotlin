package com.example.ejerciciomenuopcioneskotlin

import android.content.Intent
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.example.ejerciciomenuopcioneskotlin.databinding.ActivityScrollingAsirBinding

class ScrollingASIR : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingAsirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingAsirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(findViewById(R.id.toolbar))
        binding.toolbarLayout.title = title
        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}