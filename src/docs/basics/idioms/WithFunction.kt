package docs.basics.idioms

/********************
 * Kotlin Learnings *
 ********************
 * with Function    *
 ********************/

/** With the with function, you can call
 *  multiple methods on an object instance */
fun main() {
    val i = 5

    with(i) {
        plus(2)     // 7
        minus(5)    // 2
        times(3)    // 6
    }

    println(i)
    // Output: 6
}
