package com.example.myappanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Crear un objeto de Animacion
        val animacion: Animation = AnimationUtils.loadAnimation(this, R.anim.animacion)
        txv1.startAnimation(animacion)

    }
}
