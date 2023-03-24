fun main() {

    // In this task, you learn about nullable versus non-nullable variables.
    // Programming errors involving nulls have been the source of countless bugs.
    // Kotlin seeks to reduce bugs by introducing non-nullable variables.

    // ( Bu görevde, null yapılabilir ve null yapılamayan değişkenler hakkında bilgi edinirsiniz.
    // Boş değerleri içeren programlama hataları, sayısız hatanın kaynağı olmuştur.
    // Kotlin, sıfırlanamayan değişkenler sunarak hataları azaltmaya çalışır.

    /********************************************************************************************************/

    // 1- By default, variables cannot be null. ( Varsayılan olarak değişkenler null olamaz. )

    // var rocks: Int = null    --> error: null can not be a value of a non-null type Int

    /********************************************************************************************************/

    // 2- Use the question mark operator, ?, after the type to indicate that a variable can be null.
    //    Bir değişkenin boş olabileceğini belirtmek için türünü belirttikten sonra soru işareti operatörünü (?) kullanın.

    var marbles: Int? = null

    // When you have complex data types, such as a list:

    // a- You can allow the elements of the list to be null.
    // b- You can allow for the list to be null, but if it's not null its elements cannot be null.
    // c- You can allow both the list or the elements to be null.

    // a- Listenin öğelerinin boş olmasına izin verebilirsiniz.
    // b- Listenin boş olmasına izin verebilirsiniz, ancak boş değilse öğeleri boş olamaz.
    // c- Hem listenin hem de öğelerin boş olmasına izin verebilirsiniz.

    /********************************************************************************************************/

    // 3- You can test for null with the ? operator, saving you the pain of writing many if/else statements.
    //    ( ? operatoru ile null testi yapabilirsiniz, sizi birçok if/else ifadesi yazma zahmetinden kurtarır. )

    // this is Java version
    var fishFoodTreats = 6
    if ( fishFoodTreats != null ) {
        fishFoodTreats = fishFoodTreats.dec()
    }
        println(fishFoodTreats)  // 5

    // that is Kotlin version
    fishFoodTreats = fishFoodTreats?.dec() ?: 0   // --> "if fishFoodTreats is not null, decrement and use it; ( null degilse degiskeni azalt ve onu kullan )
                                                  // --> otherwise use the value after the ?:, which is 0. ( yoksa/degilse degiskeni 0 yap )
                                                  // If fishFoodTreats is null, evaluation is stopped, and the dec() method is not called.
                                                  // Note: The ?: operator is sometimes called the "Elvis operator,"
                                                  // because it's like a smiley on its side with a pompadour hairstyle, the way Elvis Presley styled his hair

    /********************************************************************************************************/

    // 4- If you really love NullPointerExceptions, Kotlin lets you keep them.
    // The not-null assertion operator, !! (double-bang), converts any value to a non-null type and throws an exception if the value is null.

    // ( NullPointerExceptions'ı gerçekten seviyorsanız, Kotlin bunları saklamanıza izin verir.
    //  Null olmayan onaylama işleci, !! (double-bang), herhangi bir değeri, null olmayan bir türe dönüştürür ve değer null ise bir istisna atar. )

    var myNumber: Int =10
    var myFavoriteNumber: Int? = null

    // myNumber = myFavoriteNumber --> normally we can not do this! Because that is an error.

    myNumber = myFavoriteNumber!! // --> but like this we can do that. This called "force null"

    // note: It's generally a bad idea to use the double-bang operator!!


}