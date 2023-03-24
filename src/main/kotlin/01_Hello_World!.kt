fun main() {

    println("Hello, World!")

    // 1- Kotlin code is usually defined in packages. Package specification is optional:
    //    If you don't specify a package in a source file, its content goes to the default package.

    //  ( Kotlin kodu genellikle paketlerde tanımlanır. Paket belirtimi isteğe bağlıdır:
    //  Bir kaynak dosyada bir paket belirtmezseniz, içeriği varsayılan pakete gider. )

    // 2- An entry point to a Kotlin application is the main function.
    //    Since Kotlin 1.3, you can declare main without any parameters.
    //    The return type is not specified, which means that the function returns nothing.

    //  ( Bir Kotlin uygulamasına giriş noktası, ana işlevdir.
    //  Kotlin 1.3'ten beri herhangi bir parametre olmadan main ilan edebilirsiniz.
    //  Dönüş türü belirtilmemiş, bu da işlevin hiçbir şey döndürmediği anlamına gelir. )

    // 3- println writes a line to the standard output. It is imported implicitly.
    //    Also note that semicolons are optional.

    //  ( println standart çıktıya bir satır yazar. Örtülü olarak ithal edilir.
    //  Ayrıca noktalı virgüllerin isteğe bağlı olduğunu unutmayın. )


    // In Kotlin versions earlier than 1.3, the main function must have a parameter of type Array<String>.
    // 1.3'ten önceki Kotlin sürümlerinde, ana işlevin Array<String> türünde bir parametresi olmalıdır.

    fun main(args: Array<String>) {
        println("Hello, World!")
    }

}