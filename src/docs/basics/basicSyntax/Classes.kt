package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Classes              *
 ************************/

/**
 * Simple to create; add the "open" keyword to make a class inheritable.
 */
open class Car

/**
 * Properties of the class can be initialized in the declaration of it.
 * Superclasses follow after the class declaration and are separated
 * by a colon ( : ).
 */
class BMW(val name: String, val hp: Int) : Car() {
    fun printInfo() = println("$name has $hp HP")
}

fun main() {
    val bmw = BMW("M4", 510)

    /** Accessing properties */
    println(bmw.name)   /** Output: M4 */
    println(bmw.hp)     /** Output: 510 */

    /** Accessing methods */
    bmw.printInfo()     /** Output: M4 has 510 HP */
}
