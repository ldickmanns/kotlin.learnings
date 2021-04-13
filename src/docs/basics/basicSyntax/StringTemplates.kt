package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * String Templates     *
 ************************/

fun main() {
    val name = "Kotlin"

    /** Simple template */
    println("Hello $name!")
    /** Output: Hello Kotlin! */

    /** Expression in a template */
    println("Hello ${name.toUpperCase()}!")
    /** Output: Hello KOTLIN! */
}
