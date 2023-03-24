fun main() {

    // Kotlin has powerful type inference. While you can explicitly declare the type of a variable,
    // you'll usually let the compiler do the work by inferring it.
    // Kotlin does not enforce immutability, though it is recommended. In essence use val over var.

    // ( Kotlin, güçlü tür çıkarımına sahiptir. Bir değişkenin türünü açıkça bildirebilseniz de,
    // genellikle derleyicinin onu çıkarsayarak işi yapmasına izin verirsiniz.
    // Kotlin, tavsiye edilmesine rağmen değişmezliği zorlamaz. Özünde var yerine val kullanın. )


    var a: String = "initial"      // var = variable ( changeable/mutable ) = değiştirilebilir
    println(a)

    val b: Int = 1                // val = value ( unchangeable/immutable ) = değiştirilemez

    val c = 3                    // Declares an immutable variable and initializes it without specifying the type. The compiler infers the type Int.
                                 // Sabit bir değişken bildirir ve türü belirtmeden onu başlatır. Derleyici, Int türünü anlar.

    var e: Int                   // Declares a variable without initialization. ( belirtilmemiş bir değişken bildirir )

   // println(e)                 // An attempt to use the variable causes a compiler error: "Variable 'e' must be initialized."
                                // Değişkeni kullanma girişimi bir derleyici hatasına neden olur: 'e' değişkeni başlatılmalıdır.



}