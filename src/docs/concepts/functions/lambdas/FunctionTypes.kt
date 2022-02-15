package docs.concepts.functions.lambdas

import kotlin.random.Random

/********************
 * Kotlin Learnings *
 ********************
 * Function Types   *
 ********************/

fun main() {
    /** Kotlin allows you to declare function types: */
    val intProducer: () -> Int = {
        Random(seed = 42).nextInt()
    }

    /** This variable now holds a function. To call it, use `invoke`. */
    val randomInt = intProducer.invoke()
    println(randomInt) // 972016666
}
