package com.example.practica_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager

class suscripcioncorrecta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        val ventana = this.window
        ventana.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        ventana.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        ventana.statusBarColor = this.resources.getColor(R.color.fondo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suscripcioncorrecta)
    }
}