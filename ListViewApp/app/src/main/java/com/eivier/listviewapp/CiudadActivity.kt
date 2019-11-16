package com.eivier.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ciudad.*

class CiudadActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudad)

        //Obtencion de elementos extra
        val bundle = intent.extras
        val datos = bundle?.getString("cuidad")
        txvCiudad.text = datos

        btnVolver.setOnClickListener {
            finish()
        }
    }
}
