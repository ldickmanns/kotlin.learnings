package docs.basics.idioms

/**********************
 * Kotlin Learnings   *
 **********************
 * Swapping Variables *
 **********************/

fun main() {
    var a = 1
    var b = 5

    a = b.also { b = a }

    println(a) // Output: 5
    println(b) // Output: 1
}
