package docs.concepts.destructuringDeclarations

/********************
 * Kotlin Learnings *
 ********************
 * Pairs            *
 ********************/

fun main() {
    val laptop = Pair("MacBook", 1000)
    /** This is called a destructuring declaration. */
    val (name, price) = laptop
    println("$name costs $price$")
    // Output: MacBook costs 1000$
}
