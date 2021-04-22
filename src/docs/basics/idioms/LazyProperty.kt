package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Lazy Property        *
 ************************/

class DeferredMultiply(val x: Int, val y: Int) {
    /** result is only calculated if it's accessed */
    val result: Int by lazy {
        println("Calculated the result")
        return@lazy x * y
    }
}

fun main() {
    val deferredMultiply = DeferredMultiply(100, 100)
    // No output

    val result = deferredMultiply.result
    // Output: Calculated the result

    println(result)
    // Output: 10000
}
