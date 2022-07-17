package docs.destructuringDeclarations

/********************
 * Kotlin Learnings *
 ********************
 * Data Classes     *
 ********************/

// TODO idea

data class Person(
    val name: String,
    val age: Int,
)

fun main() {
    val me = Person("Ludwig", 26)
    /**
     * Destructuring can be used to access the
     *
     * individual components of a data class
     */
    val (myName, myAge) = me
    println("My name is $myName and I'm $myAge")
}
