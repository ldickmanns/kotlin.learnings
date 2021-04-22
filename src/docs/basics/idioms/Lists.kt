package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Lists                *
 ************************/

fun main() {
    /** By default, Kotlin lists are immutable */
    val list = listOf(1, 2, 3)

    /** List indexing */
    println(list[1])
    // Output: 2

    /** Mutable list */
    val mutableList = mutableListOf(1, 2, 3)
    mutableList.add(4)
    println(mutableList)
    // Output: [1, 2, 3, 4]

    /** Traversing */
    for (i in list) {
        print(i)
    } // Output: 123
}
