package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Null                 *
 ************************/

fun positiveOrNull(int: Int): Int? {
    return if (int >= 0) int else null
}

fun main() {
    val a = positiveOrNull(1)
    val b = positiveOrNull(2)

    if (a != null && b != null) {
        /** Smart Casts to non-nullable Int */
        println(a + b)
    } else {
        println("a or b is null")
    } /** Output: 3 */

    /** This also works with "==" */
    if (a == null) return
    if (b == null) return
    println(a + b) /** Output: 3 */
}
