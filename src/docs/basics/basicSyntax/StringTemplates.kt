package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * String Templates     *
 ************************/

fun main() {
    val name = "Kotlin"

    /** Without string template */
    println("Hello" + name + "!")
    /** Output: Hello Kotlin! */

    /** Simple template */
    println("Hello $name!")
    /** Output: Hello Kotlin! */

    /** Expression in a template */
    println("Hello ${name.uppercase()}!")
    /** Output: Hello KOTLIN! */
}
