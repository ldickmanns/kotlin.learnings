package quizzes

fun main() {
    var three = 3
    var added = ++three + three++
    var next = added++
    println(three)
    println(added)
    println(++next)
}