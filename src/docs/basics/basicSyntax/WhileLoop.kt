package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * While Loop            *
 ************************/

fun main() {
    val numbers = listOf(1, 2, 3)
    var index = 0
    while (index < numbers.size) {
        println("At position $index is ${numbers[index]}")
        ++index
    }
    /**
     * Output:
     * At position 0 is 1
     * At position 1 is 2
     * At position 2 is 3
     */
}
