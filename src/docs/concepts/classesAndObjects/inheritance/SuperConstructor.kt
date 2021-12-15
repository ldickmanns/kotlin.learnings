package docs.concepts.classesAndObjects.inheritance

/********************
 * Kotlin Learnings *
 ********************
 * Super            *
 ********************/

/** Super/Parent class. */
open class Animal(val name: String)

/** If the subclass has a primary constructor, the parent constructor must be initialized in it. */
class Dog(name: String) : Animal(name)

/** If the subclass has no primary constructor, each secondary constructor has to initialize the parent constructor. */
class Cat : Animal {
    private var isGoodCat = true

    /** Direct super call. */
    constructor(name: String) : super(name)

    /** Indirect super call via other constructor. */
    constructor(name: String, isGoodCat: Boolean) : this(name) {
        // You get the point ;)
        this.isGoodCat = if (isGoodCat) isGoodCat else true
    }

    fun printInfo() =
        if (isGoodCat) println("$name is a good cat!")
        else println("$name is not a good cat")
}

fun main() {
    val dog = Dog("Doggo")
    println(dog.name)   // Doggo

    val charlie = Cat("Charlie")
    charlie.printInfo() // Charlie is a good cat!

    val miles = Cat("Miles", true)
    miles.printInfo()   // Miles is a good cat!
}
