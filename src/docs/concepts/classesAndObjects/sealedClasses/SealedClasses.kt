package docs.concepts.classesAndObjects.sealedClasses

/********************
 * Kotlin Learnings *
 ********************
 * Sealed Classes   *
 ********************/

/** Sealed classes allow you to restrict class hierarchies. */
sealed class Response {
    /** Direct subclasses have to be in the same package. */
    class Success(val json: String) : Response()
    /** Thus all direct subclasses are known at compile time. */
    class Error(val throwable: Throwable) : Response()
    /** Both classes and object can implement sealed classes. */
    object Loading : Response()
}

/** Knowing all direct subclasses allows for exhaustive when statements: */
fun printResponseState(response: Response) = when (response) {
    /** Smart casts come in handy here. */
    is Response.Success -> println("Received JSON:\n${response.json}")
    is Response.Error -> {
        println("Failed with:\n${response.throwable.message}")
        response.throwable.stackTrace.forEach { println(it) }
    }
    Response.Loading -> println("Please wait for the result to load.")
    // No else needed here; all direct subclasses are known at compile time
}

fun main() {
    printResponseState(Response.Loading)
    // Please wait for the result to load.
}
