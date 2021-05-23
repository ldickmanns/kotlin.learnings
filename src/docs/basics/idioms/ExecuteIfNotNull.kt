package docs.basics.idioms

/***********************
 * Kotlin Learnings    *
 ***********************
 * Execute if not null *
 ***********************/

/** Expression body + safe call (?.) */
fun printIfNotNull(i: Int?) = i?.let {
    println(it)
}

fun main() {
    printIfNotNull(null)
    // No output

    printIfNotNull(10)
    // Output: 10
}
