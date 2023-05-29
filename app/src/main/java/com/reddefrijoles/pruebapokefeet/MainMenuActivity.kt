package com.reddefrijoles.pruebapokefeet

import android.Manifest
import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.provider.Settings
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.google.firebase.firestore.FirebaseFirestore
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs


enum class ProviderType {
    EMAIL,
    GOOGLE
}

class main_menu_activity : Activity(), SensorEventListener {
    private var boton: ImageButton? = null
    private var sensorManager: SensorManager? = null

    //var totalSteps : Int = 0
    var previousTotalSteps = 0f

    //var currentSteps = prefs.getcurrentSteps()
    lateinit var ivUltimoPokemon: ImageView
    lateinit var ivPenultimoPokemon: ImageView
    lateinit var ivAntepenultimoPokemon: ImageView
    lateinit var ivcasiAntePenultimoPokemon: ImageView
    lateinit var ivcasitoAntePenultimoPokemon: ImageView
    lateinit var ivAntepenultimo2Pokemon: ImageView
    private var botonLlave: ImageButton? = null
    private var botonLlaves: ImageButton? = null
    var keys = 0
    var first: Boolean = true
    var stepSensor: Sensor? = null
    var keycount: TextView? = null
    var tv_stepsTaken: TextView? = null
    var steps = 0
    var ultimoPokemon = 0
    var penultimoPokemon = 0
    var antepenultimoPokemon = 0
    var casiAntePenultimoPokemon = 0
    var casitoAntePenultimoPokemon = 0
    var antepenultimo2Pokemon = 0
    var pokemons = mutableListOf<Int>()
    var username = prefs.getUserName()
    var genero: String? = prefs.getGenero()

    private val db = FirebaseFirestore.getInstance()

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
        keycount = findViewById(R.id.keycountmain)
        tv_stepsTaken = findViewById(R.id.stepcount)
        ivUltimoPokemon = findViewById(R.id.ivUltimoPokemon)
        ivPenultimoPokemon = findViewById(R.id.ivPenultimoPokemon)
        ivAntepenultimoPokemon = findViewById(R.id.ivAntepenultimoPokemon)
        ivcasiAntePenultimoPokemon = findViewById(R.id.ivcasiAntePenultimoPokemon)
        ivcasitoAntePenultimoPokemon = findViewById(R.id.ivcasitoantePenultimoPokemon)
        ivAntepenultimo2Pokemon = findViewById(R.id.ivAntepenultimo2Pokemon)
        botonLlave = findViewById(R.id.llaveButton)
        botonLlaves = findViewById(R.id.llavesButton)
        steps = prefs.getSteps()
        keys = prefs.getKeys()
        pokemons = prefs.getPokemonsList()

        val email = prefs.getEmail()
        db.collection("users").document(email!!).get().addOnSuccessListener {
            genero = (it.get("genero").toString())
        }
        prefs.saveGenero(genero)
        ivUltimoPokemon.setOnClickListener {
            if (ultimoPokemon != 0) {
                mostrarPokemon(ultimoPokemon)
            }
        }
        ivPenultimoPokemon.setOnClickListener {
            if (penultimoPokemon != 0) {
                mostrarPokemon(penultimoPokemon)
            }
        }
        ivAntepenultimoPokemon.setOnClickListener {
            if (antepenultimoPokemon != 0) {
                mostrarPokemon(antepenultimoPokemon)
            }
        }

        ivcasiAntePenultimoPokemon.setOnClickListener {
            if (casiAntePenultimoPokemon != 0) {
                mostrarPokemon(casiAntePenultimoPokemon)
            }
        }

        ivcasitoAntePenultimoPokemon.setOnClickListener {
            if (casitoAntePenultimoPokemon != 0) {
                mostrarPokemon(casitoAntePenultimoPokemon)
            }
        }

        ivAntepenultimo2Pokemon.setOnClickListener {
            if (antepenultimo2Pokemon != 0) {
                mostrarPokemon(antepenultimo2Pokemon)
            }
        }

