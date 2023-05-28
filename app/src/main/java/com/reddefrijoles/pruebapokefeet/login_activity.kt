/*
	 *	This content is generated from the API File Info.
	 *	(Alt+Shift+Ctrl+I).
	 *
	 *	@desc 		
	 *	@file 		login
	 *	@date 		Friday 07th of April 2023 06:29:50 PM
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
import android.os.Handler
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.GoogleAuthProvider
import com.google.firebase.firestore.FirebaseFirestore
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class login_activity : Activity() {

    private lateinit var t_password: EditText
    private lateinit var t_email: EditText
    private lateinit var olvidarCon: Button

    private var iniciar: Button? = null

    private val GOOGLE_SIGN_IN =100

    private val db = FirebaseFirestore.getInstance()


    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        t_password = findViewById(R.id.etPasswordL)
        t_email = findViewById(R.id.etNombreL)
        olvidarCon= findViewById(R.id.btnOlvidarPassword)
        iniciar = findViewById(R.id.btnIniciarSesion)

        Session()

        iniciar?.setOnClickListener {

            var email:String=t_email.text.toString()
            var password:String=t_password.text.toString()

            if(!email.isEmpty() && !password.isEmpty()){
                FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful){
                        prefs.saveEmail(email)
                        prefs.saveUserName(email)
                        var steps = 0
                        var keys = 0
                        var pokemons = ""
                        db.collection("users").document(email).get().addOnSuccessListener {
                            steps = it.get("steps").toString().toInt()
                            prefs.saveSteps(steps)
                            keys = it.get("keys").toString().toInt()
                            prefs.saveKeys(keys)
                            pokemons = it.get("pokemons").toString()
                            prefs.savePokemonsDB(pokemons)
                        }
                        val loadingPage = Intent(this, loading_page_activity::class.java)
                        startActivity(loadingPage)
                        finish()
                        Handler().postDelayed({
                            showHome(email)
                        }, 1500)
                    } else {
                        showAlert()
                    }
                }
            }else{
                Toast.makeText(this,"Fields can't be empty", Toast.LENGTH_SHORT).show()
            }
        }


        olvidarCon?.setOnClickListener {
            val loadingPage = Intent(this, signup_activity::class.java)
            startActivity(loadingPage)
            finish()
        }

    }

    // Google session
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode==GOOGLE_SIGN_IN){
            val task= GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                val account = task.getResult(ApiException::class.java)
                if(account != null){
                    val credential= GoogleAuthProvider.getCredential(account.idToken, null)
                    FirebaseAuth.getInstance().signInWithCredential(credential).addOnCompleteListener {
                        if (it.isSuccessful){
                            Toast.makeText(this,"Sesion iniciada correctamente", Toast.LENGTH_SHORT).show()
                            showHome(account.email ?:"")
                        }else{
                            showAlert()
                        }
                    }
                }
            }catch (e: ApiException){
                showAlert()
            }

        }
    }

    // Google button
    fun Google (View: View){

        // settings
        val googleConf= GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken("786247387395-37td4l0m34rnjghghv9n5ui1dupctqao.apps.googleusercontent.com")
            .requestEmail().build()

        // Google client
        val googleClient= GoogleSignIn.getClient(this,googleConf)
        googleClient.signOut()
        startActivityForResult(googleClient.signInIntent, GOOGLE_SIGN_IN)

    }

    // prefs to keep session open
    fun Session(){
        val email: String? = prefs.getEmail()
        if(email != "None"){
            showHome(email)
        }
    }

    fun showHome(email:String?){
        val homeIntent= Intent(this,main_menu_activity::class.java)
        startActivity(homeIntent)
        finish()
    }

    // Exception alert
    fun showAlert(){
        val builder =  AlertDialog.Builder(this)
        builder.setTitle("Error")
        builder.setMessage("Error al Autenticar")
        builder.setPositiveButton("Aceptar",null)
        val dialog: AlertDialog =builder.create()
        dialog.show()
    }
}