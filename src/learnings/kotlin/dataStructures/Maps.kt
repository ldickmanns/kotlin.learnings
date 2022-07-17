package learnings.kotlin.dataStructures

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Holds the username for an id
    val map = mutableMapOf(1 to "kotlin.learnings",
                           2 to "java.learnings")

    // Adding another entry
    map[3] = "cs.blogger"

    // Print keys and values
    for (i in map.keys) {
        println("Id $i is ${map[i]}")
    }
}

/****************************
 * Output:                  *
 * Id 1 is kotlin.learnings *
 * Id 2 is java.learnings   *
 * Id 3 is cs.blogger       *
 ****************************/

