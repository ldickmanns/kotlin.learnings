package docs.concepts.classesAndObjects

/*************************
 * Kotlin Learnings      *
 *************************
 * SecondaryConstructors *
 *************************/

class Car(val name: String)
class Pet(val name: String)

class Person(val name: String, val age: Int) {
    var car: Car? = null
    var pet: Pet? = null

    /** A class can have multiple secondary constructors, which have to delegate to the primary constructor */
    constructor(name: String, age: Int, car: Car) : this(name, age) {
        this.car = car
    }

    /** Delegation to the primary constructor can also happen indirectly via another secondary constructor */
    constructor(name: String, age: Int, car: Car, pet: Pet) : this(name, age, car) {
        this.pet = pet
    }
}

fun main() {
    val carlos = Person("Carlos", 33)

    val car = Car("Audi")
    val pet = Pet("Doggo")
    val mike = Person("Mike", 32, car, pet)

    println("Car: ${ mike.car?.name }, Pet: ${mike.pet?.name}")
    // Output:
    // Car: Audi, Pet: Doggo
}
