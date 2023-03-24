fun main() {

    // In Kotlin, if is an expression: it returns a value. Therefore, there is no ternary operator (condition ? then : else) because ordinary if works fine in this role.
    // Kotlin'de if bir ifadedir: bir değer döndürür. Bu nedenle, üçlü operatör yoktur (koşul ? o zaman : başka) çünkü sıradan if bu rolde iyi çalışır.

    val a = 2
    val b = 3

    var max = a
    if (a < b) max = b

// With else
    if (a > b) {
        max = a
    } else {
        max = b
    }

    // As expression
    max = if (a > b) a else b

    // You can also use `else if` in expressions:
    val maxLimit = 5
    val maxOrLimit = if (maxLimit > a) maxLimit else if (a > b) a else b


    println("max is $max")
    println("maxOrLimit is $maxOrLimit")


    // Branches of an if expression can be blocks. In this case, the last expression is the value of a block:
    // Bir if ifadesinin dalları blok olabilir. Bu durumda, son ifade bir bloğun değeridir: )

    val max2 = if (a > b) {
        print("Choose a")

    } else {
        print("Choose b")
    }
    println(" ")

    // When expression
    var x = 1

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x is neither 1 nor 2")
        }
    }
    println(" ")
    /****************************************************************************************************************************/

    /*    enum class Bit {
            ZERO, ONE
        }

        val numericValue = when (getRandomBit()) {
            Bit.ZERO -> 0
            Bit.ONE -> 1*/
    // 'else' is not required because all cases are covered ( 'else' gerekli değildir çünkü tüm vakalar kapsanır )

// In when statements, the else branch is mandatory in the following conditions: (  When ifadelerinde, aşağıdaki koşullarda else şubesi zorunludur: )
// when has a subject of a Boolean, enum, or sealed type, or their nullable counterparts. ( ne zaman bir Boolean, enum veya mühürlü türde bir özneye veya bunların null yapılabilir eşdeğerlerine sahipse.)
// branches of when don't cover all possible cases for this subject. ( dalları bu konuyla ilgili tüm olası durumları kapsamaz.)


    /****************************************************************************************************************************/

    /*    enum class Color {
        RED, GREEN, BLUE
    }

    when (getColor()) {
        Color.RED -> println("red")
        Color.GREEN -> println("green")
        Color.BLUE -> println("blue")
        // 'else' is not required because all cases are covered
    }

    when (getColor()) {
        Color.RED -> println("red") // no branches for GREEN and BLUE
        else -> println("not red") // 'else' is required
    }*/

    /****************************************************************************************************************************/

// To define a common behavior for multiple cases, combine their conditions in a single line with a comma
// ( Birden çok durum için ortak bir davranış tanımlamak üzere koşullarını tek bir satırda virgülle birleştirin )

    var y = 0

    when (y) {
        0, 1 -> print("y == 0 or y == 1")
        else -> print("otherwise")
    }

    var s = 5.3

    when (y) {
        s.toInt() -> print("s encodes x")
        else -> print("s does not encode x")
    }

    println(" ")

    // You can also check a value for being in or !in a range or a collection:

    /*var z = 5

    when (z) {
        in 1..10 -> print("z is in the range")
        in validNumbers -> print("z is valid")
        !in 10..20 -> print("z is outside the range")
        else -> print("none of the above")
    }*/


/***************************************************************************************************************/

    for (i in 1..3) {
        print(i)                            // 123
    }

    println(" ")

    for (i in 6 downTo 0 step 2) {
        print(i)                             // 6420
    }
    println(" ")

    /***************************************************************************************************************/

    // If you want to iterate through an array or a list with an index, you can do it this way:
    // ( Dizini veya dizini olan bir listeyi yinelemek istiyorsanız, bunu şu şekilde yapabilirsiniz: )

    val array = arrayOf("a", "b", "c")
    for (i in array.indices) {
        print(array[i])                   // abc
    }

    /***************************************************************************************************************/

    val array1 = arrayOf("a", "b", "c")
    for ((index, value) in array1.withIndex()) {
        println("the element at $index is $value")
    }

    // the element at 0 is a
    // the element at 1 is b
    // the element at 2 is c

}
