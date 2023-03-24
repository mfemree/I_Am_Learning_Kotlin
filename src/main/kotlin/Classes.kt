// The class declaration consists of the class name, the class header (specifying its type parameters, the primary constructor etc.)
// and the class body, surrounded by curly braces. Both the header and the body are optional; if the class has no body, curly braces can be omitted.

// Sınıf bildirimi, sınıf adından, sınıf başlığından (tür parametrelerini, birincil yapıcıyı vb. belirterek) ve suslu parantezlerle({}) çevrelenmiş sınıf gövdesinden oluşur.
// Hem başlık hem de gövde isteğe bağlıdır; sınıfın gövdesi yoksa suslu parantezlerle atlanabilir


class Customer                                  // 1

class Contact(val id: Int, var email: String)   // 2

fun main() {

    val customer = Customer()                   // 3

    val contact = Contact(1, "mary@gmail.com")  // 4

    println(contact.id)                         // 5
    contact.email = "jane@gmail.com"            // 6
}

// 1- Declares a class named Customer without any properties or user-defined constructors. A non-parameterized default constructor is created by Kotlin automatically.
//    Herhangi bir ozelligi veya kullanici-tanimli constructor'i olmayan bir class'i bildirir/tanimlar. parametrelendirilmemis default bir constructor kotlin tarafafindan otomatik olusturulur

// 2- Declares a class with two properties: immutable id and mutable email, and a constructor with two parameters id and email.
//    iki ozellige sahop bir class'i belirtir. degistirilemez id ve degistirilebilir email ve iki parametreli bir contructor.

// 3- Creates an instance of the class Customer via the default constructor. Note that there is no new keyword in Kotlin.
//    Customer sinifindan bir instance(obje) olusturulmus varsayilan Constructor araciligiyla. Kotlin'de "new" anahtarkelimesinin olmadigini unutmayin.
//    Normalde Java'da "new" keywordu ile yeni bir obje olusturuyorduk.

// 4- Creates an instance of the class Contact using the constructor with two arguments.
//    iki argumenli/parametreli constructori kullanilarak Contact sinifindan bir instance(obje) olusuturulmus.

// 5- Accesses the property "id"
//    id ozelligine/degerine ulastik

// 6- Updates the value of the property email.
//    email degerine yeni bir email adresi vererek onu guncelledik