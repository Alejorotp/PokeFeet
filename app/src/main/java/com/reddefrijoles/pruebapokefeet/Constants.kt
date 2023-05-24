package com.reddefrijoles.pruebapokefeet

object Constants {

  fun getPokemonbyId(id: Int): Pokemon? {
    val Pokemons = getPokemons()
    for (pokemon in Pokemons) {
      if (pokemon.id == id) {
        return pokemon
      }
    }
    return null
  }
    fun getPokemons(): ArrayList<Pokemon> {
        val Pokemons = ArrayList<Pokemon>()

        //las debilidades son solo de la primera generación

        Pokemons.add(
            Pokemon(
                1,
                "Bulbasaur",
                R.drawable.bulbasaur_color,
                R.drawable.bulbasaur_black,
                "Semilla",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "0.7 m",
                "6.9 kg",
                "Este Pokémon nace con una semilla en el lomo, que brota con el paso del tiempo.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                2,
                "Ivysaur",
                R.drawable.ivysaur_color,
                R.drawable.ivysaur_black,
                "Semilla",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "1.0 m",
                "13.0 kg",
                "Cuando le crece bastante el bulbo del lomo, pierde la capacidad de erguirse sobre las patas traseras.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                3,
                "Venusaur",
                R.drawable.venusaur_color,
                R.drawable.venusaur_black,
                "Semilla",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "2.0 m",
                "100.0 kg",
                "La planta florece cuando absorbe energía solar, lo cual le obliga a buscar siempre la luz del sol.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                4,
                "Charmander",
                R.drawable.charmander_color,
                R.drawable.charmander_black,
                "Lagartija",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "0.6 m",
                "8.5 kg",
                "Prefiere las cosas calientes. Dicen que cuando llueve le sale vapor de la punta de la cola.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                5,
                "Charmeleon",
                R.drawable.charmeleon_color,
                R.drawable.charmeleon_black,
                "Llama",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.1 m",
                "19.0 kg",
                "Cuando lucha contra un enemigo poderoso, la llama de la punta de la cola le arde con más fuerza.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                6,
                "Charizard",
                R.drawable.charizard_color,
                R.drawable.charizard_black,
                "Llama",
                "Fuego",
                "Volador",
                R.drawable.fuego,
                R.drawable.volador,
                "1.7 m",
                "90.5 kg",
                "Escupe un fuego tan caliente que funde las rocas. Causa incendios forestales sin querer.",
                "Agua",
                R.drawable.agua,
                "Eléctrico",
                R.drawable.electrico,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                7,
                "Squirtle",
                R.drawable.squirtle_color,
                R.drawable.squirtle_black,
                "Tortuguita",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.5 m",
                "9.0 kg",
                "Cuando retrae su largo cuello en el caparazón, dispara agua a una presión increíble.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                8,
                "Wartortle",
                R.drawable.wartortle_color,
                R.drawable.wartortle_black,
                "Tortuga",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.0 m",
                "22.5 kg",
                "Se lo considera un símbolo de longevidad. Los ejemplares más ancianos tienen musgo sobre el caparazón.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                9,
                "Blastoise",
                R.drawable.blastoise_color,
                R.drawable.blastoise_black,
                "Armazón",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.6 m",
                "85.5 kg",
                "Para acabar con su enemigo, lo aplasta con el peso de su cuerpo. En momentos de apuro, se esconde en el caparazón.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                10,
                "Caterpie",
                R.drawable.caterpie_color,
                R.drawable.caterpie_black,
                "Gusano",
                "Bicho",
                "Ninguno",
                R.drawable.bicho,
                R.drawable.ninguno,
                "0.3 m",
                "2.9 kg",
                "Para protegerse, despide un hedor horrible por las antenas con el que repele hasta al enemigo más feroz.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                11,
                "Metapod",
                R.drawable.metapod_color,
                R.drawable.metapod_black,
                "Capullo",
                "Bicho",
                "Ninguno",
                R.drawable.bicho,
                R.drawable.ninguno,
                "0.7 m",
                "9.9 kg",
                "Su caparazón es tan duro como una roca. Cuando se siente amenazado, se queda inmóvil.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                12,
                "Butterfree",
                R.drawable.butterfree_color,
                R.drawable.butterfree_black,
                "Mariposa",
                "Bicho",
                "Volador",
                R.drawable.bicho,
                R.drawable.volador,
                "1.1 m",
                "32.0 kg",
                "En las alas tiene unas escamas que esparce como polvo. Si las toca alguien con alergia, le provocará estornudos.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                13,
                "Weedle",
                R.drawable.weedle_color,
                R.drawable.weedle_black,
                "Oruga",
                "Bicho",
                "Veneno",
                R.drawable.bicho,
                R.drawable.veneno,
                "0.3 m",
                "3.2 kg",
                "El aguijón de la cabeza es muy puntiagudo. Se alimenta de hojas oculto en la espesura de bosques y praderas.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                14,
                "Kakuna",
                R.drawable.kakuna_color,
                R.drawable.kakuna_black,
                "Capullo",
                "Bicho",
                "Veneno",
                R.drawable.bicho,
                R.drawable.veneno,
                "0.6 m",
                "10.0 kg",
                "Aunque es casi incapaz de moverse, en caso de sentirse amenazado puede envenenar a los enemigos con su aguijón.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                15,
                "Beedrill",
                R.drawable.beedrill_color,
                R.drawable.beedrill_black,
                "Abeja",
                "Bicho",
                "Veneno",
                R.drawable.bicho,
                R.drawable.veneno,
                "1.0 m",
                "29.5 kg",
                "Tiene tres aguijones venenosos en las patas traseras y uno en el morro. Son muy venenosos.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                16,
                "Pidgey",
                R.drawable.pidgey_color,
                R.drawable.pidgey_black,
                "Pajarito",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "0.3 m",
                "1.8 kg",
                "Le gusta comer insectos. En primavera, cuando escasean, se le puede ver revoloteando en busca de comida.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                17,
                "Pidgeotto",
                R.drawable.pidgeotto_color,
                R.drawable.pidgeotto_black,
                "Pájaro",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "1.1 m",
                "30.0 kg",
                "Este Pokémon es muy dócil. Si se le ataca en pleno vuelo, contraataca con sus afiladas garras.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                18,
                "Pidgeot",
                R.drawable.pidgeot_color,
                R.drawable.pidgeot_black,
                "Pájaro",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "1.5 m",
                "39.5 kg",
                "Este Pokémon vuela a una velocidad de 2 mach en busca de presas. Sus grandes garras son armas muy peligrosas.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                19,
                "Rattata",
                R.drawable.rattata_color,
                R.drawable.rattata_black,
                "Ratón",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.3 m",
                "3.5 kg",
                "Es muy común en casi todo el mundo. Es muy dócil, pero se pone muy agresivo si se le ataca.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                20,
                "Raticate",
                R.drawable.raticate_color,
                R.drawable.raticate_black,
                "Ratón",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.7 m",
                "18.5 kg",
                "Gracias a las pequeñas membranas de las patas traseras, puede nadar por los ríos para capturar presas.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                21,
                "Spearow",
                R.drawable.spearow_color,
                R.drawable.spearow_black,
                "Pajarito",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "0.3 m",
                "2.0 kg",
                "A la hora de proteger su territorio, compensa su incapacidad para volar a gran altura con una increíble velocidad.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                22,
                "Fearow",
                R.drawable.fearow_color,
                R.drawable.fearow_black,
                "Pico",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "1.2 m",
                "38.0 kg",
                "Este Pokémon ha existido desde tiempos remotos. Al menor atisbo de peligro, alza el vuelo y huye.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                23,
                "Ekans",
                R.drawable.ekans_color,
                R.drawable.ekans_black,
                "Serpiente",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "2.0 m",
                "6.9 kg",
                "La longitud de este Pokémon aumenta con el tiempo. Por la noche, se enrosca en las ramas de los árboles para descansar.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                24,
                "Arbok",
                R.drawable.arbok_color,
                R.drawable.arbok_black,
                "Cobra",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "3.5 m",
                "65.0 kg",
                "Se han llegado a identificar hasta seis variaciones distintas de los espeluznantes dibujos de su piel.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                25,
                "Pikachu",
                R.drawable.pikachu_color,
                R.drawable.pikachu_black,
                "Ratón",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "0.4 m",
                "6.0 kg",
                "Cuando se enfada, este Pokémon descarga la energía que almacena en el interior de las bolsas de las mejillas.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                26,
                "Raichu",
                R.drawable.raichu_color,
                R.drawable.raichu_black,
                "Ratón",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "0.8 m",
                "30.0 kg",
                "Su cola actúa como toma de tierra y descarga electricidad al suelo, lo que le protege de los calambrazos.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                27,
                "Sandshrew",
                R.drawable.sandshrew_color,
                R.drawable.sandshrew_black,
                "Ratón",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "0.6 m",
                "12.0 kg",
                "Le gusta revolcarse por la arena seca para eliminar todo rastro de suciedad y humedad en la piel.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                28,
                "Sandslash",
                R.drawable.sandslash_color,
                R.drawable.sandslash_black,
                "Ratón",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "1.0 m",
                "29.5 kg",
                "Cuanto más seco es el terreno en el que habita, más duras y lisas se vuelven las púas que le recubren la espalda.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                29,
                "Nidoran♀",
                R.drawable.nidoranf_color,
                R.drawable.nidoranf_black,
                "Pin Veneno",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.4 m",
                "7.0 kg",
                "Posee un olfato más fino que los Nidoran♂. Usa los bigotes para percibir la dirección del viento y buscar comida a sotavento de sus depredadores.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                30,
                "Nidorina",
                R.drawable.nidorina_color,
                R.drawable.nidorina_black,
                "Pin Veneno",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.8 m",
                "20.0 kg",
                "Se cree que el cuerno de la frente se le ha atrofiado para evitar herir a sus crías al alimentarlas.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                31,
                "Nidoqueen",
                R.drawable.nidoqueen_color,
                R.drawable.nidoqueen_black,
                "Taladro",
                "Veneno",
                "Tierra",
                R.drawable.veneno,
                R.drawable.tierra,
                "1.3 m",
                "60.0 kg",
                "Su defensa destaca sobre la capacidad ofensiva. Usa las escamas del cuerpo como una coraza para proteger a su prole de cualquier ataque.",
                "Psíquico",
                R.drawable.psiquico,
                "Hielo",
                R.drawable.hielo,
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                32,
                "Nidoran♂",
                R.drawable.nidoranm_color,
                R.drawable.nidoranm_black,
                "Pin Veneno",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.5 m",
                "9.0 kg",
                "Mantiene sus grandes orejas levantadas, siempre alerta. Si advierte peligro, ataca inoculando una potente toxina con su cuerno frontal.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                33,
                "Nidorino",
                R.drawable.nidorino_color,
                R.drawable.nidorino_black,
                "Pin Veneno",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.9 m",
                "19.5 kg",
                "Dondequiera que va, parte rocas con su cuerno, más duro que un diamante, en busca de una Piedra Lunar.",
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                34,
                "Nidoking",
                R.drawable.nidoking_color,
                R.drawable.nidoking_black,
                "Taladro",
                "Veneno",
                "Tierra",
                R.drawable.veneno,
                R.drawable.tierra,
                "1.4 m",
                "62.0 kg",
                "Una vez que se desboca, no hay quien lo pare. Solo se calma ante Nidoqueen, su compañera de toda la vida.",
                "Psíquico",
                R.drawable.psiquico,
                "Hielo",
                R.drawable.hielo,
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                35,
                "Clefairy",
                R.drawable.clefairy_color,
                R.drawable.clefairy_black,
                "Hada",
                "Hada",
                "Ninguno",
                R.drawable.hada,
                R.drawable.ninguno,
                "0.6 m",
                "7.5 kg",
                "Se dice que la felicidad llegará a quien vea un grupo de Clefairy bailando a la luz de la luna llena.",
                "Acero",
                R.drawable.acero,
                "Veneno",
                R.drawable.veneno,
            )
        )

        Pokemons.add(
            Pokemon(
                36,
                "Clefable",
                R.drawable.clefable_color,
                R.drawable.clefable_black,
                "Hada",
                "Hada",
                "Ninguno",
                R.drawable.hada,
                R.drawable.ninguno,
                "1.3 m",
                "40.0 kg",
                "Este Pokémon de aspecto feérico, raramente visto por los humanos, corre a esconderse en cuanto detecta que hay alguien cerca.",
                "Acero",
                R.drawable.acero,
                "Veneno",
                R.drawable.veneno,
            )
        )

        Pokemons.add(
            Pokemon(
                37,
                "Vulpix",
                R.drawable.vulpix_color,
                R.drawable.vulpix_black,
                "Zorro",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "0.6 m",
                "9.9 kg",
                "De pequeño, tiene seis colas de gran belleza. A medida que crece, le van saliendo más.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                38,
                "Ninetales",
                R.drawable.ninetales_color,
                R.drawable.ninetales_black,
                "Zorro",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.1 m",
                "19.9 kg",
                "Cuentan que llega a vivir hasta mil años y que cada una de las colas posee poderes sobrenaturales.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                39,
                "Jigglypuff",
                R.drawable.jigglypuff_color,
                R.drawable.jigglypuff_black,
                "Globo",
                "Normal",
                "Hada",
                R.drawable.normal,
                R.drawable.hada,
                "0.5 m",
                "5.5 kg",
                "Cuando le tiemblan sus redondos y adorables ojos, entona una melodía agradable y misteriosa con la que duerme a sus enemigos.",
                "Acero",
                R.drawable.acero,
                "Veneno",
                R.drawable.veneno,
            )
        )

        Pokemons.add(
            Pokemon(
                40,
                "Wigglytuff",
                R.drawable.wigglytuff_color,
                R.drawable.wigglytuff_black,
                "Globo",
                "Normal",
                "Hada",
                R.drawable.normal,
                R.drawable.hada,
                "1.0 m",
                "12.0 kg",
                "Tiene un pelaje muy fino. Se recomienda no enfadarlo, o se inflará y golpeará con todo su cuerpo.",
                "Acero",
                R.drawable.acero,
                "Veneno",
                R.drawable.veneno,
            )
        )

        Pokemons.add(
            Pokemon(
                41,
                "Zubat",
                R.drawable.zubat_color,
                R.drawable.zubat_black,
                "Murciélago",
                "Veneno",
                "Volador",
                R.drawable.veneno,
                R.drawable.volador,
                "0.8 m",
                "7.5 kg",
                "Emite ultrasonidos por la boca para formar imágenes en su cabeza. Es como si viera en la oscuridad.",
                "Psíquico",
                R.drawable.psiquico,
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                42,
                "Golbat",
                R.drawable.golbat_color,
                R.drawable.golbat_black,
                "Murciélago",
                "Veneno",
                "Volador",
                R.drawable.veneno,
                R.drawable.volador,
                "1.6 m",
                "55.0 kg",
                "Le encanta chuparles la sangre a los seres vivos. En ocasiones comparte la preciada colecta con otros congéneres hambrientos.",
                "Psíquico",
                R.drawable.psiquico,
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                43,
                "Oddish",
                R.drawable.oddish_color,
                R.drawable.oddish_black,
                "Hierbajo",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "0.5 m",
                "5.4 kg",
                "Cuando hace mucho sol, pierde fuerza. Por la noche, se pone a absorber nutrientes de la tierra con todo el cuerpo.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                44,
                "Gloom",
                R.drawable.gloom_color,
                R.drawable.gloom_black,
                "Hierbajo",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "0.8 m",
                "8.6 kg",
                "Tiene un olor tan fétido que repele a cualquiera. Por la noche, se le puede ver comiendo la hierba que crece en los campos.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                45,
                "Vileplume",
                R.drawable.vileplume_color,
                R.drawable.vileplume_black,
                "Flor",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "1.2 m",
                "18.6 kg",
                "Cuando florece, desprende un olor tan penetrante que nadie se le acerca. Sin embargo, atrae a los insectos con su dulce polen.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                46,
                "Paras",
                R.drawable.paras_color,
                R.drawable.paras_black,
                "Seta",
                "Bicho",
                "Planta",
                R.drawable.bicho,
                R.drawable.planta,
                "0.3 m",
                "5.4 kg",
                "Vive en bosques húmedos. El hongo que tiene en la espalda absorbe los nutrientes que le da el Pokémon.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
                "Roca",
                R.drawable.roca,
                "Bicho",
                R.drawable.bicho,
            )
        )

        Pokemons.add(
            Pokemon(
                47,
                "Parasect",
                R.drawable.parasect_color,
                R.drawable.parasect_black,
                "Seta",
                "Bicho",
                "Planta",
                R.drawable.bicho,
                R.drawable.planta,
                "1.0 m",
                "29.5 kg",
                "El hongo que tiene en la espalda le absorbe la energía. El Pokémon se debilita si se le cae el hongo.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
                "Roca",
                R.drawable.roca,
                "Bicho",
                R.drawable.bicho,
            )
        )

        Pokemons.add(
            Pokemon(
                48,
                "Venonat",
                R.drawable.venonat_color,
                R.drawable.venonat_black,
                "Insecto",
                "Bicho",
                "Veneno",
                R.drawable.bicho,
                R.drawable.veneno,
                "1.0 m",
                "30.0 kg",
                "Rezuma veneno por todo su cuerpo. De noche, atrapa y come pequeños Pokémon insecto atraídos por la luz.",
                "Psíquico",
                R.drawable.psiquico,
                "Fuego",
                R.drawable.fuego,
                "volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                49,
                "Venomoth",
                R.drawable.venomoth_color,
                R.drawable.venomoth_black,
                "Polilla venenosa",
                "Bicho",
                "Veneno",
                R.drawable.bicho,
                R.drawable.veneno,
                "1.5 m",
                "12.5 kg",
                "Las escamas que tiene en las alas desprenden un polvo venenoso. Si se le caen, las vuelve a regenerar enseguida.",
                "Psíquico",
                R.drawable.psiquico,
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                50,
                "Diglett",
                R.drawable.diglett_color,
                R.drawable.diglett_black,
                "Topo",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "0.2 m",
                "0.8 kg",
                "Vive bajo tierra. Se le puede ver asomando la cabeza por el suelo en zonas de tierra removida.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                51,
                "Dugtrio",
                R.drawable.dugtrio_color,
                R.drawable.dugtrio_black,
                "Topo",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "0.7 m",
                "33.3 kg",
                "Sus tres cabezas suben y bajan para remover la tierra cercana y facilitar así la excavación.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                52,
                "Meowth",
                R.drawable.meowth_color,
                R.drawable.meowth_black,
                "Gato Araña",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.4 m",
                "4.2 kg",
                "Durante el día, se dedica a dormir. De noche, vigila su territorio con un brillo en los ojos..",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                53,
                "Persian",
                R.drawable.persian_color,
                R.drawable.persian_black,
                "Gato Fino",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "1.0 m",
                "32.0 kg",
                "Es muy orgulloso y no se le acerca nadie que no sea su Entrenador. Si se le acerca un desconocido, le ataca con sus afiladas garras.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                54,
                "Psyduck",
                R.drawable.psyduck_color,
                R.drawable.psyduck_black,
                "Pato",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.8 m",
                "19.6 kg",
                "Siempre tiene dolor de cabeza. Cuando le duele, se le activa un poder misterioso.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                55,
                "Golduck",
                R.drawable.golduck_color,
                R.drawable.golduck_black,
                "Pato",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.7 m",
                "76.6 kg",
                "Es un Pokémon muy rápido. Nada con elegancia gracias a sus aletas palmeadas.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                56,
                "Mankey",
                R.drawable.mankey_color,
                R.drawable.mankey_black,
                "Mono Cerdo",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "0.5 m",
                "28.0 kg",
                "Es muy agresivo. No deja de saltar y de dar golpes. Los Entrenadores que lo tienen deben tener mucho cuidado.",
                "Psíquico",
                R.drawable.psiquico,
                "Volador",
                R.drawable.volador,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                57,
                "Primeape",
                R.drawable.primeape_color,
                R.drawable.primeape_black,
                "Mono Cerdo",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "1.0 m",
                "32.0 kg",
                "Es muy agresivo. No deja de saltar y de dar golpes. Los Entrenadores que lo tienen deben tener mucho cuidado.",
                "Psíquico",
                R.drawable.psiquico,
                "Volador",
                R.drawable.volador,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                58,
                "Growlithe",
                R.drawable.growlithe_color,
                R.drawable.growlithe_black,
                "Perrito",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "0.7 m",
                "19.0 kg",
                "Es muy fiel a su Entrenador. Es capaz de distinguir entre los buenos y los malos.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                59,
                "Arcanine",
                R.drawable.arcanine_color,
                R.drawable.arcanine_black,
                "Llama",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.9 m",
                "155.0 kg",
                "Cuenta un antiguo pergamino que la gente se quedaba fascinada al verlo correr por las praderas.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                60,
                "Poliwag",
                R.drawable.poliwag_color,
                R.drawable.poliwag_black,
                "Renacuajo",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.6 m",
                "12.4 kg",
                "Es más ágil en el agua que en la tierra. La espiral de su vientre no es más que parte de sus vísceras que se ven a través de la piel.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                61,
                "Poliwhirl",
                R.drawable.poliwhirl_color,
                R.drawable.poliwhirl_black,
                "Renacuajo",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.0 m",
                "20.0 kg",
                "Mirar fijamente la espiral de su vientre provoca somnolencia, por lo que puede usarse como alternativa a las nanas para dormir a los niños.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                62,
                "Poliwrath",
                R.drawable.poliwrath_color,
                R.drawable.poliwrath_black,
                "Renacuajo",
                "Agua",
                "Lucha",
                R.drawable.agua,
                R.drawable.lucha,
                "1.3 m",
                "54.0 kg",
                "Su cuerpo es puro músculo. Logra abrirse paso por aguas gélidas partiendo el hielo con sus fornidos brazos.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Hada",
                R.drawable.hada,
                "Volador",
                R.drawable.volador,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                63,
                "Abra",
                R.drawable.abra_color,
                R.drawable.abra_black,
                "Psi",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "0.9 m",
                "19.5 kg",
                "Usa el poder que tiene en el cerebro para levitar. Puede levantar objetos más pesados que él mismo.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                64,
                "Kadabra",
                R.drawable.kadabra_color,
                R.drawable.kadabra_black,
                "Psi",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "1.3 m",
                "56.5 kg",
                "Es capaz de utilizar todos los tipos de poderes psíquicos. Dicen que su cerebro se desarrolló mucho más que el de Abra",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                65,
                "Alakazam",
                R.drawable.alakazam_color,
                R.drawable.alakazam_black,
                "Psi",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "1.5 m",
                "48.0 kg",
                "Su cerebro tiene un poder de cálculo increíble. Es capaz de recordar todo lo que ha visto.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                66,
                "Machop",
                R.drawable.machop_color,
                R.drawable.machop_black,
                "Súper Poder",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "0.8 m",
                "19.5 kg",
                "Su cuerpo está formado por músculos. Aunque es pequeño, es muy fuerte y tiene una gran capacidad de levantamiento.",
                "Hada",
                R.drawable.hada,
                "Volador",
                R.drawable.volador,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                67,
                "Machoke",
                R.drawable.machoke_color,
                R.drawable.machoke_black,
                "Súper Poder",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "1.5 m",
                "70.5 kg",
                "Su musculatura es tan fuerte que puede levantar hasta un camión con una mano. Es muy orgulloso.",
                "Hada",
                R.drawable.hada,
                "Volador",
                R.drawable.volador,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                68,
                "Machamp",
                R.drawable.machamp_color,
                R.drawable.machamp_black,
                "Súper Poder",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "1.6 m",
                "130.0 kg",
                "Mueve rápidamente sus cuatro brazos para asestar incesantes golpes y puñetazos desde todos los ángulos.",
                "Hada",
                R.drawable.hada,
                "Volador",
                R.drawable.volador,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                69,
                "Bellsprout",
                R.drawable.bellsprout_color,
                R.drawable.bellsprout_black,
                "Flor",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "0.7 m",
                "4.0 kg",
                "Su cuerpo es como un tallo. Si se corta, vuelve a crecer enseguida. Es muy dócil.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                70,
                "Weepinbell",
                R.drawable.weepinbell_color,
                R.drawable.weepinbell_black,
                "Matamoscas",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "1.0 m",
                "6.4 kg",
                "Cuando tiene hambre, engulle a todo lo que se mueve. La pobre presa acaba disuelta en sus ácidos.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                71,
                "Victreebel",
                R.drawable.victreebel_color,
                R.drawable.victreebel_black,
                "Matamoscas",
                "Planta",
                "Veneno",
                R.drawable.planta,
                R.drawable.veneno,
                "1.7 m",
                "15.5 kg",
                "Cuando atrapa a su presa con sus enormes fauces, le inyecta un potente veneno.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Hielo",
                R.drawable.hielo,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                72,
                "Tentacool",
                R.drawable.tentacool_color,
                R.drawable.tentacool_black,
                "Medusa",
                "Agua",
                "Veneno",
                R.drawable.agua,
                R.drawable.veneno,
                "0.9 m",
                "45.5 kg",
                "Sus facultades natatorias son más bien escasas, por lo que se limita a flotar a la deriva en aguas poco profundas en busca de alimento.",
                "Eléctrico",
                R.drawable.electrico,
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                73,
                "Tentacruel",
                R.drawable.tentacruel_color,
                R.drawable.tentacruel_black,
                "Medusa",
                "Agua",
                "Veneno",
                R.drawable.agua,
                R.drawable.veneno,
                "1.6 m",
                "55.0 kg",
                "Si las esferas rojas que tiene a ambos lados de la cabeza brillan con intensidad, indica que está a punto de lanzar ondas ultrasónicas.",
                "Eléctrico",
                R.drawable.electrico,
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                74,
                "Geodude",
                R.drawable.geodude_color,
                R.drawable.geodude_black,
                "Roca",
                "Roca",
                "Tierra",
                R.drawable.roca,
                R.drawable.tierra,
                "0.4 m",
                "20.0 kg",
                "Se suele encontrar en senderos de montaña y sitios parecidos. Conviene andar con cuidado para no pisarlo sin querer y provocar su enfado.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
                "Acero",
                R.drawable.acero,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                75,
                "Graveler",
                R.drawable.graveler_color,
                R.drawable.graveler_black,
                "Roca",
                "Roca",
                "Tierra",
                R.drawable.roca,
                R.drawable.tierra,
                "1.0 m",
                "105.0 kg",
                "Le encanta rodar por las laderas de las montañas. Si se encuentra con un obstáculo, lo destruye con su cuerpo rocoso.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
                "Acero",
                R.drawable.acero,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                76,
                "Golem",
                R.drawable.golem_color,
                R.drawable.golem_black,
                "Megatón",
                "Roca",
                "Tierra",
                R.drawable.roca,
                R.drawable.tierra,
                "1.4 m",
                "300.0 kg",
                "Nada más mudar la piel, su cuerpo se vuelve blando y blanquecino, pero se endurece al poco tiempo de entrar en contacto con el aire.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
                "Acero",
                R.drawable.acero,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                77,
                "Ponyta",
                R.drawable.ponyta_color,
                R.drawable.ponyta_black,
                "Caballo Fuego",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.0 m",
                "30.0 kg",
                "Al nacer es un poco lento, pero va fortaleciendo las patas paulatinamente al disputar carreras con sus congéneres.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Roca",
                R.drawable.roca,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                78,
                "Rapidash",
                R.drawable.rapidash_color,
                R.drawable.rapidash_black,
                "Caballo Fuego",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.7 m",
                "95.0 kg",
                "Es capaz de correr a una velocidad de 240 km/h. La llama que tiene en la frente brilla con intensidad cuando corre.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Roca",
                R.drawable.roca,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                79,
                "Slowpoke",
                R.drawable.slowpoke_color,
                R.drawable.slowpoke_black,
                "Baboso",
                "Agua",
                "Psíquico",
                R.drawable.agua,
                R.drawable.psiquico,
                "1.2 m",
                "36.0 kg",
                "Es tan despistado que se le olvida por completo por qué empezó a llorar. Se le caen las lágrimas al masticar.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                80,
                "Slowbro",
                R.drawable.slowbro_color,
                R.drawable.slowbro_black,
                "Ermitaño",
                "Agua",
                "Psíquico",
                R.drawable.agua,
                R.drawable.psiquico,
                "1.6 m",
                "78.5 kg",
                "Según parece, cuando Slowpoke fue a pescar al mar, un Shellder le mordió la cola y así evolucionó a Slowbro.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                81,
                "Magnemite",
                R.drawable.magnemite_color,
                R.drawable.magnemite_black,
                "Imán",
                "Eléctrico",
                "Acero",
                R.drawable.electrico,
                R.drawable.acero,
                "0.3 m",
                "6.0 kg",
                "Genera ondas electromagnéticas para antigravedad. Se cree que se originó en un ordenador de un laboratorio de investigaciones.",
                "Fuego",
                R.drawable.fuego,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                82,
                "Magneton",
                R.drawable.magneton_color,
                R.drawable.magneton_black,
                "Imán",
                "Eléctrico",
                "Acero",
                R.drawable.electrico,
                R.drawable.acero,
                "1.0 m",
                "60.0 kg",
                "Los tres Magnemite se unieron por un fenómeno magnético. Se cree que así es como se originó este Pokémon.",
                "Fuego",
                R.drawable.fuego,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                83,
                "Farfetch'd",
                R.drawable.farfetchd_color,
                R.drawable.farfetchd_black,
                "Pato Salvaje",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "0.8 m",
                "15.0 kg",
                "Siempre va con un puerro en la garra. Se dice que el puerro es muy nutritivo y que le da un sabor exquisito a sus golpes.",
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                84,
                "Doduo",
                R.drawable.doduo_color,
                R.drawable.doduo_black,
                "Ave Gemela",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "1.4 m",
                "39.2 kg",
                "Las diminutas alas apenas le permiten volar, pero puede correr a gran velocidad gracias a sus patas hiperdesarrolladas.",
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                85,
                "Dodrio",
                R.drawable.dodrio_color,
                R.drawable.dodrio_black,
                "Ave Triple",
                "Normal",
                "Volador",
                R.drawable.normal,
                R.drawable.volador,
                "1.8 m",
                "85.2 kg",
                "Es capaz de correr a 60 km/h. Las tres cabezas se pelean entre sí para ver cuál manda.",
                "Eléctrico",
                R.drawable.electrico,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                86,
                "Seel",
                R.drawable.seel_color,
                R.drawable.seel_black,
                "León Marino",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.1 m",
                "90.0 kg",
                "Su cuerpo está cubierto de una capa de grasa que le protege del frío. Cuando duerme en el agua, se cubre la cara con la cola.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
            )
        )

        Pokemons.add(
            Pokemon(
                87,
                "Dewgong",
                R.drawable.dewgong_color,
                R.drawable.dewgong_black,
                "León Marino",
                "Agua",
                "Hielo",
                R.drawable.agua,
                R.drawable.hielo,
                "1.7 m",
                "120.0 kg",
                "Su cuerpo está cubierto de una capa de grasa que le protege del frío. Cuando duerme en el agua, se cubre la cara con la cola.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                88,
                "Grimer",
                R.drawable.grimer_color,
                R.drawable.grimer_black,
                "Lodo",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.9 m",
                "30.0 kg",
                "Se formó a partir de restos de basura que se fundieron en un vertedero. Se alimenta de basura.",
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                89,
                "Muk",
                R.drawable.muk_color,
                R.drawable.muk_black,
                "Lodo",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "1.2 m",
                "30.0 kg",
                "Su cuerpo está compuesto por una sustancia viscosa. Se cree que fue el resultado de la fusión de restos de basura industrial y desechos tóxicos.",
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                90,
                "Shellder",
                R.drawable.shellder_color,
                R.drawable.shellder_black,
                "Bivalvo",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.3 m",
                "4.0 kg",
                "Está metido en una concha más dura que el diamante, pero tiene un cuerpo muy blando.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
            )
        )

        Pokemons.add(
            Pokemon(
                91,
                "Cloyster",
                R.drawable.cloyster_color,
                R.drawable.cloyster_black,
                "Bivalvo",
                "Agua",
                "Hielo",
                R.drawable.agua,
                R.drawable.hielo,
                "1.5 m",
                "132.5 kg",
                "A los Cloyster que viven en las fuertes corrientes marinas les crecen largas y afiladas púas en la concha.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                92,
                "Gastly",
                R.drawable.gastly_color,
                R.drawable.gastly_black,
                "Gas",
                "Fantasma",
                "Veneno",
                R.drawable.fantasma,
                R.drawable.veneno,
                "1.3 m",
                "0.1 kg",
                "Su estrategia consiste en envolver al rival con su cuerpo gaseoso y envenenarlo a través de la piel.",
                "Siniestro",
                R.drawable.siniestro,
                "Fantasma",
                R.drawable.fantasma,
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                93,
                "Haunter",
                R.drawable.haunter_color,
                R.drawable.haunter_black,
                "Gas",
                "Fantasma",
                "Veneno",
                R.drawable.fantasma,
                R.drawable.veneno,
                "1.6 m",
                "0.1 kg",
                "Le gusta acechar en la oscuridad y tocarles el hombro a sus víctimas con su mano gaseosa. Estas se quedan temblando para siempre.",
                "Siniestro",
                R.drawable.siniestro,
                "Fantasma",
                R.drawable.fantasma,
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                94,
                "Gengar",
                R.drawable.gengar_color,
                R.drawable.gengar_black,
                "Sombra",
                "Fantasma",
                "Veneno",
                R.drawable.fantasma,
                R.drawable.veneno,
                "1.5 m",
                "40.5 kg",
                "Es muy malvado. Acecha a la gente en la oscuridad y le encanta maldecirla. Se cree que nació de la sombra de un ser humano.",
                "Siniestro",
                R.drawable.siniestro,
                "Fantasma",
                R.drawable.fantasma,
                "Psíquico",
                R.drawable.psiquico,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                95,
                "Onix",
                R.drawable.onix_color,
                R.drawable.onix_black,
                "Serpiente",
                "Roca",
                "Ninguno",
                R.drawable.roca,
                R.drawable.ninguno,
                "8.8 m",
                "210.0 kg",
                "Al excavar túneles, se come las rocas que va encontrando. Al morderlas, las pulveriza y las mezcla con su saliva para crear una especie de mortero.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                96,
                "Drowzee",
                R.drawable.drowzee_color,
                R.drawable.drowzee_black,
                "Hipnosis",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "1.0 m",
                "32.4 kg",
                "Siempre tiene hambre. Dicen que se alimenta de los sueños y las pesadillas de la gente y los Pokémon.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                97,
                "Hypno",
                R.drawable.hypno_color,
                R.drawable.hypno_black,
                "Hipnosis",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "1.6 m",
                "75.6 kg",
                "Si se le fija la mirada, es capaz de hipnotizar a su rival. Se alimenta de los sueños y las pesadillas de la gente y los Pokémon.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                98,
                "Krabby",
                R.drawable.krabby_color,
                R.drawable.krabby_black,
                "Cangrejo",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.4 m",
                "6.5 kg",
                "Es muy agresivo y no se le puede acercar. En cuanto ve algo que se mueve, lo ataca con sus pinzas.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
            )
        )

        Pokemons.add(
            Pokemon(
                99,
                "Kingler",
                R.drawable.kingler_color,
                R.drawable.kingler_black,
                "Tenaza",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.3 m",
                "60.0 kg",
                "La pinza tan grande que tiene posee una fuerza de 10 000 CV, pero le cuesta moverla por su gran tamaño.",
                "Eléctrico",
                R.drawable.electrico,
                "Planta",
                R.drawable.planta,
            )
        )

        Pokemons.add(
            Pokemon(
                100,
                "Voltorb",
                R.drawable.voltorb_color,
                R.drawable.voltorb_black,
                "Bola",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "0.5 m",
                "10.4 kg",
                "Su cuerpo es prácticamente una bola de energía eléctrica. Si se le toca, descarga una descarga eléctrica de 10 000 voltios.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                101,
                "Electrode",
                R.drawable.electrode_color,
                R.drawable.electrode_black,
                "Bola",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "1.2 m",
                "66.6 kg",
                "Cuando se carga de electricidad, el número que tiene en la cara brilla en la oscuridad.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                102,
                "Exeggcute",
                R.drawable.exeggcute_color,
                R.drawable.exeggcute_black,
                "Huevo",
                "Planta",
                "Psíquico",
                R.drawable.planta,
                R.drawable.psiquico,
                "0.4 m",
                "2.5 kg",
                "Se cree que este Pokémon nació de la unión de seis huevos. Los seis forman un solo Pokémon.",
                "Fuego",
                R.drawable.fuego,
                "Hielo",
                R.drawable.hielo,
                "Volador",
                R.drawable.volador,
                "Bicho",
                R.drawable.bicho,
                "Veneno",
                R.drawable.veneno,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                103,
                "Exeggutor",
                R.drawable.exeggutor_color,
                R.drawable.exeggutor_black,
                "Coco",
                "Planta",
                "Psíquico",
                R.drawable.planta,
                R.drawable.psiquico,
                "2.0 m",
                "120.0 kg",
                "Cada una de las tres cabezas piensa de forma independiente y apenas muestra interés por el resto.",
                "Fuego",
                R.drawable.fuego,
                "Hielo",
                R.drawable.hielo,
                "Volador",
                R.drawable.volador,
                "Bicho",
                R.drawable.bicho,
                "Veneno",
                R.drawable.veneno,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                104,
                "Cubone",
                R.drawable.cubone_color,
                R.drawable.cubone_black,
                "Solitario",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "0.4 m",
                "6.5 kg",
                "Lleva siempre un cráneo de Pokémon en la cabeza y nunca se lo quita, ni para dormir.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                105,
                "Marowak",
                R.drawable.marowak_color,
                R.drawable.marowak_black,
                "Apilahueso",
                "Tierra",
                "Ninguno",
                R.drawable.tierra,
                R.drawable.ninguno,
                "1.0 m",
                "45.0 kg",
                "Se cree que este Pokémon nació de la unión de seis huevos. Los seis forman un solo Pokémon.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
            )
        )

        Pokemons.add(
            Pokemon(
                106,
                "Hitmonlee",
                R.drawable.hitmonlee_color,
                R.drawable.hitmonlee_black,
                "Patada",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "1.5 m",
                "49.8 kg",
                "Cuando se enfrenta a un enemigo, se pone en guardia y se prepara para luchar con sus poderosas patadas.",
                "Psíquico",
                R.drawable.psiquico,
                "Volador",
                R.drawable.volador,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                107,
                "Hitmonchan",
                R.drawable.hitmonchan_color,
                R.drawable.hitmonchan_black,
                "Puño",
                "Lucha",
                "Ninguno",
                R.drawable.lucha,
                R.drawable.ninguno,
                "1.4 m",
                "50.2 kg",
                "Es capaz de lanzar más de 1000 puñetazos en dos segundos. El movimiento es tan rápido que es imposible verlo.",
                "Psíquico",
                R.drawable.psiquico,
                "Volador",
                R.drawable.volador,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                108,
                "Lickitung",
                R.drawable.lickitung_color,
                R.drawable.lickitung_black,
                "Lametazo",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "1.2 m",
                "65.5 kg",
                "Su lengua es tan larga que, incluso cuando la tiene dentro, le cuelga por fuera de la boca.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                109,
                "Koffing",
                R.drawable.koffing_color,
                R.drawable.koffing_black,
                "Gas Venenoso",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "0.6 m",
                "1.0 kg",
                "Cuando se infla, el gas que tiene dentro sale por los poros de la piel y lo hace flotar.",
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                110,
                "Weezing",
                R.drawable.weezing_color,
                R.drawable.weezing_black,
                "Gas Venenoso",
                "Veneno",
                "Ninguno",
                R.drawable.veneno,
                R.drawable.ninguno,
                "1.2 m",
                "9.5 kg",
                "Usa sus dos cuerpos para mezclar gases. Según parece, en el pasado podían hallarse ejemplares por todos los rincones de Galar.",
                "Tierra",
                R.drawable.tierra,
                "Psíquico",
                R.drawable.psiquico,
            )
        )

        Pokemons.add(
            Pokemon(
                111,
                "Rhyhorn",
                R.drawable.rhyhorn_color,
                R.drawable.rhyhorn_black,
                "Espinas",
                "Tierra",
                "Roca",
                R.drawable.tierra,
                R.drawable.roca,
                "1.0 m",
                "115.0 kg",
                "Su inteligencia es limitada, aunque posee una fuerza tan considerable que le permite incluso derribar rascacielos con solo embestirlos.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
                "Acero",
                R.drawable.acero,
            )
        )

        Pokemons.add(
            Pokemon(
                112,
                "Rhydon",
                R.drawable.rhydon_color,
                R.drawable.rhydon_black,
                "Taladro",
                "Tierra",
                "Roca",
                R.drawable.tierra,
                R.drawable.roca,
                "1.9 m",
                "120.0 kg",
                "Cuando evoluciona, comienza a andar con las patas traseras. Es capaz de horadar rocas con el cuerno que tiene.",
                "Agua",
                R.drawable.agua,
                "Planta",
                R.drawable.planta,
                "Hielo",
                R.drawable.hielo,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
                "Acero",
                R.drawable.acero,
            )
        )

        Pokemons.add(
            Pokemon(
                113,
                "Chansey",
                R.drawable.chansey_color,
                R.drawable.chansey_black,
                "Huevo",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "1.1 m",
                "34.6 kg",
                "Es muy difícil encontrar un huevo de Chansey. Se dice que, si se comparte con alguien, la felicidad durará toda la vida.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                114,
                "Tangela",
                R.drawable.tangela_color,
                R.drawable.tangela_black,
                "Enredadera",
                "Planta",
                "Ninguno",
                R.drawable.planta,
                R.drawable.ninguno,
                "1.0 m",
                "35.0 kg",
                "Su cuerpo está cubierto de hierba azul que crece a medida que absorbe nutrientes. De vez en cuando, se le cae la hierba vieja.",
                "Fuego",
                R.drawable.fuego,
                "Hielo",
                R.drawable.hielo,
                "Veneno",
                R.drawable.veneno,
                "Volador",
                R.drawable.volador,
                "Bicho",
                R.drawable.bicho,
            )
        )

        Pokemons.add(
            Pokemon(
                115,
                "Kangaskhan",
                R.drawable.kangaskhan_color,
                R.drawable.kangaskhan_black,
                "Maternal",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "2.2 m",
                "80.0 kg",
                "Cuando se enfada, se le hincha la bolsa de la cría y se pone a dar patadas. ¡Cuidado!",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                116,
                "Horsea",
                R.drawable.horsea_color,
                R.drawable.horsea_black,
                "Dragón",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.4 m",
                "8.0 kg",
                "Se alimenta de plancton. Si nada en un río de aguas rápidas, es que está buscando corriente.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                117,
                "Seadra",
                R.drawable.seadra_color,
                R.drawable.seadra_black,
                "Dragón",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.2 m",
                "25.0 kg",
                "Su cola es muy fuerte y flexible. Puede nadar a contracorriente sin problemas y sin cansarse.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                118,
                "Goldeen",
                R.drawable.goldeen_color,
                R.drawable.goldeen_black,
                "Pez Color",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.6 m",
                "15.0 kg",
                "Sus aletas pectorales, caudal y dorsal ondean gráciles en el agua. Por eso se le llama el Bailarín Acuático.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                119,
                "Seaking",
                R.drawable.seaking_color,
                R.drawable.seaking_black,
                "Pez Color",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.3 m",
                "39.0 kg",
                "Se dice que, cuando se enfada, su cuerno brilla con siniestra luz roja. Es muy agresivo.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                120,
                "Staryu",
                R.drawable.staryu_color,
                R.drawable.staryu_black,
                "Estrella",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.8 m",
                "34.5 kg",
                "Su cuerpo está formado por un núcleo rojo y cinco apéndices en forma de estrella. Los apéndices brillan en la oscuridad.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                121,
                "Starmie",
                R.drawable.starmie_color,
                R.drawable.starmie_black,
                "Misterioso",
                "Agua",
                "Psíquico",
                R.drawable.agua,
                R.drawable.psiquico,
                "1.1 m",
                "80.0 kg",
                "Su cuerpo está formado por un núcleo rojo y cinco apéndices en forma de estrella. Los apéndices brillan en la oscuridad.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                122,
                "Mr. Mime",
                R.drawable.mr_mime_color,
                R.drawable.mr_mime_black,
                "Barrera",
                "Psíquico",
                "Hada",
                R.drawable.psiquico,
                R.drawable.hada,
                "1.3 m",
                "54.5 kg",
                "Siempre está haciendo pantomimas. Si se encuentra con alguien que también las haga, se pondrá muy contento.",
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
                "Acero",
                R.drawable.acero,
            )
        )

        Pokemons.add(
            Pokemon(
                123,
                "Scyther",
                R.drawable.scyther_color,
                R.drawable.scyther_black,
                "Mantis",
                "Bicho",
                "Volador",
                R.drawable.bicho,
                R.drawable.volador,
                "1.5 m",
                "56.0 kg",
                "Es un Pokémon muy ágil y de gran tamaño. Se mueve tan rápido que es difícil verlo.",
                "Fuego",
                R.drawable.fuego,
                "Hielo",
                R.drawable.hielo,
                "Volador",
                R.drawable.volador,
                "Bicho",
                R.drawable.bicho,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                124,
                "Jynx",
                R.drawable.jynx_color,
                R.drawable.jynx_black,
                "Humanoide",
                "Hielo",
                "Psíquico",
                R.drawable.hielo,
                R.drawable.psiquico,
                "1.4 m",
                "40.6 kg",
                "Siempre está haciendo pantomimas. Si se encuentra con alguien que también las haga, se pondrá muy contento.",
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
                "Acero",
                R.drawable.acero,
                "Fuego",
                R.drawable.fuego,
                "Bicho",
                R.drawable.bicho,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                125,
                "Electabuzz",
                R.drawable.electabuzz_color,
                R.drawable.electabuzz_black,
                "Eléctrico",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "1.1 m",
                "30.0 kg",
                "Es habitual que las centrales eléctricas cuenten con Pokémon de tipo Tierra para hacer frente a los Electabuzz ávidos de electricidad.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                126,
                "Magmar",
                R.drawable.magmar_color,
                R.drawable.magmar_black,
                "Escupefuego",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "1.3 m",
                "44.5 kg",
                "Abate a sus presas con las llamas que genera y con frecuencia acaba reduciéndolas a carbonilla por accidente.",
                "Agua",
                R.drawable.agua,
                "Tierra",
                R.drawable.tierra,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                127,
                "Pinsir",
                R.drawable.pinsir_color,
                R.drawable.pinsir_black,
                "Escarabajo",
                "Bicho",
                "Ninguno",
                R.drawable.bicho,
                R.drawable.ninguno,
                "1.5 m",
                "55.0 kg",
                "Los Pinsir se juzgan entre ellos por la robustez de la cornamenta. Cuanto más imponente sea, más agradará a sus congéneres del sexo opuesto.",
                "Fuego",
                R.drawable.fuego,
                "Volador",
                R.drawable.volador,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                128,
                "Tauros",
                R.drawable.tauros_color,
                R.drawable.tauros_black,
                "Toro Bravo",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "1.4 m",
                "88.4 kg",
                "Cuando se enfada, se vuelve tan violento que no puede controlarse. Solo se calma cuando se queda sin fuerzas.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                129,
                "Magikarp",
                R.drawable.magikarp_color,
                R.drawable.magikarp_black,
                "Pez",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "0.9 m",
                "10.0 kg",
                "Un Pokémon desvalido y patético. A veces es capaz de saltar alto, pero rara vez más de 2 m.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                130,
                "Gyarados",
                R.drawable.gyarados_color,
                R.drawable.gyarados_black,
                "Atrocidad",
                "Agua",
                "Volador",
                R.drawable.agua,
                R.drawable.volador,
                "6.5 m",
                "235.0 kg",
                "Es un Pokémon muy orgulloso y violento. No soporta que le desafíen a nada. Se dice que es el Pokémon más fiero que existe.",
                "Eléctrico",
                R.drawable.electrico,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                131,
                "Lapras",
                R.drawable.lapras_color,
                R.drawable.lapras_black,
                "Transporte",
                "Agua",
                "Hielo",
                R.drawable.agua,
                R.drawable.hielo,
                "2.5 m",
                "220.0 kg",
                "Es un Pokémon muy inteligente que entiende el lenguaje humano. Tiene un gran sentido de la lealtad y es capaz de transportar a personas sobre su lomo.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Lucha",
                R.drawable.lucha,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                132,
                "Ditto",
                R.drawable.ditto_color,
                R.drawable.ditto_black,
                "Transformación",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.3 m",
                "4.0 kg",
                "Su habilidad para transformarse es perfecta, pero, si se le hace reír, perderá la fuerza y no podrá mantenerse transformado.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                133,
                "Eevee",
                R.drawable.eevee_color,
                R.drawable.eevee_black,
                "Evolución",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.3 m",
                "6.5 kg",
                "Su estructura genética es inestable. Puede mutar en cualquier dirección en función del entorno en el que evolucione.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                134,
                "Vaporeon",
                R.drawable.vaporeon_color,
                R.drawable.vaporeon_black,
                "Burbuja",
                "Agua",
                "Ninguno",
                R.drawable.agua,
                R.drawable.ninguno,
                "1.0 m",
                "29.0 kg",
                "Vive cerca del agua. Su cola termina en una aleta parecida a la de un pez, por lo que hay gente que lo confunde con una sirena.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                135,
                "Jolteon",
                R.drawable.jolteon_color,
                R.drawable.jolteon_black,
                "Relámpago",
                "Eléctrico",
                "Ninguno",
                R.drawable.electrico,
                R.drawable.ninguno,
                "0.8 m",
                "24.5 kg",
                "Su cuerpo está cargado de electricidad. Si se enfada o se asusta, descarga toda su energía de golpe.",
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                136,
                "Flareon",
                R.drawable.flareon_color,
                R.drawable.flareon_black,
                "Llama",
                "Fuego",
                "Ninguno",
                R.drawable.fuego,
                R.drawable.ninguno,
                "0.9 m",
                "25.0 kg",
                "Calienta el aire que inhala en su saca de fuego y lo expulsa a 1700ºC.",
                "Agua",
                R.drawable.agua,
                "Roca",
                R.drawable.roca,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                137,
                "Porygon",
                R.drawable.porygon_color,
                R.drawable.porygon_black,
                "Virtual",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "0.8 m",
                "36.5 kg",
                "Es capaz de moverse libremente por el ciberespacio. A veces, se le ha visto en Internet.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                138,
                "Omanyte",
                R.drawable.omanyte_color,
                R.drawable.omanyte_black,
                "Espiral",
                "Roca",
                "Agua",
                R.drawable.roca,
                R.drawable.agua,
                "0.4 m",
                "7.5 kg",
                "Es un Pokémon ancestral que vivió en los mares cálidos poco profundos. Se extinguió hace 10000 años.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                139,
                "Omastar",
                R.drawable.omastar_color,
                R.drawable.omastar_black,
                "Espiral",
                "Roca",
                "Agua",
                R.drawable.roca,
                R.drawable.agua,
                "1.0 m",
                "35.0 kg",
                "Se cree que se extinguió porque el excesivo tamaño y peso de su concha le impedían moverse con rapidez para capturar presas.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                140,
                "Kabuto",
                R.drawable.kabuto_color,
                R.drawable.kabuto_black,
                "Concha",
                "Roca",
                "Agua",
                R.drawable.roca,
                R.drawable.agua,
                "0.5 m",
                "11.5 kg",
                "Un Pokémon casi extinto. Cada tres días, muda el caparazón, que se va endureciendo de forma progresiva.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )
        Pokemons.add(
            Pokemon(
                141,
                "Kabutops",
                R.drawable.kabutops_color,
                R.drawable.kabutops_black,
                "Armazón",
                "Roca",
                "Agua",
                R.drawable.roca,
                R.drawable.agua,
                "1.3 m",
                "40.5 kg",
                "Despedaza a las presas que atrapa para sorber sus fluidos y deja los restos para que otros Pokémon den buena cuenta de ellos.",
                "Planta",
                R.drawable.planta,
                "Eléctrico",
                R.drawable.electrico,
                "Lucha",
                R.drawable.lucha,
                "Tierra",
                R.drawable.tierra,
            )
        )

        Pokemons.add(
            Pokemon(
                142,
                "Aerodactyl",
                R.drawable.aerodactyl_color,
                R.drawable.aerodactyl_black,
                "Fósil",
                "Roca",
                "Volador",
                R.drawable.roca,
                R.drawable.volador,
                "1.8 m",
                "59.0 kg",
                "Es un Pokémon que se extinguió hace 100 millones de años. Su cuerpo está cubierto de piel fina y flexible.",
                "Eléctrico",
                R.drawable.electrico,
                "Agua",
                R.drawable.agua,
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
                "Acero",
                R.drawable.acero,
            )
        )

        Pokemons.add(
            Pokemon(
                143,
                "Snorlax",
                R.drawable.snorlax_color,
                R.drawable.snorlax_black,
                "Dormir",
                "Normal",
                "Ninguno",
                R.drawable.normal,
                R.drawable.ninguno,
                "2.1 m",
                "460.0 kg",
                "Es un Pokémon muy perezoso que se pasa el día tumbado sin hacer nada. Cuando duerme, no se despierta ni ante los golpes.",
                "Lucha",
                R.drawable.lucha,
            )
        )

        Pokemons.add(
            Pokemon(
                144,
                "Articuno",
                R.drawable.articuno_color,
                R.drawable.articuno_black,
                "Congelar",
                "Hielo",
                "Volador",
                R.drawable.hielo,
                R.drawable.volador,
                "1.7 m",
                "55.4 kg",
                "Es un Pokémon legendario que puede controlar el hielo. El aleteo de sus alas congela el aire.",
                "Eléctrico",
                R.drawable.electrico,
                "Roca",
                R.drawable.roca,
                "Acero",
                R.drawable.acero,
                "Fuego",
                R.drawable.fuego,
            )
        )
        Pokemons.add(
            Pokemon(
                145,
                "Zapdos",
                R.drawable.zapdos_color,
                R.drawable.zapdos_black,
                "Eléctrico",
                "Eléctrico",
                "Volador",
                R.drawable.electrico,
                R.drawable.volador,
                "1.6 m",
                "52.6 kg",
                "Es un Pokémon legendario que controla la electricidad. Suele aparecer cuando hay tormentas eléctricas.",
                "Hielo",
                R.drawable.hielo,
                "Roca",
                R.drawable.roca,
            )
        )

        Pokemons.add(
            Pokemon(
                146,
                "Moltres",
                R.drawable.moltres_color,
                R.drawable.moltres_black,
                "Llama",
                "Fuego",
                "Volador",
                R.drawable.fuego,
                R.drawable.volador,
                "2.0 m",
                "60.0 kg",
                "Es un Pokémon legendario que tiene el control del fuego. Suele aparecer en las erupciones volcánicas.",
                "Agua",
                R.drawable.agua,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                147,
                "Dratini",
                R.drawable.dratini_color,
                R.drawable.dratini_black,
                "Dragón",
                "Dragón",
                "Ninguno",
                R.drawable.dragon,
                R.drawable.ninguno,
                "1.8 m",
                "3.3 kg",
                "Se cree que desciende de los dragones que vivieron hace mucho tiempo. Es un Pokémon muy raro.",
                "Hielo",
                R.drawable.hielo,
                "Dragón",
                R.drawable.dragon,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                148,
                "Dragonair",
                R.drawable.dragonair_color,
                R.drawable.dragonair_black,
                "Dragón",
                "Dragón",
                "Ninguno",
                R.drawable.dragon,
                R.drawable.ninguno,
                "4.0 m",
                "16.5 kg",
                "Un Pokémon que vive en los mares. Tiene un cuerpo largo y delgado, y unas escamas que brillan con luz propia.",
                "Hielo",
                R.drawable.hielo,
                "Dragón",
                R.drawable.dragon,
                "Hada",
                R.drawable.hada,
            )
        )

        Pokemons.add(
            Pokemon(
                149,
                "Dragonite",
                R.drawable.dragonite_color,
                R.drawable.dragonite_black,
                "Dragón",
                "Dragón",
                "Volador",
                R.drawable.dragon,
                R.drawable.volador,
                "2.2 m",
                "210.0 kg",
                "Dicen que viven en una isla en algún lugar del océano que solo ellos habitan.",
                "Hielo",
                R.drawable.hielo,
                "Dragón",
                R.drawable.dragon,
                "Hada",
                R.drawable.hada,
                "Roca",
                R.drawable.roca,
                "Eléctrico",
                R.drawable.electrico,
            )
        )

        Pokemons.add(
            Pokemon(
                150,
                "Mewtwo",
                R.drawable.mewtwo_color,
                R.drawable.mewtwo_black,
                "Genético",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "2.0 m",
                "122.0 kg",
                "Es un Pokémon creado por manipulación genética. Pero, como solo se conocen datos de él, se desconoce si se trata de un Pokémon clonado.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )

        Pokemons.add(
            Pokemon(
                151,
                "Mew",
                R.drawable.mew_color,
                R.drawable.mew_black,
                "Nueva Especie",
                "Psíquico",
                "Ninguno",
                R.drawable.psiquico,
                R.drawable.ninguno,
                "0.4 m",
                "4.0 kg",
                "Es un Pokémon tan raro que se cree que solo existe uno. Dicen que aparece en los sitios en los que hay mucha vegetación.",
                "Bicho",
                R.drawable.bicho,
                "Fantasma",
                R.drawable.fantasma,
                "Siniestro",
                R.drawable.siniestro,
            )
        )
        return Pokemons
    }
}