/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		settings
	 *	@date 		Sunday 16th of April 2023 03:57:33 AM
	 *	@title 		Page 1
	 *	@author 	
	 *	@keywords 	
	 *	@generator 	Export Kit v1.3.figma
	 *
	 */
package com.reddefrijoles.pruebapokefeet

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth


class settings_activity : Activity() {
    private var botonSettings: ImageButton? = null
    private var cerrarSesion: Button? = null
    private var idioma: Button? = null
    private var privacidad: Button? = null
    private var seguridad: Button? = null
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings)

        botonSettings= findViewById(R.id.ajustesOptions)
        cerrarSesion = findViewById(R.id.tvCerrarSesion)
        idioma = findViewById(R.id.btnidioma)
        privacidad = findViewById(R.id.btnprivacidad)
        seguridad = findViewById(R.id.btnseguridad)

        botonSettings?.setOnClickListener {
            finish()
        }
        cerrarSesion?.setOnClickListener {
            LogOut()
        }
        //custom code goes here
    }

    fun LogOut (){
        // data deleting
        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE).edit()
        prefs.clear()
        prefs.apply()

        //singOut
        FirebaseAuth.getInstance().signOut()

        // back to authActivity
        showAuth()
    }

    fun showAuth(){
        val homeIntent= Intent(this,login_activity::class.java)
        startActivity(homeIntent)
        finish()
    }
}