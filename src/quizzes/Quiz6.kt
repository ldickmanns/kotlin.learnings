package quizzes

/********************
 * Kotlin Learnings *
 ********************
 * Quiz 6           *
 ********************/

@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val range1 = 1..5
    val range2 = 1..<5
    println(1 in range1)
    println(1 in range2)
    println(5 in range1)
    println(5 in range2)
}
