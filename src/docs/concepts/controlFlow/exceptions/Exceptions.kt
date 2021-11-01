package docs.concepts.controlFlow.exceptions

/********************
 * Kotlin Learnings *
 ********************
 * Exceptions       *
 ********************/

/**
 * You throw exceptions with the "throw" keyword. Also, functions that never return
 * - that is, functions throwing an exception - have "Nothing" as their return type.
 */
fun throwException(): Nothing {
    throw Exception()
}

fun main() {
    throwException()

    // Output:
    // Exception in thread "learnings.kotlin.fancyFeatures.sealedClasses.main" java.lang.Exception: This is an exception
    //     at docs.concepts.controlFlow.exceptions.ExceptionsKt.learnings.kotlin.fancyFeatures.sealedClasses.main(Exceptions.kt:11)
    //     at docs.concepts.controlFlow.exceptions.ExceptionsKt.learnings.kotlin.fancyFeatures.sealedClasses.main(Exceptions.kt)
}
