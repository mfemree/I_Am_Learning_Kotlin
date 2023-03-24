fun main() {

    var a: Int = 6
    var a2: Double = 6.0

    println(a.times(a2))  // 36.0
    println(a.plus(a2))   // 12.0
    println(a.div(a2))    // 1.0

    //  Kotlin does not implicitly convert between number types, so you can't assign a short value directly to a long variable, or a Byte to an Int.
    //  This is because implicit number conversion is a common source of errors in programs. You can always assign values of different types by casting.

    // ( Kotlin, sayı türleri arasında dolaylı olarak dönüştürme yapmaz, bu nedenle doğrudan bir uzun değişkene kısa bir değer veya bir Int'ye bir Byte atayamazsınız.
    // Bunun nedeni, örtük sayı dönüştürmenin programlarda yaygın bir hata kaynağı olmasıdır. Döküm yaparak her zaman farklı türde değerler atayabilirsiniz. )

    val i: Int =6

    val b1 = i.toDouble()
    println(b1)            // 6.0

    val b2 = i.toByte()
    println(b2)           // 6


    val c: Byte = 1
    println(c)

    // val c1: Int = c      -->  error: type mismatch: inferred type is Byte but Int was expected
   // val c2: String = c    -->  error: type mismatch: inferred type is Byte but String was expected
   // val c3: Double = c    -->   error: type mismatch: inferred type is Byte but Double was expected

    val c4: Int = c.toInt()
    println(c4)                    // 1

    val c5: String = c.toString()
    println(c5)                    // 1

    val c6: Double = c.toDouble()
    println(c6)                    // 1.0


    val oneMillion = 1_000_000
    println(oneMillion)                         // 1000000

    val socialSecurityNumber = 999_99_9999L
    println(socialSecurityNumber)               // 999999999

    val hexBytes = 0xFF_EC_DE_5E
    println(hexBytes)                           // 4293713502

    val bytes = 0b11010010_01101001_10010100_10010010
    println(bytes)                              // 3530134674

    // Because Kotlin is strongly typed, the compiler can usually infer the type for variables, so you don't need to explicitly declare it.
    // Kotlin güçlü bir şekilde yazıldığından, derleyici genellikle değişkenlerin türünü anlayabilir, bu nedenle onu açıkça bildirmeniz gerekmez.


    /***********************************************************************************************************************************************/


    var fish =1
    fish = 2

    val aquarium = 1
    // aquarium = 2    -->  error: val cannot be reassigned

    // Kotlin supports two types of variables: changeable and unchangeable. With val, you can assign a value once.
    // If you try to assign something again, you get an error. With var, you can assign a value, then change the value later

    // ( Kotlin iki tür değişkeni destekler: değiştirilebilir ve değiştirilemez. val ile bir kez değer atayabilirsiniz.
    // Tekrar bir şey atamaya çalışırsanız, bir hata alırsınız. var ile bir değer atayabilir, ardından değeri daha sonra değiştirebilirsiniz. )


    var fishes: Int = 12
    var lakes: Double = 2.5

    // The type you store in a variable is inferred when the compiler can figure it out from context.
    // If you want, you can always specify the type of a variable explicitly, using the colon notation.

    // ( Bir değişkende sakladığınız tür, derleyici onu bağlamdan çözebildiğinde çıkarılır.
    // İsterseniz, iki nokta üst üste gösterimini kullanarak bir değişkenin türünü her zaman açıkça belirtebilirsiniz. )


    /***********************************************************************************************************************************************/

    val numberOfFish = 5
    val numberOfPlants = 12

    println( "I have $numberOfFish fish" + " and $numberOfPlants plants")     //  I have 5 fish and 12 plants

    println("I have ${numberOfFish + numberOfPlants} fish and plants")        //  I have 17 fish and plants

    // Strings in Kotlin work pretty much like strings in any other programming language using " for strings and ' for single characters,
    // and you can concatenate strings with the + operator.
    // You can create string templates by combining them with values; the $variable name is replaced with the text representing the value.
    // This is called "variable interpolation."

    // ( Kotlin'deki dizgiler, diğer herhangi bir programlama dilindeki dizgiler gibi çalışır; " for strings ve ' for tek karakterler,
    // ve dizeleri + operatörüyle birleştirebilirsiniz.
    // Bunları değerlerle birleştirerek dize şablonları oluşturabilirsiniz; $değişken adı, değeri temsil eden metinle değiştirilir.
    // Buna "değişken enterpolasyonu" denir. )










}
