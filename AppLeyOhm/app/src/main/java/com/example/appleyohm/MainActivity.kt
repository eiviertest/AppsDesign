package com.example.appleyohm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Manejo del evento en Kotlin con un escucha
        btnCalcular.setOnClickListener() {
            //Obtencion de valores de la vista
            var voltaje : Double = etxVoltaje.text.toString().toDouble()
            var resistencia : Double = etxResistencia.text.toString().toDouble()
            var corrriente : Double = etxCorriente.text.toString().toDouble()
            var resultado : Double? //Valor desconocido
            var mensaje : String = ""

            if (rbtVoltaje.isChecked) {
                //Se calcula el Voltaje V = I x R
                resultado = corrriente * resistencia
                etxVoltaje?.setText("vda")
                mensaje = "Se calculo el Voltaje"
            } else if (rbtCorriente.isChecked) {
                //Se calcula la corriente I = V / R
                resultado = valorUno / valorDos
                txvResultado.text = "La corriente es de ${resultado.toString()} amperios"
                mensaje = "Se calculo la corriente"
            } else if (rbtResistencia.isChecked) {
                //Se calcula la resistencia R = V / I
                resultado = valorUno / valorDos
                txvResultado.text = "La resistencia es de ${resultado.toString()} ohms"
                mensaje = "Se calculo la resistencia"
            } else {
                mensaje = "No se realizo ningun calulo"
            }
            Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        }
    }
}
