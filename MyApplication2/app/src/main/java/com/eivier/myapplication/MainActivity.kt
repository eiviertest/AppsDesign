package com.eivier.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nombre : String = txtNombre.text.toString()
        var edad : String = txtEdad.text.toString()
        var promedio : String = txtPromedio.text.toString()
        var ingreso : String = txtIngreso.text.toString()
        var hermanos : String = txtHermanos.text.toString()
        var folio : String = rbtgFolio.isSelected().toString()
        var mensaje : String = "Mensaje: "

        /* if (nombre==="" || edad==="" || promedio==="" || ingreso==="" || hermanos==="") {
            mensaje += "Todos los datos son obligatorios"
        } else if (nombre.length>20) {
            mensaje += "El nombre tiene demasiados caracteres"
        } else if (edad.toInt()<1 || edad.toInt()>65) {
            mensaje += "Dicha edad no es permitida"
        } else if (promedio.toInt()>100 || promedio.toInt()<1) {
            mensaje += "Este promedio no es correcto"
        } else if (ingreso.toInt()>10000 || ingreso.toInt()<1) {
            mensaje += "Ingreso familiar inválido"
        } else if (hermanos.toInt()<0 || hermanos.toInt()>20) {
            mensaje += "La cantidad de hermanos es inválida"
        } else if (folio === "") {
            mensaje += "Seleccione un folio correcto"
        } */
    }
}
