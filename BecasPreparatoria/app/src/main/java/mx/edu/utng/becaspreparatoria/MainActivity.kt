package mx.edu.utng.becaspreparatoria

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.graphics.PorterDuff
import android.os.Handler
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    var x=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnEnviar.setOnClickListener {
            x=0

            //Valudacion de campo de nombre
            x += if (edNom.text.isEmpty()|| edNom.text.length<2 || edNom.text.length >15) {
                val drawable = edNom.background
                drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP)
                0
            }else{
                val drawable = edNom.background
                drawable.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP)
                1
            }

            //Validacion de campo de Apellido
            x += if (edApe.text.isEmpty()|| edApe.text.length <2|| edApe.text.length>15) {
                val drawable = edApe.background
                drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP)
                0
            }else{
                val drawable = edApe.background
                drawable.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP)
                1
            }

           // Toast.makeText(this,""+edEdad.text.toString().toInt(),Toast.LENGTH_LONG).show()

            //Validacion de campo de Edad
            x += if (edEdad.text.isEmpty()|| edEdad.text.toString().toInt()<16||edEdad.text.toString().toInt()>45) {
                val drawable = edEdad.background
                drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP)
                0
            }else{
                val drawable = edEdad.background
                drawable.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP)
                1
            }

            //Validacion de campo de Ingreso Familiar
            x+=if (edIngreso.text.isEmpty()|| edIngreso.text.toString().toInt()<1000||edIngreso.text.toString().toInt()>7000) {
                val drawable = edIngreso.background
                drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP)
                0
            }else{
                val drawable = edIngreso.background
                drawable.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP)
                1
            }



            //Validacion de Promedio(RadioGroup/RadioButton)
            if (rbB.isChecked || rbMB.isChecked || rbE.isChecked) {
                txtPromedio.setTextColor(Color.GRAY)
                rdAcc()
            } else {
                txtPromedio.setTextColor(Color.RED)
            }

            if(edFolio.text.toString() == "1218100471"){
                if(x==5){
                    Toast.makeText(this,"Si puede recibir una beca",Toast.LENGTH_LONG).show()
                }else{
                    Toast.makeText(this,"No puede recibir una beca",Toast.LENGTH_LONG).show()
                }
            }else{
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setTitle("Seguridad")
                alertDialogBuilder.setMessage("Usted no peretenece a la institucion")

                alertDialogBuilder.setPositiveButton(android.R.string.yes) { dialog, which ->
                    finish()
                }

                alertDialogBuilder.setNegativeButton(android.R.string.no) { dialog, which ->
                    finish()
                }

                alertDialogBuilder.show()
                Handler().postDelayed({ finish()
                },5000)

            }



        }
    }

    //Metodo de selecion de RadioButton
     fun rdAcc(){
        when(rdG.checkedRadioButtonId){
            2131165314 -> x+=1
            2131165316 -> x+=1
            2131165315 -> {
                if(edHermanos.text.toString().toInt()>1){
                    val drawable = edIngreso.background
                    drawable.setColorFilter(Color.GRAY, PorterDuff.Mode.SRC_ATOP)
                    x+=1
                }else if(edHermanos.text.toString().toInt()<=1){
                    val drawable = edIngreso.background
                    drawable.setColorFilter(Color.BLUE, PorterDuff.Mode.SRC_ATOP)
                    x+=0
                }
            }
        }
    }

    fun Hermano(){
        if(edHermanos.text.isEmpty()||edHermanos.text.toString().toInt()<0||edHermanos.text.toString().toInt()>5){
            x=0
            val drawable = edHermanos.background
            drawable.setColorFilter(Color.RED, PorterDuff.Mode.SRC_ATOP)
        }else{
            x=1
        }
    }


}
    //Click individuales
        /*
            private fun radioDec(){
                rbB.setOnClickListener {
                    Toast.makeText(this,"Se presiono uno",Toast.LENGTH_SHORT).show()
                }
                rbMB.setOnClickListener {
                    Toast.makeText(this,"Se presiono dos",Toast.LENGTH_SHORT).show()
                }
                rbE.setOnClickListener {
                    Toast.makeText(this,"Se presiono tres",Toast.LENGTH_SHORT).show()
                }
                */

