package docs.concepts.classesAndObjects.functionalInterfaces

/********************
 * Kotlin Learnings *
 ********************
 * SAM Conversions  *
 ********************/

/**
 * If you want to do the same in Kotlin, you can do it by
 *
 * declaring an interface as functional with the "fun" keyword.
 */
fun interface ArithmeticPrinter {
    fun print(x: Int, y: Int)
}

fun main() {
    /**
     * You can still use an anonymous implementation:
     */
    val plusPrinter = object : ArithmeticPrinter {
        override fun print(x: Int, y: Int) = println(x + y)
    }

    /**
     * However, you get a warning, because you can convert it
     *
     * to a Lambda to make the code more concise and readable:
     */
    val minusPrinter = ArithmeticPrinter { x, y -> println(x - y) }

    plusPrinter.print(2, 2)     // 4
    minusPrinter.print(2, 2)    // 0

    /**
     * You can even implement Java functional interfaces with SAM conversions:
     */
    val times = ArithmeticOperation { x, y -> x * y }
    println(times.operation(2, 2))  // 4
}
