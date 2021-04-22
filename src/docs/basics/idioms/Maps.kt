package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Maps                 *
 ************************/

fun main() {
    /** By default, Kotlin maps are immutable */
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
    )

    /** Map entry accessing */
    println(map[2])
    // Output: two

    /** Mutable map */
    val mutableMap = map.toMutableMap()
    mutableMap[4] = "four"
    println(mutableMap)
    // {1=one, 2=two, 3=three, 4=four}

    /** Traversing */
    for ((number, name) in map) {
        println("$name corresponds to $number")
    }
    /**
     * one corresponds to 1
     * two corresponds to 2
     * three corresponds to 3
     */
}
