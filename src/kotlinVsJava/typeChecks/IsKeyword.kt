package kotlinVsJava.typeChecks

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    open class Building
    class House: Building()

    val building: Building
    building = if (Math.random() < 0.5) {
        House()
    } else {
        Building()
    }
    println(building is House)
    /** true or false. */
}

