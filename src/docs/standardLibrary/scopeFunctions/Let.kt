package docs.standardLibrary.scopeFunctions

import kotlin.random.Random

/********************
 * Kotlin Learnings *
 ********************
 * Let              *
 ********************/

interface NumberGenerator {
    fun generateNumber(): Int?
}

fun generateSquaredNumber(
    numberGenerator: NumberGenerator
): Int {
    val number = numberGenerator.generateNumber()
    return number?.let { it * it } ?: error(
        "Generator did not provide a number"
    )
}

fun main() {
    val randomNumberGenerator = object : NumberGenerator {
        override fun generateNumber(): Int? = Random.nextInt()
    }

    val randomSquaredNumber = generateSquaredNumber(randomNumberGenerator)
    println(randomSquaredNumber)

    val nullNumberGenerator = object :NumberGenerator {
        override fun generateNumber(): Int? = null
    }

    // Throws IllegalStateException
    generateSquaredNumber(nullNumberGenerator)
}
