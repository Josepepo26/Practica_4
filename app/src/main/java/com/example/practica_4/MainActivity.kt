package com.example.practica_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

class MainActivity : AppCompatActivity(), FragmentsListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        this.supportRequestWindowFeature(Window.FEATURE_NO_TITLE)
        val ventana = this.window
        ventana.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        ventana.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        ventana.statusBarColor = this.resources.getColor(R.color.fondo)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val log = findViewById<Button>(R.id.login)
        val reg = findViewById<Button>(R.id.registro)

        log.setOnClickListener { replaceFragment(fragment2()) }
        reg.setOnClickListener { replaceFragment(fragment3()) }
    }
    private fun loadFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.fragments, fragment)
        fragmentTransaction.commit()
    }
    private fun replaceFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragments,fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
    override fun onClickFragmentLogin() {
        var usu = findViewById<TextView>(R.id.correo)
        var cont = findViewById<TextView>(R.id.contra)
        var bot = findViewById<Button>(R.id.acceso)
        bot.setOnClickListener {
            if (usu.text.isBlank()||cont.text.isBlank()){

            }
        }

    }
    override  fun  onClickFragmentRegistro(){
        var nom = findViewById<TextView>(R.id.nombre_reg)
        var apell = findViewById<TextView>(R.id.apellido_reg)
        var corr = findViewById<TextView>(R.id.correo_reg)
        var repcorr = findViewById<TextView>(R.id.correorep_reg)
        var contr = findViewById<TextView>(R.id.contra_reg)
        var repcontr = findViewById<TextView>(R.id.contrarep_reg)
        var bot = findViewById<Button>(R.id.registro_bot)
    }
}