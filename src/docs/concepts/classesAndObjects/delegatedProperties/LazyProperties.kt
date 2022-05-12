package docs.concepts.classesAndObjects.delegatedProperties

/********************
 * Kotlin Learnings *
 ********************
 * Lazy Properties  *
 ********************/

fun main() {
    val lazyVariable by lazy {
        println("This is printed second")
        "This is printed last"
    }

    println("This is printed first")
    println(lazyVariable)
}
