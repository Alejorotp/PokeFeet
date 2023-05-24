
package com.reddefrijoles.pruebapokefeet

import android.annotation.SuppressLint
import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore

class profile_activity : Activity() {


    private var botonProfile: ImageButton? = null
    private val db = FirebaseFirestore.getInstance()

    @SuppressLint("MissingInflatedId")
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        botonProfile = findViewById(R.id.profileOptions)
        val genero = findViewById<TextView>(R.id.Genero)
        val pokemon = findViewById<TextView>(R.id.Pokemon)

        val prefs = getSharedPreferences(getString(R.string.prefs_file), Context.MODE_PRIVATE)
        val email = prefs.getString("email", null)

        if (email != null) {
            db.collection("users").document(email).get().addOnSuccessListener {
                genero.text = (it.get("genero").toString())
                pokemon.text = (it.get("pokemon").toString())
            }
        }
        botonProfile?.setOnClickListener {
            finish()
        }


    }
}