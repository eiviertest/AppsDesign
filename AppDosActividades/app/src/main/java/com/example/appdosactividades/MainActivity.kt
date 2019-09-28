package com.example.appdosactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Manejo de evento de click del btnInfo
        btnInfo.setOnClickListener {
            //Crear objeto de la clase Intent
            val intento = Intent(this, InformacionActivity::class.java)
            //Se realaciona con la actividad a inciar
            startActivity(intento)
        }

        btnAyuda.setOnClickListener {
            val ayuda = Intent(this, AyudaActivity::class.java)
            startActivity(ayuda)
        }

        btnMas.setOnClickListener {
            val mas = Intent(this, MasActivity::class.java)
            startActivity(mas)
        }
    }
}
