package docs.basics.idioms

import kotlin.random.Random

/*********************
 * Kotlin Learnings  *
 *********************
 * Nullable Booleans *
 *********************/

fun doSomething() {}
fun doSomethingElse() {}

fun main() {
    val n = Random.nextBoolean()
    val b = if (n) null else Random.nextBoolean()

    if (b == true) {
        // b is true
        doSomething()
    } else {
        // b is false or null
        doSomethingElse()
    }
}
