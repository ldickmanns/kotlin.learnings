package docs.basics.basicSyntax

/***************************
 * Kotlin Learnings        *
 * @kotlin.learnings       *
 ***************************
 * ConditionalExpressions  *
 ***************************/

/** Standard if-then-else */
fun makeNegative(x: Int): Int {
    if (x > 0) {
        return -x
    } else {
        return x
    }
}

/** If-then-else expression */
fun makePositive(x: Int) = if (x > 0) x else -x

fun main() {
    val x = 5
    println(makeNegative(x))    /** Output: -5 */
    println(makePositive(x))    /** Output: 5 */
}
