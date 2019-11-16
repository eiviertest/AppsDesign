package com.eivier.listviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declara e inicializar arreglo de ciudades (String)
        val ciudades = arrayOf("Dolores Hgo", "San Felipe", "San Miguel de Allendo", "San Diego de la Union")
        var habitantes = arrayOf(16000, 140000,158000, 105000, 98000)

        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ciudades)
        lstCiudades.adapter = adaptador
        lstCiudades.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Posicion: $position", Toast.LENGTH_LONG).show()
            txvPoblacion.text = "Poblacion ${habitantes[position]}"

            //Lanzamiento de actividad dos
            val intento = Intent(this, CiudadActivity::class.java)
            intento.putExtra("ciudad", ciudades[position])
            startActivity(intento)
        }
    }
}
