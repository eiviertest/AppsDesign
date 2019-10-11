package mx.edu.utng.apptodoenuno


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_principal.*

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btnViaje.setOnClickListener {
            startActivity(Intent(this, ViajeActivity::class.java))
        }

        btnSalir.setOnClickListener {
            Toast.makeText(this,"Gracias por utilizar la aplicación",Toast.LENGTH_LONG).show()
            System.exit(0)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Se crea objeto para cargar menú
        val inflater: MenuInflater = menuInflater
        //Indicar el xml en donde está el menu
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        var mensaje: String=""
        //Estructura similar a switch..case
        when (item.itemId){
            R.id.itmViaje -> {
                mensaje="Has seleccionado la calculadora de viaje"
                startActivity(Intent(this, ViajeActivity::class.java))
            }
            //case R.id.itmPrestamo: ....; break;
            R.id.itmPrestamo-> mensaje="Se ha seleccionado PRESTAMO"
            R.id.itmJuego->mensaje="Se ha seleccionado JUEGO"
            R.id.itmSalir->{
                mensaje="Se ha seleccionado SALIR"
                System.exit(0)
            }
        }
        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }






}
