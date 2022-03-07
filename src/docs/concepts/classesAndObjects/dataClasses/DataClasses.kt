package docs.concepts.classesAndObjects.dataClasses

/********************
 * Kotlin Learnings *
 ********************
 * Data Classes     *
 ********************/

/** Use the `data` keyword to declare a data class: */
data class Person(val name: String)

fun main() {
    val alice = Person("Alice")
    val bob = Person("Bob")

    /** The compiler automatically derives an `equals` function: */
    val aliceEqualsBob = alice == bob
    println(aliceEqualsBob) // false
    val secondAlice = Person("Alice")
    println(alice == secondAlice) // true

    /** Further, you get a `toString` function: */
    val ludwig = Person("Ludwig")
    println("Hey guys, I'm $ludwig")
    // Hey guys, I'm Person(name=Ludwig)
}
