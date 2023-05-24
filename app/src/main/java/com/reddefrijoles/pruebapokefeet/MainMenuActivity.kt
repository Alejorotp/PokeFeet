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
import android.provider.Settings
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
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
    var keys: Int = prefs.getKeys()
    var first: Boolean = true
    var stepSensor: Sensor? = null
    var keycount: TextView? = null
    var tv_stepsTaken: TextView? = null
    var steps = prefs.getSteps()
    var activated = prefs.getActivated()
    var ultimoPokemon = 0
    var penultimoPokemon = 0
    var antepenultimoPokemon = 0

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_menu)
        keycount = findViewById(R.id.keycountmain)
        tv_stepsTaken = findViewById(R.id.stepcount)
        ivUltimoPokemon = findViewById(R.id.ivUltimoPokemon)
        ivPenultimoPokemon = findViewById(R.id.ivPenultimoPokemon)
        ivAntepenultimoPokemon = findViewById(R.id.ivAntepenultimoPokemon)
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


        loadData()
        resetSteps()
        keycount?.text = keys.toString()
        tv_stepsTaken?.text = steps.toString()
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
        keycount?.text = prefs.getKeys().toString()
        val pokemones = prefs.getPokemonsList()
        if (pokemones.size > 3) {
            ultimoPokemon = pokemones[pokemones.size - 1]
            penultimoPokemon = pokemones[pokemones.size - 2]
            antepenultimoPokemon = pokemones[pokemones.size - 3]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
            ivAntepenultimoPokemon.setImageResource(Constants.getPokemonbyId(antepenultimoPokemon)?.imagenColor!!)
        } else if (pokemones.size == 3) {
            ultimoPokemon = pokemones[pokemones.size - 1]
            penultimoPokemon = pokemones[pokemones.size - 2]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
            ivPenultimoPokemon.setImageResource(Constants.getPokemonbyId(penultimoPokemon)?.imagenColor!!)
        } else if (pokemones.size == 2) {
            ultimoPokemon = pokemones[pokemones.size - 1]
            ivUltimoPokemon.setImageResource(Constants.getPokemonbyId(ultimoPokemon)?.imagenColor!!)
        } else {
            ivUltimoPokemon.setImageResource(R.drawable.pokeball)
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
    }

    override fun onDestroy() {
        super.onDestroy()
        sensorManager?.unregisterListener(this)
        // Rate suitable for the user interface
        stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_COUNTER)
        sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
        first = false

    }

    fun Opciones(pagina: Context) {
        //val Prueba = prueba as Context
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

            val pokedex = Intent(pagina, PokedexActivity::class.java)
            pagina.startActivity(pokedex)
            optionsDialog.dismiss()
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
        if (event?.sensor?.type == Sensor.TYPE_STEP_DETECTOR) {
            steps = prefs.getSteps()
            steps++
            prefs.saveSteps(steps)
            changeSteps(steps)
        } else {
            // This will help us to get the steps when the user is outside the app
            if (first) {
                if (previousTotalSteps > event!!.values[0]){
                    previousTotalSteps = event!!.values[0]
                }
                steps = prefs.getSteps()
                steps += event!!.values[0].toInt() - previousTotalSteps.toInt()
                prefs.savepreviousSteps(event!!.values[0].toInt())
                prefs.saveSteps(steps)
                changeSteps(steps)
                first = false
                stepSensor = sensorManager?.getDefaultSensor(Sensor.TYPE_STEP_DETECTOR)
                sensorManager?.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI)
            }
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

        tvnombre.text = pokemon.nombre
        ivFoto.setImageResource(pokemon.imagenColor)
        tvType1.text = pokemon.tipo1
        vtipo1.setBackgroundColor(pokemon.imagenTipo1)
        tvType2.text = pokemon.tipo2
        vtipo2.setBackgroundColor(pokemon.imagenTipo2)
        tvId.text = pokemon.id.toString()
        tvCategory.text = pokemon.categoria
        tvAltura.text = pokemon.altura
        tvPeso.text = pokemon.peso
        tvDescripcion.text = pokemon.descripcion




    }

}