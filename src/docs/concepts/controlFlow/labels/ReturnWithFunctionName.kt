package docs.concepts.controlFlow.labels

/*****************************
 * Kotlin Learnings          *
 *****************************
 * Return with Function Name *
 *****************************/

fun functionReturn() {
    listOf("Car", "Ball", "Cat").forEach {
        if (it == "Ball") return@forEach
        println(it)
    }
    println("Reachable")
}

fun main() {
    functionReturn()
    // Output:
    // Car
    // Cat
    // Reachable
}
