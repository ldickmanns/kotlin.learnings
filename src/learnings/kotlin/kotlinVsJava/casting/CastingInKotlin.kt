package learnings.kotlin.kotlinVsJava.casting

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    /** Widening */
    val i = 3
    val l = i.toLong()

    /** Explicit cast */
    open class Building
    class House: Building()
    val building: Building = House()
    val house = building as House

    println(i)
    println(l)
    println(house)
}

/****************
 * Output:      *
 *              *
 ****************/

