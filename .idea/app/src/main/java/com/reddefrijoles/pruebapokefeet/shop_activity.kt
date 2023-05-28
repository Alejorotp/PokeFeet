package com.reddefrijoles.pruebapokefeet

import android.animation.ObjectAnimator
import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.res.ResourcesCompat
import com.google.firebase.firestore.FirebaseFirestore
import com.reddefrijoles.pruebapokefeet.UserApplication.Companion.prefs

class shop_activity : Activity() {
    private var botonShop: ImageButton? = null
    private var keycount: TextView? = null
    private var comprarCofreAgua: ImageButton? = null
    private var totalPokemons: Int = 151

    //private var botonFrenesi: ImageButton? = null
    lateinit var comprarCofreFuego: ImageButton
    lateinit var comprarCofrePlanta: ImageButton
    lateinit var comprarCofreElectrico: ImageButton
    lateinit var comprarCofreRey: ImageButton
    lateinit var comprarCofreCueva: ImageButton
    lateinit var comprarCofrePradera: ImageButton
    lateinit var iv_pokemon: ImageView
    private var animatorAll: ObjectAnimator? = null
    private val animatorDuration: Long = 1000
    private var countDownTimer: CountDownTimer? = null
    private val timeLeft: Long = 2000

    private val db = FirebaseFirestore.getInstance()

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop)
        keycount = findViewById(R.id.keycountshop)
        comprarCofreAgua = findViewById(R.id.btn_comprar_agua)
        botonShop = findViewById(R.id.ibShop)
        //botonFrenesi = findViewById(R.id.frenesi)
        comprarCofreFuego = findViewById(R.id.btn_comprar_fuego)
        comprarCofrePlanta = findViewById(R.id.btn_comprar_planta)
        comprarCofreElectrico = findViewById(R.id.btn_comprar_electrico)
        comprarCofreRey = findViewById(R.id.btn_comprar_rey)
        comprarCofreCueva = findViewById(R.id.btn_comprar_cueva)
        comprarCofrePradera = findViewById(R.id.btn_comprar_pradera)
        iv_pokemon = findViewById(R.id.iv_pokemon)

        /*botonFrenesi?.setOnClickListener {
            //haremos que la imagen gire
            val angulo = 360 * 10
            val animation = android.view.animation.RotateAnimation(0f, angulo.toFloat(), 50f, 50f)
            animation.duration = 5000
            animation.fillAfter = true
            botonFrenesi?.startAnimation(animation)
        }
         */

        keycount?.text = prefs.getKeys().toString()
        botonShop?.setOnClickListener {
            finish()
        }

        comprarCofreAgua?.setOnClickListener {
            comprarPokemons("Agua")
        }
        comprarCofreFuego.setOnClickListener {
            comprarPokemons("Fuego")
        }
        comprarCofrePlanta.setOnClickListener {
            comprarPokemons("Planta")
        }
        comprarCofreElectrico.setOnClickListener {
            comprarPokemons("Eléctrico")
        }
        comprarCofreRey.setOnClickListener {
            comprarPokemons("Rey")
        }
        comprarCofreCueva.setOnClickListener {
            comprarPokemons("Cueva")
        }
        comprarCofrePradera.setOnClickListener {
            comprarPokemons("Pradera")
        }

    }

    public override fun onDestroy() {
        super.onDestroy()
        val email = prefs.getEmail()
        if (email != null) {
            var pokemons = prefs.getPokemonsU()
            var steps = prefs.getSteps()
            var keys = prefs.getKeys()
            var username = prefs.getUserName()
            var genero = prefs.getGenero()
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

    private fun Rotate() {
        animatorAll = ObjectAnimator.ofFloat(iv_pokemon, "rotation", 0f, 360 * 3f)
        animatorAll?.setDuration(animatorDuration)
        animatorAll?.start()
    }

    private fun scale_from_small() {
        animatorAll = ObjectAnimator.ofFloat(iv_pokemon, "scaleX", 0f, 2f, 1f)
        animatorAll?.setDuration(animatorDuration)
        animatorAll?.start()
    }

    private fun scale() {
        animatorAll = ObjectAnimator.ofFloat(iv_pokemon, "scaleX", 1f, 0f)
        animatorAll?.setDuration(animatorDuration)
        animatorAll?.start()
    }

    private fun Start_timer(num: Int) {
        comprarCofreAgua!!.setOnClickListener { v: View? -> }
        comprarCofreFuego!!.setOnClickListener { v: View? -> }
        comprarCofreCueva!!.setOnClickListener { v: View? -> }
        comprarCofrePlanta!!.setOnClickListener { v: View? -> }
        comprarCofrePradera!!.setOnClickListener { v: View? -> }
        comprarCofreRey!!.setOnClickListener { v: View? -> }
        comprarCofreElectrico!!.setOnClickListener { v: View? -> }

        countDownTimer = object : CountDownTimer(timeLeft, 1000) {
            override fun onTick(millisUntilFinished: Long) {}
            override fun onFinish() {
                Rotate()
                scale()
                countDownTimer = object : CountDownTimer(timeLeft, 500) {
                    override fun onTick(millisUntilFinished: Long) {}
                    override fun onFinish() {
                        iv_pokemon!!.visibility = ImageView.INVISIBLE
                        mostrarPokemon(num)
                        comprarCofreAgua!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofreFuego!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofreCueva!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofrePlanta!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofrePradera!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofreRey!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                        comprarCofreElectrico!!.setOnClickListener { v: View? ->
                            iv_pokemon!!.visibility = ImageView.VISIBLE
                            Rotate()
                            scale_from_small()
                            Start_timer(num)
                        }
                    }
                }.start()
            }
        }.start()
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

    fun comprarPokemons(tipo: String) {
        var tipo1 = tipo
        var pokemon = prefs.getPokemonsList()
        var num = pokemon[0]
        var keys: Int = prefs.getKeys()
        if (tipo == "Cueva") {
            var sw = true
            var sw1 = true
            var sw2 = true
            var sw3 = true
            var sw4 = true
            while (sw && (sw1 || sw2 || sw3 || sw4)) {
                val random = (1..4).random()
                when (random) {
                    1 -> {
                        tipo1 = "Roca"
                        sw1 = false
                    }

                    2 -> {
                        tipo1 = "Tierra"
                        sw2 = false
                    }

                    3 -> {
                        tipo1 = "Siniestro"
                        sw3 = false
                    }

                    4 -> {
                        tipo1 = "Fantasma"
                        sw4 = false
                    }
                }
                sw = !revisarPosibleCompra(tipo1)
            }
        } else if (tipo == "Pradera") {
            var sw = true
            var sw1 = true
            var sw2 = true
            var sw3 = true
            var sw4 = true
            while (sw && (sw1 || sw2 || sw3 || sw4)) {
                val random = (1..4).random()
                when (random) {
                    1 -> {
                        tipo1 = "Planta"
                        sw1 = false
                    }

                    2 -> {
                        tipo1 = "Bicho"
                        sw2 = false
                    }

                    3 -> {
                        tipo1 = "Volador"
                        sw3 = false
                    }

                    4 -> {
                        tipo1 = "Normal"
                        sw4 = false
                    }
                }
                sw = !revisarPosibleCompra(tipo1)
            }
        }
        if (keys == 0) {
            Toast.makeText(this, "No tienes llaves", Toast.LENGTH_SHORT).show()
            return
        }
        if (pokemon.size == totalPokemons + 1) {
            Toast.makeText(this, "Ya tienes todos los pokemons", Toast.LENGTH_SHORT).show()
            return
        }
        if (!revisarPosibleCompra(tipo1)) {
            Toast.makeText(this, "No hay  mas pokemons de ese tipo", Toast.LENGTH_SHORT).show()
            return
        }
        keys--
        prefs.saveKeys(keys)
        keycount?.text = prefs.getKeys().toString()

        while (pokemon.contains(num) || !pokemonTipoBoolean(tipo1, num)) {
            num = (1..totalPokemons).random()
        }
        val pokemons = Constants.getPokemons()
        val pokemonxd = pokemons.get(num - 1)
        iv_pokemon?.setImageResource(pokemonxd.imagenColor)
        iv_pokemon?.setVisibility(ImageView.VISIBLE)
        Rotate()
        scale_from_small()
        Start_timer(num)
        prefs.savePokemons(num.toString())
    }

    fun pokemonTipoBoolean(tipo: String, id: Int): Boolean {
        if (id == 0) {
            return false
        }
        if (tipo == "Rey") {
            return true
        }
        val pokemons = Constants.getPokemons()
        val pokemon = pokemons[id - 1]
        if (tipo == pokemon.tipo1 || tipo == pokemon.tipo2) {
            return true
        }

        return false
    }

    fun revisarPosibleCompra(tipo: String): Boolean {
        var pokemon = prefs.getPokemonsList()
        for (i in 1..totalPokemons) {
            if (!pokemon.contains(i) && pokemonTipoBoolean(tipo, i)) {
                return true
            }
        }
        return false
    }

}