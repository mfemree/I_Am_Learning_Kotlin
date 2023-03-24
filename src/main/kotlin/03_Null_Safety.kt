fun main (){

    // In an effort to rid the world of NullPointerException, variable types in Kotlin don't allow the assignment of null.
    // If you need a variable that can be null, declare it nullable by adding ? at the end of its type.

    // ( NullPointerException sıkıntısından kurtulmak için, Kotlin'deki değişken türleri null atanmasına izin vermiyor.
    // Boş olabilecek bir değişkene ihtiyacınız varsa, değişken türünün sonuna ? koyun. )

    var neverNull: String = "This can't be null"
    // neverNull = null  -->  When trying to assign null to non-nullable variable, a compilation error is produced.

    var nullable: String? = "You can keep a null here"
    nullable = null      // --> Sets the null value to the nullable variable. This is OK.

    var inferredNonNull = "The compiler assumes non-null"    // "Derleyici boş/null olmadığını varsayar"
    // null olmadigini varsaydigimiz bir deger yazdik
    // inferredNonNull = null  --> When trying to assign null to a variable with inferred type, a compilation error is produced.


    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)     // Calls the function with a String (non-nullable) argument. This is OK.
    //  strLength(nullable)  // When calling the function with a String? (nullable) argument, a compilation error is produced.


    fun describeString(maybeString: String?): String {              // A function that takes in a nullable string and returns its description.
        if (maybeString != null && maybeString.length > 0) {        // If the given string is not null and not empty, return information about its length.
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"                           // Otherwise, tell the caller that the string is empty or null.
        }
    }

    // output: Empty or null string

}