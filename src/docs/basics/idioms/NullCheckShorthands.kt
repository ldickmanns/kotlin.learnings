package docs.basics.idioms

/*************************
 * Kotlin Learnings      *
 * @kotlin.learnings     *
 *************************
 * Null Check Shorthands *
 *************************/

data class Person(val age: Int?)

fun Int.greaterOrEqual(other: Int) = this >= other

fun ofLegalAge(person: Person): Boolean {
    /** '?.' after age executes the function if age is not null */
    /** '?:' returns the left-hand-side if its not null. Otherwise
     *   it returns the right side (false) */
    return person.age?.greaterOrEqual(18) ?: false
}

fun main() {
    val p1 = Person(null)
    val p2 = Person(12)
    val p3 = Person(25)

    println(ofLegalAge(p1)) // false
    println(ofLegalAge(p2)) // false
    println(ofLegalAge(p3)) // true
}
