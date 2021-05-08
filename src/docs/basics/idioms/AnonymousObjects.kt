package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Anonymous Objects    *
 ************************/

interface Greeter {
    fun greet(name: String)
}


fun main() {
    /** Anonymous Object implementing Greeter */
    val englishGreeter = object : Greeter {
        override fun greet(name: String) {
            println("Hello $name!")
        }
    }

    englishGreeter.greet("Ludwig")
    // Output: Hello Ludwig!
}
