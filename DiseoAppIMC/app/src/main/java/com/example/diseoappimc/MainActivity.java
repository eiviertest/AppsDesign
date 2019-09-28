package com.example.diseoappimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaracion de componentes a utlizar
    private EditText etxPeso, etxEstatura;
    private TextView txvIMC;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Asociacion de objetos; controlador con vista
        etxPeso = (EditText)findViewById(R.id.etxPeso);
        etxEstatura = (EditText)findViewById(R.id.etxEstatura);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        txvIMC = (TextView) findViewById(R.id.txvIMC);
        ImageView img = (ImageView)findViewById(R.id.imageView);

        //Manejo de evento en Java
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso = Double.parseDouble(etxPeso.getText().toString());
                double estatura = Double.parseDouble(etxEstatura.getText().toString());
                double imc = peso / (estatura * estatura);
                String mensaje = "";
                if (imc>0 && imc<19) {
                    mensaje = "Bajo peso";
                } else if (imc>19 && imc<25) {
                    mensaje = "Peso normal";
                } else if (imc>25 && imc<50) {
                    mensaje ="Sobrepeso";
                } else {
                    mensaje = "Dato inválido";
                }
                txvIMC.setText("IMC = " + imc + "\n" + mensaje);
            }
        });
    }
}
