package docs.concepts.reflection

/***********************
 * Kotlin Learnings    *
 ***********************
 * Property References *
 ***********************/

fun main() {
    val names = listOf("Luke", "Leia", "Han")

    /** This is a property reference. */
    val lengths = names.map(String::length)

    names.zip(lengths).forEach { (name, length) ->
        println("$name has $length chars")
    }
    /********************
     * Output:          *
     ********************
     * Luke has 4 chars *
     * Leia has 4 chars *
     * Han has 3 chars  *
     ********************/
}
