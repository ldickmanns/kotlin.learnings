package learnings.kotlin.oop.concepts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val bus = BusImpl()
    val taxi = BusTaxi(bus)
    taxi.drive()
    taxi.pickPeopleUp()
    taxi.drive()
    taxi.dropPeople()
}

interface Bus {
    fun drive()
}

class BusImpl : Bus {
    override fun drive() = println("Diving")
}

class BusTaxi(bus: Bus) : Bus by bus {
    fun pickPeopleUp() = println("Picking up people")
    fun dropPeople() = println("Dropping people")
}

/************************
 * Output:              *
 * Diving               *
 * Picking up people    *
 * Diving               *
 * Dropping people      *
 ************************/

