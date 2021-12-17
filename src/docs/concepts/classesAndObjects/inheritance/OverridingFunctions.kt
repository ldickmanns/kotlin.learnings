package docs.concepts.classesAndObjects.inheritance

/************************
 * Kotlin Learnings     *
 ************************
 * Overriding Functions *
 ************************/

/** Similar to classes, functions have to be declared **overridable** as well. */
open class Reptile(val numberOfFeet: Int = 4) {
    /** This happens with the **open** keyword. */
    open fun printNumberOfFeet() =
        println("This reptile has $numberOfFeet feet.")
}

class Snake : Reptile(numberOfFeet = 0) {
    /** You have make overriding explicit with the **override** keyword. */
    override fun printNumberOfFeet() =
        println("This snake has $numberOfFeet feet.")
}

fun main() {
    val reptile = Reptile()
    reptile.printNumberOfFeet() // This reptile has 4 feet.

    val snake = Snake()
    snake.printNumberOfFeet()   // This snake has 0 feet.
}
