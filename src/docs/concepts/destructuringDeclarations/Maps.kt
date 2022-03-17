package docs.concepts.destructuringDeclarations

/********************
 * Kotlin Learnings *
 ********************
 * Maps             *
 ********************/

fun main() {
    val map = mapOf(
        "Mike" to "Car",
        "Luca" to "Motorcycle",
        "Liam" to "Bicycle",
    )
    /** Conveniently traverse a map. */
    for ((person, vehicle) in map) {
        println("$person is driving by $vehicle.")
    }
    // Output:
    // Mike is driving by Car.
    // Luca is driving by Motorcycle.
    // Liam is driving by Bicycle.
}
