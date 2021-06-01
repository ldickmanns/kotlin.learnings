package docs.basics.idioms

/********************
 * Kotlin Learnings *
 ********************
 * Return on when   *
 ********************/

/** when can be used as an expression for assignments */
fun Int.toFullString() = when (this) {
    0 -> "Zero"
    1 -> "One"
    2 -> "Two"
    else -> "negative or bigger than two"
}

fun main() {
    println((-1).toFullString())
    // Output: negative or bigger than two

    println((1).toFullString())
    // Output: One
}
