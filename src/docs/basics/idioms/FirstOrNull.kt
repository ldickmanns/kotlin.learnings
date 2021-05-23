package docs.basics.idioms

/********************
 * Kotlin Learnings *
 ********************
 * First or null    *
 ********************/

fun main() {
    /** Empty list */
    val list1 = listOf<Any>()
    val e1 = list1.firstOrNull()
    println(e1)
    // Output: null

    /** Non-empty list */
    val list2 = listOf(1, 2, 3)
    val e2 = list2.firstOrNull()
    println(e2)
    // Output: 1
}
