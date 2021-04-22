package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Extension Functions  *
 ************************/

/** Add a function to the Int class */
fun Int.addTwo() = this + 2

/** Add a function to the String class */
fun String.replaceWhitespaces(char: Char): String {
    return this.replace(' ', char)
}

fun main() {
    val i = 1
    println(i.addTwo())
    // Output: 3

    println("Test replacing".replaceWhitespaces('_'))
    // Output: Test_replacing
}
