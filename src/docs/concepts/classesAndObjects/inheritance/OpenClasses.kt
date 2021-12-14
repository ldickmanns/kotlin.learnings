package docs.concepts.classesAndObjects.inheritance

/** By default, Kotlin classes are not extensible */
class NotExtensible
// The following would cause an error
// class Error : NotExtensible()

/** To be extensible, classes must be specified with the open keyword */
open class Car
class SportsCar : Car()

fun main() {
    val car = Car()
    val sportsCar = SportsCar()
    /**
     * As you might expect, car is a Car but not a
     * SportsCar, while SportsCar is both a SportsCar
     * a Car. (SportsCar is a subclass of Car)
     * */
    println(car is Car)             // true
    println(car is SportsCar)       // false
    println(sportsCar is Car)       // true
    println(sportsCar is SportsCar) // false
}
