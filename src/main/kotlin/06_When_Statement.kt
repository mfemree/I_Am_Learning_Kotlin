fun main() {

    // instead of the widely used switch statement ( Yaygın olarak kullanılan switch deyimi yerine )

        cases("Hello")
        cases(1)
        cases(0L)
        cases(MyClass())
        cases("hello")
    }

    fun cases(obj: Any) {
        when (obj) {                                     //     This is a when statement.

            1 -> println("One")                          // 1 - Checks whether obj equals to 1         //  One
            "Hello" -> println("Greeting")               // 2 - Checks whether obj equals to "Hello".  //  Greeting
            is Long -> println("Long")                   // 3 - Performs type checking.                //  Long
            !is String -> println("Not a string")        // 4 - Performs inverse type checking.        //  Not a string
            else -> println("Unknown")                   // 5 - Default statement (might be omitted).  //  Unknown
        }
    }

class MyClass




