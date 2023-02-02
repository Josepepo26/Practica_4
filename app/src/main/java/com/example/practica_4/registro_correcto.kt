package com.example.practica_4

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text

class registro_correcto : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        val ventana = this.window
        ventana.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        ventana.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        ventana.statusBarColor = this.resources.getColor(R.color.fondo)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro_correcto)

        val nombre = intent.extras?.getString("nombre")
        val texto = findViewById<TextView>(R.id.texto)
        texto.setText(getText(R.string.bienv).toString()+" "+nombre)
        val bot1 = findViewById<Button>(R.id.newsleter)
        bot1.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            //Asignacion de vista ("se infla" la vista correspondiente)
            val view = layoutInflater.inflate(R.layout.alert,null)
            //Paso de la vista al builder
            builder.setView(view)
            //Creacion de alertDialog
            val dialog = builder.create()
            dialog.show()
            //Muestra de alertDialog
            //Cajas de texto y boton del alertDialog : creacion en kotlin y asignacion de los elementos xml correspondientes
            val semana = view.findViewById<RadioButton>(R.id.botsemana)
            val dia = view.findViewById<RadioButton>(R.id.botdia)


            val acept = view.findViewById<Button>(R.id.botaccept)
            val cancel = view.findViewById<Button>(R.id.botcanc)
        }

    }
}