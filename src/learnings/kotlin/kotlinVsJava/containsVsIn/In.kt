package learnings.kotlin.kotlinVsJava.containsVsIn

fun main() {
    val list = (0..4).toList()

    println(2 in list) // true
    println(5 in list) // false
}
