package docs.concepts.classesAndObjects.inheritance

/*************************
 * Kotlin Learnings      *
 *************************
 * Overriding Properties *
 *************************/

/** Similar to functions, you can override properties in a subclass. */
abstract class APIService {
    /** As functions, overridable properties must use the``` ```**open** keyword. */
    open val url = "https://cool.api.com"

    /* More code */
}

object DefaultAPIService : APIService() {  /* More code */ }

object GermanAPIService : APIService() {
    /** Overriding must be made explicit with the``` ```**override** keyword. */
    override val url = "https://cool.api.de"

    /* More code */
}

fun main() {
    println("The default API URL is ${DefaultAPIService.url}")
    println("The german API URL is ${GermanAPIService.url}")
}
