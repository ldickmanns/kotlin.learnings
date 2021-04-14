package learnings.kotlin.basics.conditionals

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    val a = 2
    val b = 3

    // One line if
    var max = a
    if (a < b) max = b
    println(max)

    // Multi line if with else
    var min: Int
    if (a < b) {
        min = a
    } else {
        min = b
    }
    println(min)
}

/************
 * Output:  *
 * 3        *
 * 2        *
 ************/

