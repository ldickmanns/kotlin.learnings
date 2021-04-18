package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Ranges               *
 ************************/

fun main() {
    /** You can create a range with two colons ( .. ) */
    val range = 0..5

    /** With "in" you can check if a number is in the range */
    if (2 in range) println(2)  /** Output: 2 */

    /** The range includes the upper and lower bound */
    if (0 in range) println(0)  /** Output: 0 */
    if (5 in range) println(5)  /** Output: 5 */

    /** As with other boolean expression, you can use "!" to negate in */
    if (6 !in range) println(6) /** Output: 6 */

    /** You can iterate over ranges, as well */
    for (i in 0..5) {
        print(i)
    } /** Output: 012345 */
    println()

    /** Kotlin also offers so-called progressions */
    for (i in 8 downTo 0 step 2) {
        print(i)
    } /** Output: 86420 */
}
