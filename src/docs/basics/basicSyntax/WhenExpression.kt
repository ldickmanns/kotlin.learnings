package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * When Expression      *
 ************************/

/**
 * Use a comma ( , ) to separate cases.
 * You can use boolean operators like "in" and "is", too.
 * The else case matches any unmatched case.
 */
fun describe(number: Number): String =
    when (number) {
        0, 0L, 0.0, 0.0F -> "Zero"
        in 1..Int.MAX_VALUE -> "Positive Int"
        is Double, is Float -> "Something with a dot"
        else -> "I don't know"
    }

fun main() {
    println(describe(0L))   /** Output: Zero */
    println(describe(42))   /** Output: Positive Int */
    println(describe(0.5F)) /** Output: Something with a dot */
    println(describe(-3L))  /** Output: I don't know*/
}