        botonLlave?.setOnClickListener {
            val pasosPorLlave = 50
            var steps: Int = prefs.getSteps()
            var keys: Int = prefs.getKeys()
            if (steps >= pasosPorLlave) {
                keys += 1
                val spentSteps = 1 * pasosPorLlave
                prefs.saveKeys(keys)
                prefs.saveSteps(steps - spentSteps)
                loadData()
            } else {
                Toast.makeText(
                    this,
                    "No tienes suficientes pasos, consigue al menos $pasosPorLlave",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

        botonLlaves?.setOnClickListener {
            val pasosPorLlave = 50
            var steps: Int = prefs.getSteps()
            var keys: Int = prefs.getKeys()
            val keysBought = steps / pasosPorLlave
            keys += keysBought
            val spentSteps = keysBought * pasosPorLlave
            prefs.saveKeys(keys)
            prefs.saveSteps(steps - spentSteps)
            loadData()
            if (keysBought == 0) {
                Toast.makeText(
                    this,
                    "No tienes suficientes pasos, consigue al menos $pasosPorLlave",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }


        loadData()
        //resetSteps()
        boton = findViewById(R.id.buttonMain)
        boton?.setOnClickListener {
            Opciones(this)
        }
        if (!isActivityRecognitionEnabled()) {
            requestPermissions()
        }
    }

    private fun requestPermissions() {
        // below line is use to request permission in the current activity.
        // this method is use to handle error in runtime permissions
        Dexter.withActivity(this)
            // below line is use to request the number of permissions which are required in our app.
            .withPermissions(Manifest.permission.ACTIVITY_RECOGNITION)
            // after adding permissions we are calling an with listener method.
            .withListener(object : MultiplePermissionsListener {
                override fun onPermissionsChecked(multiplePermissionsReport: MultiplePermissionsReport) {
                    // this method is called when all permissions are granted
                    if (multiplePermissionsReport.areAllPermissionsGranted()) {
                        // do you work now
                    }
                    // check for permanent denial of any permission
                    if (multiplePermissionsReport.isAnyPermissionPermanentlyDenied) {
                        // permission is denied permanently, we will show user a dialog message.
                        showSettingsDialog()
                    }
                }

                override fun onPermissionRationaleShouldBeShown(
                    list: List<PermissionRequest>,
                    permissionToken: PermissionToken
                ) {
                    // this method is called when user grants some permission and denies some of them.
                    permissionToken.continuePermissionRequest()
                }
            }).withErrorListener {
                // we are displaying a toast message for error message.
                Toast.makeText(applicationContext, "Error occurred! ", Toast.LENGTH_SHORT).show()
            }
            // below line is use to run the permissions on same thread and to check the permissions
            .onSameThread().check()
    }

    // below is the shoe setting dialog method
    // which is use to display a dialogue message.
    private fun showSettingsDialog() {
        // we are displaying an alert dialog for permissions
        val builder = AlertDialog.Builder(this@main_menu_activity)

        // below line is the title for our alert dialog.
        builder.setTitle("Need Permissions")

        // below line is our message for our dialog
        builder.setMessage("This app needs permission to use this feature. You can grant them in app settings.")
        builder.setPositiveButton("GOTO SETTINGS") { dialog, which ->
            // this method is called on click on positive button and on clicking shit button
            // we are redirecting our user from our app to the settings page of our app.
            dialog.cancel()
            // below is the intent from which we are redirecting our user.
            val intent = Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
            val uri = Uri.fromParts("package", packageName, null)
            intent.data = uri
            startActivityForResult(intent, 101)
        }
        builder.setNegativeButton("Cancel") { dialog, which ->
            // this method is called when user click on negative button.
            dialog.cancel()
        }
        // below line is used to display our dialog
        builder.show()
    }

    private fun isActivityRecognitionEnabled(): Boolean {
        sensorManager = getSystemService(Context.SENSOR_SERVICE) as SensorManager

        return sensorManager!!.isDynamicSensorDiscoverySupported()
    }

    override fun onResume() {
        super.onResume()
        first = true
        loadData()
        username = prefs.getUserName()
        pokemons = prefs.getPokemonsList()
        if (pokemons.size > 6) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            penultimoPokemon = pokemons[pokemons.size - 2]
            antepenultimoPokemon = pokemons[pokemons.size - 3]
            casiAntePenultimoPokemon = pokemons[pokemons.size - 4]
            casitoAntePenultimoPokemon = pokemons[pokemons.size - 5]
            antepenultimo2Pokemon = pokemons[pokemons.size - 6]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
            ivAntepenultimoPokemon.setImageResource(Constants.getPokemonbyId(antepenultimoPokemon)?.imagenColor!!)
            ivcasiAntePenultimoPokemon.setImageResource(
                Constants.getPokemonbyId(
                    casiAntePenultimoPokemon
                )?.imagenColor!!
            )
            ivcasitoAntePenultimoPokemon.setImageResource(
                Constants.getPokemonbyId(
                    casitoAntePenultimoPokemon
                )?.imagenColor!!
            )
            ivAntepenultimo2Pokemon.setImageResource(Constants.getPokemonbyId(antepenultimo2Pokemon)?.imagenColor!!)
        } else if (pokemons.size == 6) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            penultimoPokemon = pokemons[pokemons.size - 2]
            antepenultimoPokemon = pokemons[pokemons.size - 3]
            casiAntePenultimoPokemon = pokemons[pokemons.size - 4]
            casitoAntePenultimoPokemon = pokemons[pokemons.size - 5]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
            ivAntepenultimoPokemon.setImageResource(Constants.getPokemonbyId(antepenultimoPokemon)?.imagenColor!!)
            ivcasiAntePenultimoPokemon.setImageResource(
                Constants.getPokemonbyId(
                    casiAntePenultimoPokemon
                )?.imagenColor!!
            )
            ivcasitoAntePenultimoPokemon.setImageResource(
                Constants.getPokemonbyId(
                    casitoAntePenultimoPokemon
                )?.imagenColor!!
            )

            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        } else if (pokemons.size == 5) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            penultimoPokemon = pokemons[pokemons.size - 2]
            antepenultimoPokemon = pokemons[pokemons.size - 3]
            casiAntePenultimoPokemon = pokemons[pokemons.size - 4]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
            ivAntepenultimoPokemon.setImageResource(Constants.getPokemonbyId(antepenultimoPokemon)?.imagenColor!!)
            ivcasiAntePenultimoPokemon.setImageResource(
                Constants.getPokemonbyId(
                    casiAntePenultimoPokemon
                )?.imagenColor!!
            )

            ivcasitoAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        } else if (pokemons.size == 4) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            penultimoPokemon = pokemons[pokemons.size - 2]
            antepenultimoPokemon = pokemons[pokemons.size - 3]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
            ivAntepenultimoPokemon.setImageResource(Constants.getPokemonbyId(antepenultimoPokemon)?.imagenColor!!)

            ivcasiAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasitoAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        } else if (pokemons.size == 3) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            penultimoPokemon = pokemons[pokemons.size - 2]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)

            ivAntepenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasiAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasitoAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        } else if (pokemons.size == 2) {
            ultimoPokemon = pokemons[pokemons.size - 1]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)

            ivPenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasiAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasitoAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        } else {
            ivUltimoPokemon.setImageResource(R.drawable.pokeball)
            ivPenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasiAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivcasitoAntePenultimoPokemon.setImageResource(R.drawable.pokeball)
            ivAntepenultimo2Pokemon.setImageResource(R.drawable.pokeball)
        }

        stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        previousTotalSteps = prefs.getpreviousSteps().toFloat()
        if (stepSensor != null) {
            sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
        } else {
            Toast.makeText(this, "Sensor not found!", Toast.LENGTH_SHORT).show()
        }
        keycount?.text = keys.toString()
    }

    override fun onPause() {
        super.onPause()
        sensorManager?.unregisterListener(this)
        // Rate suitable for the user interface
        stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
        first = false
        val email = prefs.getEmail()
        if (email != null) {
            var pokemons = prefs.getPokemonsU()
            db.collection("users").document(email).set(
                hashMapOf(
                    "username" to username,
                    "genero" to genero,
                    "pokemons" to pokemons,
                    "steps" to steps,
                    "keys" to keys
                )
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        sensorManager?.unregisterListener(this)
        // Rate suitable for the user interface
        stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
        first = false
        val email = prefs.getEmail()
        if (email != null) {
            var pokemons = prefs.getPokemonsU()
            db.collection("users").document(email).set(
                hashMapOf(
                    "username" to username,
                    "genero" to genero,
                    "pokemons" to pokemons,
                    "steps" to steps,
                    "keys" to keys
                )
            )
        }
    }

    fun Opciones(pagina: Context) {
        val optionsDialog = Dialog(pagina)
        optionsDialog.setContentView(R.layout.options)
        optionsDialog.setTitle("Options hol")
        optionsDialog.show()
        /*
        val mainOption: ImageButton = optionsDialog.findViewById(R.id.ibPokeball)
        mainOption.setOnClickListener {

            val main = Intent(pagina, main_menu_activity::class.java)
            pagina.startActivity(main)
            optionsDialog.dismiss()
        }
         */

        val pokedexOption: TextView = optionsDialog.findViewById(R.id.pokedexOp)
        pokedexOption.setOnClickListener {
            val loadingPage = Intent(this, loading_page_activity::class.java)
            startActivity(loadingPage)
            Handler().postDelayed({
                val pokedex = Intent(pagina, PokedexActivity::class.java)
                pagina.startActivity(pokedex)
                optionsDialog.dismiss()
            }, 500)
        }
        val tiendaOption: TextView = optionsDialog.findViewById(R.id.tiendaOp)
        tiendaOption.setOnClickListener {
            //Toast.makeText(pagina, "fUNCIONA tienda", Toast.LENGTH_SHORT).show()
            val tienda = Intent(pagina, shop_activity::class.java)
            pagina.startActivity(tienda)
            optionsDialog.dismiss()
        }
        val perfilOption: TextView = optionsDialog.findViewById(R.id.perfilOp)
        perfilOption.setOnClickListener {
            //Toast.makeText(pagina, "fUNCIONA perfil ", Toast.LENGTH_SHORT).show()
            val perfil = Intent(pagina, profile_activity::class.java)
            pagina.startActivity(perfil)
            optionsDialog.dismiss()
        }
        val opcionesOption: TextView = optionsDialog.findViewById(R.id.opcionesOp)
        opcionesOption.setOnClickListener {
            //Toast.makeText(pagina, "fUNCIONA opcion", Toast.LENGTH_SHORT).show()
            val ajustes = Intent(pagina, settings_activity::class.java)
            pagina.startActivity(ajustes)
            optionsDialog.dismiss()
        }
    }

    override fun onSensorChanged(event: SensorEvent?) {
        // Calling the TextView that we made in activity_main.xml
        // by the id given to that TextView
        if (first) {
            if (event?.sensor?.type == Sensor.TYPE_STEP_COUNTER) {
                if (previousTotalSteps > event!!.values[0]) {
                    previousTotalSteps = event!!.values[0]
                } else if (previousTotalSteps == 0f) {
                    previousTotalSteps = event!!.values[0]
                }
                steps = prefs.getSteps()
                steps += event!!.values[0].toInt() - previousTotalSteps.toInt()
                prefs.savepreviousSteps(event!!.values[0].toInt())
                prefs.saveSteps(steps)
                changeSteps(steps)
                first = false
                sensorManager?.unregisterListener(this)
                stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR)
                sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
            }
        } else if (event?.sensor?.type == Sensor.TYPE_STEP_DETECTOR) {
            steps = prefs.getSteps()
            steps++
            prefs.saveSteps(steps)
            changeSteps(steps)
        }
    }


    fun resetSteps() {
        tv_stepsTaken?.setOnClickListener {
            // This will give a toast message if the user want to reset the steps
            prefs.saveSteps(prefs.getSteps() + 10)
            steps = prefs.getSteps()
            changeSteps(steps)
        }

        tv_stepsTaken?.setOnLongClickListener {
            // When the user will click long tap on the screen,
            // the steps will be reset to 0
            tv_stepsTaken?.text = 0.toString()
            prefs.eliminarPokemons()
            // This will save the data
            prefs.saveSteps(0)
            prefs.saveKeys(0)
            keycount?.text = 0.toString()

            true
        }
    }

    private fun loadData() {
        // In this function we will retrieve data
        keys = prefs.getKeys()
        keycount?.text = keys.toString()
        steps = prefs.getSteps()
        tv_stepsTaken?.text = steps.toString()
    }

    fun changeSteps(steps: Int) {
        tv_stepsTaken?.text = steps.toString()
    }

    override fun onAccuracyChanged(sensor: Sensor?, accuracy: Int) {

    }

    fun mostrarPokemon(id: Int) {
        val PokemonDialog = Dialog(this)
        PokemonDialog.setContentView(R.layout.pokemon_card)
        PokemonDialog.setTitle("Pokemon Card")
        PokemonDialog.show()
        val pokemons = Constants.getPokemons()

        val pokemon = pokemons.get(id - 1)
        val tvnombre = PokemonDialog.findViewById<TextView>(R.id.tvNombre)
        val ivFoto = PokemonDialog.findViewById<ImageView>(R.id.ivFoto)
        val tvType1 = PokemonDialog.findViewById<TextView>(R.id.tvTipo1)
        val tvType2 = PokemonDialog.findViewById<TextView>(R.id.tvTipo2)
        val tvId = PokemonDialog.findViewById<TextView>(R.id.tvId)
        val tvCategory = PokemonDialog.findViewById<TextView>(R.id.tvCategoria)
        val tvAltura = PokemonDialog.findViewById<TextView>(R.id.tvAltura)
        val tvPeso = PokemonDialog.findViewById<TextView>(R.id.tvPeso)
        val tvDescripcion = PokemonDialog.findViewById<TextView>(R.id.tvDescripcion)
        val vtipo1 = PokemonDialog.findViewById<View>(R.id.vTipo1)
        val vtipo2 = PokemonDialog.findViewById<View>(R.id.vTipo2)
        val vDebilidad1 = PokemonDialog.findViewById<View>(R.id.vDebilidad1)
        val vDebilidad2 = PokemonDialog.findViewById<View>(R.id.vDebilidad2)
        val vDebilidad3 = PokemonDialog.findViewById<View>(R.id.vDebilidad3)
        val vDebilidad4 = PokemonDialog.findViewById<View>(R.id.vDebilidad4)
        val vDebilidad5 = PokemonDialog.findViewById<View>(R.id.vDebilidad5)
        val vDebilidad6 = PokemonDialog.findViewById<View>(R.id.vDebilidad6)
        val vDebilidad7 = PokemonDialog.findViewById<View>(R.id.vDebilidad7)
        val tvDebilidad1 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad1)
        val tvDebilidad2 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad2)
        val tvDebilidad3 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad3)
        val tvDebilidad4 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad4)
        val tvDebilidad5 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad5)
        val tvDebilidad6 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad6)
        val tvDebilidad7 = PokemonDialog.findViewById<TextView>(R.id.tvDebilidad7)

        tvnombre.text = pokemon.nombre
        ivFoto.setImageResource(pokemon.imagenColor)
        tvType1.text = pokemon.tipo1
        vtipo1.background = ResourcesCompat.getDrawable(resources, pokemon.imagenTipo1, null)
        if (pokemon.tipo2 == "Ninguno") {
            tvType2.visibility = View.GONE
            vtipo2.visibility = View.GONE
        }
        tvType2.text = pokemon.tipo2
        vtipo2.background = ResourcesCompat.getDrawable(resources, pokemon.imagenTipo2, null)
        tvId.text = pokemon.id.toString()
        tvCategory.text = pokemon.categoria
        tvAltura.text = pokemon.altura
        tvPeso.text = pokemon.peso
        tvDescripcion.text = pokemon.descripcion

        if (pokemon.debilidad2 == "None") {
            vDebilidad2.visibility = View.GONE
            tvDebilidad2.visibility = View.GONE
            vDebilidad3.visibility = View.GONE
            tvDebilidad3.visibility = View.GONE
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
        } else if (pokemon.debilidad3 == "None") {
            vDebilidad3.visibility = View.GONE
            tvDebilidad3.visibility = View.GONE
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
        } else if (pokemon.debilidad4 == "None") {
            vDebilidad4.visibility = View.GONE
            tvDebilidad4.visibility = View.GONE
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad1.text = pokemon.debilidad1
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
        } else if (pokemon.debilidad5 == "None") {
            vDebilidad5.visibility = View.GONE
            tvDebilidad5.visibility = View.GONE
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad1.text = pokemon.debilidad1
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
        } else if (pokemon.debilidad6 == "None") {
            vDebilidad6.visibility = View.GONE
            tvDebilidad6.visibility = View.GONE
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad1.text = pokemon.debilidad1
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
        } else if (pokemon.debilidad7 == "None") {
            vDebilidad7.visibility = View.GONE
            tvDebilidad7.visibility = View.GONE
            tvDebilidad1.text = pokemon.debilidad1
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
            tvDebilidad6.text = pokemon.debilidad6
            vDebilidad6.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad6, null)
        } else {
            tvDebilidad1.text = pokemon.debilidad1
            vDebilidad1.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad1, null)
            tvDebilidad2.text = pokemon.debilidad2
            vDebilidad2.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad2, null)
            tvDebilidad3.text = pokemon.debilidad3
            vDebilidad3.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad3, null)
            tvDebilidad4.text = pokemon.debilidad4
            vDebilidad4.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad4, null)
            tvDebilidad5.text = pokemon.debilidad5
            vDebilidad5.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad5, null)
            tvDebilidad6.text = pokemon.debilidad6
            vDebilidad6.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad6, null)
            tvDebilidad7.text = pokemon.debilidad7
            vDebilidad7.background =
                ResourcesCompat.getDrawable(resources, pokemon.imagenDebilidad7, null)
        }
    }

    fun closeActivity() {
        finish()
    }

}