package basics.loops

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val list = listOf(1, 2, 3, 4, 5)

    for (i in list) {
        print(i)
    } /** Output: 12345 */

    println()

    list.forEach { print(it) }
    /** Output: 12345 */
}

