package docs.concepts.classesAndObjects

/********************
 * Kotlin Learnings *
 ********************
 * Type Aliases     *
 ********************/

/** Working with long or functional types can decrease readability */
fun Int.check(predicate: (Int) -> Boolean) = predicate(this)

/** For that, you can introduce a typealias */
typealias IntPredicate = (Int) -> Boolean

fun Int.readableCheck(predicate: IntPredicate) = predicate(this)

fun main() {
    /** They work exactly the same and interchangeably */
    val concisePredicate: IntPredicate = { it == 42 }
    println(43.check(concisePredicate))

    val predicate: (Int) -> Boolean = { it == 42 }
    println(42.readableCheck(predicate))
}
