package quizzes

fun main() {
    val lazy = lazy { 42 }
    println(lazy::class.simpleName)
}
