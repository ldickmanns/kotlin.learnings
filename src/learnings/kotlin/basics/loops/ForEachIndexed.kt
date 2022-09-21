package learnings.kotlin.basics.loops

fun main() {
    val list = listOf("Alice", "Bob")
    list.forEachIndexed { i, name ->
        println("$i: $name")
    }
    // 0: Alice
    // 1: Bob
}
