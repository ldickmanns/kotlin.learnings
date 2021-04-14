package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * For Loop             *
 ************************/

fun main() {
    val numbers = listOf(1, 2, 3)
    /** Easy, straightforward syntax */
    for (number in numbers) {
        print("$number ")
    } /** Output: 1 2 3 */

    /** You can also iterate over indices */
    for (index in numbers.indices) {
        println("At position $index is ${numbers[index]}")
    }
    /**
     * Output:
     * At position 0 is 1
     * At position 1 is 2
     * At position 2 is 3
     */
}
