package learnings.kotlin.kotlinVsJava.containsVsIn

fun main() {
    val list = (0..4).toList()

    println(list.contains(2)) // true
    println(list.contains(5)) // false
}
