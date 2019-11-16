package com.eivier.solicitudbecaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mensaje: String

        btnVerificar.setOnClickListener() {
            if (etxNombre.text.isEmpty() || etxEdad.text.isEmpty() || etxHermanos.text.isEmpty() || etxIngreso.text.isEmpty() || etxpromedio.text.isEmpty()) {
                mensaje = "todos los campos son requeridos"
            } else if (etxNombre.length() < 4) {
                mensaje = "el nombre es muy corto"
            } else if (etxEdad.text.toString().toInt() < 16 || etxEdad.text.toString().toInt() > 45) {
                mensaje = "la edad no está en un rango válido"
            } else if (etxpromedio.text.toString().toInt() > 100 || etxpromedio.text.toString().toInt() < 1) {
                mensaje = "el promedio no está en un rango válido"
            } else if (etxIngreso.text.toString().toInt() < 1) {
                mensaje = "el ingreso mensual es inválido"
            } else if (etxHermanos.text.toString().toInt() < 0 || etxHermanos.text.toString().toInt() > 15) {
                mensaje = "la cantidad de hermanos es inválida"
            } else if (rbtnFolio1.text.toString() == "ABC1" || rbtnFolio2.text.toString() == "ABC2" || rbtnFolio3.text.toString() == "ABC3") {
                if (etxIngreso.text.toString().toInt()<=7000) {
                    if (etxpromedio.text.toString().toInt()>=80 && etxpromedio.text.toString().toInt()<=85) {
                        mensaje = "usted ${etxNombre.text}, ha obtenido la beca buena."
                    } else if (etxpromedio.text.toString().toInt()>=86 && etxpromedio.text.toString().toInt()<=95) {
                        mensaje = "usted ${etxNombre.text}, ha obtenido la beca muy buena."
                    } else if (etxpromedio.text.toString().toInt()>=96 && etxpromedio.text.toString().toInt()<=100 && etxHermanos.text.toString().toInt()>1) {
                        mensaje = "usted ${etxNombre.text}, ha obtenido la beca excelente."
                    } else {
                        mensaje = "usted ${etxNombre.text}, no ha obtenido ningún tipo de beca"
                    }
                } else {
                    mensaje =  "su ingreso es mayor al aceptable";
                }
            } else {
                mensaje = "la clave que ha seleccionado es inválida";
            }
            txtMensaje.setText("Mensaje: $mensaje")
        }
    }
}
