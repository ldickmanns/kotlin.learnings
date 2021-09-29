package docs.concepts.controlFlow.exceptions

/***********************
 * Kotlin Learnings    *
 ***********************
 * Try Expression      *
 ***********************/

fun main() {
    val numberString = "500"
    /** You can use try as an expression. */
    val number = try {
        Integer.parseInt(numberString)
    } catch (nfe: NumberFormatException) {
        0
    } finally {
        println("This is optional and doesn't" +
                " affect the return value")
    }
    // Output:
    // This is optional and doesn't affect the return value

    println(number::class)
    // Output:
    // class kotlin.Int
}
