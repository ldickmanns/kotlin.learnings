package docs.concepts.types.strings

/********************
 * Kotlin Learnings *
 ********************
 * Split and Join   *
 ********************/

fun main() {
    val string = "This is a string"
    val split = string.split(' ')

    println(split)
    // [This, is, a, string]

    val joined = split.joinToString(" ")
    println(joined)
    // This is a string

    val colors = listOf("Red", "Green", "Blue")
    println(colors.joinToString(", "))
    // Red, Green, Blue
}
