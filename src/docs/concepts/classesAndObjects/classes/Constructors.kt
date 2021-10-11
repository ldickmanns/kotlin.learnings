package docs.concepts.classesAndObjects.classes

/********************
 * Kotlin Learnings *
 ********************
 * Constructors     *
 ********************/

/** The primary constructor follows directly
 *  after the class name */
class Item(
    /** Properties can be declared and initialized
     *  in the primary constructor */
    val name: String,
    private val price: Double,
    /** Constructor parameters do not have
     *  val or var in front of them */
    weightInGram: Int,
) {
    /** Constructor parameters can be used to initialize properties */
    private val weightKg: Double = weightInGram.toDouble() / 1000

    fun printInfo() {
        println("Item $name costs $price € and weighs $weightKg kg")
    }
}

fun main() {
    val ball = Item("Ball", 1.99, 500)
    ball.printInfo()
    // Output: Item Ball costs 1.99 € and weighs 0.5 kg
}
