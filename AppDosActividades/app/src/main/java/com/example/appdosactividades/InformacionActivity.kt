package com.example.appdosactividades

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_informacion.*

class InformacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)

        //Boton de retorno
        btnVolver.setOnClickListener {
            finish()
        }
    }
}
