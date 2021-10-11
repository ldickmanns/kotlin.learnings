package docs.concepts.classesAndObjects.classes

/********************
 * Kotlin Learnings *
 ********************
 * Classes          *
 ********************/

/** Classes are defined with the class
 *  keyword and can be empty */
class EmptyClass

fun main() {
    val ec = EmptyClass()

    println(ec::class.simpleName)
    // Output: EmptyClass
}
