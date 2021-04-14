package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Collections          *
 ************************/

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)

    /** Iterating over a collection */
    for (number in numbers) {
        print(number)
    } /** Output: 12345 */
    println()

    /** Check if a collection contains something */
    when {
        6 in numbers -> println("Six is in the list")
        6 !in numbers -> println("Six isn't in the list")
    } /** Output: Six isn't in the list */

    /** Lambdas x Collections */
    val animals = listOf("Dog", "Cat", "Dolphin", "Duck")
    animals
        .filter { it.startsWith("D") }
        .sortedBy { it }
        .map { it.toLowerCase() }
        .forEach { print("$it ") }
    /** Output: dog dolphin duck */
}
