package com.example.practica_4

import android.app.Activity
import android.view.Gravity
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

fun Toast.showCustomToast(actv: Activity, texto: String, img: Int){
    val layout = actv.layoutInflater.inflate(
        R.layout.toast,actv.findViewById(R.id.contenedor_toast)
    )
    val tex = layout.findViewById<TextView>(R.id.custom_toast_message)
    tex.text=texto
    val im = layout.findViewById<ImageView>(R.id.custom_toast_image)
    this.apply {
        setGravity(Gravity.CENTER_VERTICAL, 0 , 40)
        duration=Toast.LENGTH_SHORT
        view = layout
        show()
    }
}