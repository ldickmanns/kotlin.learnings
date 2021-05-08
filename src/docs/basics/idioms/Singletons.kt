package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Singletons            *
 ************************/

/** You can declare a Singleton with the 'object' keyword */
object Calculator {
    const val name = "Calculator Singleton"

    fun average(x: Double, y: Double) = (x + y) / 2
}

fun main() {
    /** No need to instantiate an object */
    println(Calculator.name)
    // Output: Calculator Singleton

    println(Calculator.average(1.0, 2.0))
    // Output: 1.5
}


// 8