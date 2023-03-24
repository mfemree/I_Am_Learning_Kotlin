fun main() {

// list

    val school = listOf("mackerel", "trout", "halibut")
    println(school)                                             // [mackerel, trout, halibut]


    val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
    println(myList)                                            // [tuna, salmon]

    // Note: With a list defined with val, you can't change which list the variable refers to, but you can still change the contents of the list.
    // ( Not: val ile tanımlanan bir liste ile değişkenin hangi listeye başvurduğunu değiştiremezsiniz, ancak yine de listenin içeriğini değiştirebilirsiniz. )

    /**************************************************************************************************************************************************************/
    // arrays

    // Like other languages, Kotlin has arrays. Unlike lists in Kotlin, which have mutable and immutable versions, there is no mutable version of an Array.
    // Once you create an array, the size is fixed. You can't add or remove elements, except by copying to a new array.

    // Diğer diller gibi Kotlin de dizilere sahiptir. Değişken ve değişmez sürümleri olan Kotlin'deki listelerin aksine, bir Dizinin değişken sürümü yoktur.
    // Bir dizi oluşturduğunuzda, boyut sabitlenir. Yeni bir diziye kopyalama dışında öğe ekleyemez veya kaldıramazsınız.

    val school1 = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school1))         // [shark, salmon, minnow]

    /**************************************************************************************************************************************************************/

    // An array declared with arrayOf doesn't have a type associated with the elements, so you can mix types, which is helpful. Declare an array with different types.
    // arrayOf ile bildirilen bir dizinin, öğelerle ilişkili bir türü yoktur, bu nedenle türleri karıştırabilirsiniz, bu da yardımcı olur. Farklı türlerde bir dizi bildirin.

    val mix = arrayOf("fish", 2)
    println(java.util.Arrays.toString(mix))            // [fish, 2]

    /**************************************************************************************************************************************************************/

    // You can also declare arrays with one type for all the elements ( Dizileri tüm öğeler için tek bir türle de bildirebilirsiniz. )
    // Note: Using an array of a primitive type such as Int or Byte avoids the overhead of boxing.
    // Not: Int veya Byte gibi ilkel türde bir dizi kullanmak, boks yükünü önler.

    val numbers = intArrayOf(1,2,3)

    /**************************************************************************************************************************************************************/

    //Combine two arrays with the + operator.

    val numbers2 = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers2
    println(foo2[5])                       // 3  // 5.index

    /**************************************************************************************************************************************************************/

    // Try out different combinations of nested arrays and lists. As in other languages, you can nest arrays and lists.
    // That is, when you put an array within an array, you have an array of arrays—not a flattened array of the contents of the two.
    // The elements of an array can also be lists, and the elements of lists can be arrays.

    // ( İç içe geçmiş dizilerin ve listelerin farklı kombinasyonlarını deneyin. Diğer dillerde olduğu gibi, dizileri ve listeleri iç içe yerleştirebilirsiniz.
    // Yani, bir dizinin içine bir dizi koyduğunuzda, bir dizi diziniz olur; ikisinin içeriklerinin düzleştirilmiş bir dizisi değil.
    // Bir dizinin elemanları da listeler olabilir ve listelerin elemanları da diziler olabilir.

    val numbers4 = intArrayOf(1, 2, 3)
    val oceans = listOf("Atlantic", "Pacific")
    val oddList = listOf(java.util.Arrays.toString(numbers4), oceans, "salmon")
    println(oddList)             //  [[1, 2, 3], [Atlantic, Pacific], salmon]

    /**************************************************************************************************************************************************************/

    val array = Array (5) { it * 2 }
    val array2 = Array (5) { it * 3 }
    println(java.util.Arrays.toString(array))   //  [0, 2, 4, 6, 8]
    println(java.util.Arrays.toString(array2))   // [0, 3, 6, 9, 12]

    /**************************************************************************************************************************************************************/

        // array with loop

    val school2 = arrayOf("shark", "salmon", "minnow")
    for (element in school2) {
        println(element + " ")       //  shark salmon minnow
    }

    /**************************************************************************************************************************************************************/

    // In Kotlin, you can loop through the elements and the indexes at the same time. Try this example:
    // Kotlin'de elementler ve indeksler arasında aynı anda dolaşabilirsiniz. Bu örneği deneyin:

    for ((index, element) in school2.withIndex()) {
        println("Item at $index is $element\n")
    }

    // Item at 0 is shark
    // Item at 1 is salmon
    // Item at 2 is minnow

    /**************************************************************************************************************************************************************/

    // Try different step sizes and ranges. You can specify ranges of numbers or of characters, alphabetically.
    // And as in other languages, you don't have to step forward by 1. You can step backward using downTo.

    // Farklı adım boyutlarını ve aralıklarını deneyin. Sayı veya karakter aralıklarını alfabetik olarak belirleyebilirsiniz.
    // Ve diğer dillerde olduğu gibi 1 adım ileri gitmek zorunda değilsiniz. DownTo'yu kullanarak geri gidebilirsiniz.


    for (i in 1..5) print(i)            // ⇒ 12345

    for (i in 5 downTo 1) print(i)      // ⇒ 54321

    for (i in 3..6 step 2) print(i)    //  ⇒ 35

    for (i in 'd'..'g') print (i)      //  ⇒ defg

    /**************************************************************************************************************************************************************/

    println(" ")

    var bubbles = 0
    while (bubbles < 50) {
        bubbles++
    }
    println("$bubbles bubbles in the water\n")     //    ⇒ 50 bubbles in the water

    do {
        bubbles--
    } while (bubbles > 50)
    println("$bubbles bubbles in the water\n")    //       49 bubbles in the water

    repeat(2) {
        println("A fish is swimming")             //      A fish is swimming
    }                                             //      A fish is swimming





}