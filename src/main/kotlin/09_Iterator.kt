fun main() {


    val zoo = Zoo(listOf(Animal("zebra"), Animal("lion")))

    for (animal in zoo) {                                  // 3- Loops through animals in the zoo with the user-defined iterator. ( Kullanıcı tanımlı yineleyici ile hayvanat bahçesindeki hayvanlar arasında geçiş yapar. )
        println("Watch out, it's a ${animal.name}")        // Watch out, it's a zebra
                                                           // Watch out, it's a lion
    }

}


class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {             // 1- Defines an iterator in a class. It must be named iterator and have the operator modifier. ( Bir sınıfta bir yineleyici tanımlar. Yineleyici olarak adlandırılmalı ve operatör değiştiriciye sahip olmalıdır. )
        return animals.iterator()                           // 2- eturns the iterator that meets the following method requirements: ( Aşağıdaki yöntem gereksinimlerini karşılayan yineleyiciyi döndürür: )
                                                            //    next(): Animal
                                                            //    hasNext(): Boolean
    }
}

