package basics.conditionals.assignment

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    val int = (1..1000).shuffled().first();
    val size = if (int < 500) "Small" else "Large"
    println("$size Number")
}

/********************
 * Output Options:  *
 ********************
 * 1. Option:       *
 * Small Number     *
 *                  *
 * 2. Option:       *
 * Large Number     *
 ********************/

