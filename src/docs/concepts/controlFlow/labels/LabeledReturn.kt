package docs.concepts.controlFlow.labels

/********************
 * Kotlin Learnings *
 ********************
 * Labeled Return   *
 ********************/

fun normalReturn() {
    listOf("Car", "Ball", "Cat").forEach {
        if (it == "Ball") return
        println(it)
    }
    println("Unreachable")
}

fun labeledReturn() {
    listOf("Car", "Ball", "Cat").forEach here@{
        if (it == "Ball") return@here
        println(it)
    }
    println("Reachable")
}

fun main() {
    normalReturn()
    // Output: Car

    labeledReturn()
    // Output:
    // Car
    // Reachable
}
