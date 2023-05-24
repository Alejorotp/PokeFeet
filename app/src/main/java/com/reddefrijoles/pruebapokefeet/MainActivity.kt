package com.reddefrijoles.pruebapokefeet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // database
        //val db = FirebaseFirestore.getInstance()
        setContentView(R.layout.activity_main)



        val text3: TextView = findViewById(R.id.tvTitulo)
        val text1: TextView = findViewById(R.id.tvRedFrijoles)
        val text2: TextView = findViewById(R.id.tvDe)
        val foto:ImageView = findViewById(R.id.ivInicio)
        //Animaciones
        val animacion1 = AnimationUtils.loadAnimation(this, R.anim.desplazamineto_arriba)
        val animacion2 = AnimationUtils.loadAnimation(this, R.anim.desplazamineto_abajo)

        text1!!.animation = animacion2
        text2!!.animation = animacion2
        foto!!.animation = animacion1
        text3!!.animation = animacion1
        Handler().postDelayed({
            val loadingPage = Intent(this, loading_page_activity::class.java)
            startActivity(loadingPage)
            finish()
        }, 4000)



    }
}