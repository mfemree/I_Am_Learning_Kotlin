fun main() {

    for (i in 0..3) {            // from 0 up to 3 (inclusive) - Like 'for(i=0; i<=3; ++i)'
        print(i)                       // 0123
    }
    print(" ")

    for (i in 0 until 3) {      // from 0 up to 3 (exclusive). - like 'for(i=0; i<3; ++i)'
        print(i)                      // 012
    }
    print(" ")

    for (i in 2..8 step 2) {   // Iterates over a range with a custom increment step for consecutive elements. ( Ardışık öğeler için özel bir artış adımıyla bir aralıkta yinelenir. )
    }
    print(" ")

    for (i in 3 downTo 0) {    // Iterates over a range in reverse order. ( Bir aralıkta ters sırada/geriye dogru yinelenir. )
        print(i)                     // 3210
    }
    print(" ")

    /******************************************************************************************************************/

    // Char ranges are also supported:

    for (letters in 'a'..'z') {
        print(letters)
    }
    print(" ")

    for (letters in 'z' downTo 'a' step 2) {
        print(letters)
    }

    println()
    /******************************************************************************************************************/

    // Ranges are also useful in if statements:

    val x = 2

    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()

    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }


}