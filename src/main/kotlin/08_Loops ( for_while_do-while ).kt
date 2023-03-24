fun main() {


    val cakes = listOf<String>("carrot", "cheese","chocolate" )

        for ( cake in cakes ) {

            println("Yummy, it's a $cake cake!")        // Yummy, it's a carrot cake!
                                                        // Yummy, it's a cheese cake!
                                                        // Yummy, it's a chocolate cake!
        }

/**********************************************************************************************************/


    var cakesEaten = 0
    var cakesBaked = 0

    while (cakesEaten < 5) {    // Executes the block while the condition is true. ( Koşul doğruyken bloğu yürütür. )

        eatACake()
        cakesEaten++                                   // Eat a cake
                                                       // Eat a cake
                                                       // Eat a cake
                                                       // Eat a cake
                                                       // Eat a cake
    }

    do {                     // Executes the block first and then checking the condition. ( Executes the block first and then checking the condition. )

        bakeACake()
        cakesEaten++

    } while (cakesBaked < cakesEaten)     // sonsuza kadar yazdirir. cunku her zaman cakesEaten > cakesBaked
}

fun eatACake() = println("Eat a cake")
fun bakeACake() = println("Bake a Cake")



















