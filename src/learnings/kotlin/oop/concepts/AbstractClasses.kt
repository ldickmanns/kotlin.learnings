package learnings.kotlin.oop.concepts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Corporate Building.
    val corporateBuilding = CorporateBuilding()
    corporateBuilding.printInformation()

    // Educational Building.
    val educationalBuilding = EducationalBuilding()
    educationalBuilding.printInformation()
}

abstract class Building {
    protected abstract fun getType(): String

    fun printInformation() =
        println("This is a ${this.getType()} building.")
}

class CorporateBuilding : Building() {
    override fun getType() = "corporate"
}

class EducationalBuilding: Building() {
    override fun getType() = "educational"
}

/************************************
 * Output:                          *
 * This is a corporate building.    *
 * This is a educational building.  *
 ************************************/

