package mx.edu.utng.apptodoenuno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_viaje.*

class ViajeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viaje)

        btnRegresaViaje.setOnClickListener {
            finish()
        }

        btnCalcular.setOnClickListener {
            var gastoTotal: Double = etxGastoTotalGas.text.toString().toDouble()
            var totalKM: Double = etxTotal.text.toString().toDouble()
            var consumoKm: Double = gastoTotal / totalKM
            var precioGas: Double = etxPrecioLt.text.toString().toDouble()
            var consumoLt: Double = consumoKm /precioGas

            txvResultado.text="El gasto por km= $${consumoKm.toString()} y " +
                    "${consumoLt.toString()} litros"

            //var cosumoCienkm: Double =
        }
    }
}
