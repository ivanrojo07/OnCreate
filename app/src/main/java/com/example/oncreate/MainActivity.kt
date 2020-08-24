package com.example.oncreate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var nombre = "Guillermo"
    val NOMBRE = "nombre"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton = findViewById<Button>(R.id.boton)

        boton.setOnClickListener {
            nombre = "Iván"
            Toast.makeText(this,nombre,Toast.LENGTH_SHORT).show()
        }

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        nombre = savedInstanceState?.getString(NOMBRE)!!
        Toast.makeText(this,nombre,Toast.LENGTH_SHORT).show()

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

        outState?.putString(NOMBRE,nombre)
    }
}