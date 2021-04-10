package concepts.classesAndObjects

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

/** Standard type-safe enumeration. Each enum is an instance of the enum class */
enum class Direction {
    LEFT, RIGHT
}

/** When statements with enums must be exhaustive, otherwise you get a compiler error */
fun printDirection(direction: Direction) = when (direction) {
    Direction.LEFT -> println("Going left!")
    Direction.RIGHT -> println("Going right!")
}

/** Enums can also have properties */
enum class Distance(val meter: Int) {
    SHORT(25),
    MEDIUM(50),
    LONG(100)
}

fun main() {
    printDirection(Direction.RIGHT)             /** Output: Going right! */
    println(
        "${Direction.LEFT.name} is declared at position " +
        "${Direction.LEFT.ordinal} in the ${Direction.LEFT.declaringClass}"
    ) /** Output:
          LEFT is declared at position in the class concepts.classesAndObjects.Direction */

    /** Enums are comparable ordered by the order in which they are defined */
    println(Distance.SHORT < Distance.MEDIUM)   /** Output: true */

    /** You can access the properties as usual */
    println(Distance.LONG.meter)                /** Output: 100 */
}
