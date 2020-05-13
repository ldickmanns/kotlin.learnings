package oop.concepts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Creating Houses.
    val house = House()
    val familyHouse = FamilyHouse()

    // Both are of type House.
    println(house is House)
    println(familyHouse is House)

    // FamilyHouse is a subtype of House.
    println(house is FamilyHouse)
    println(familyHouse is FamilyHouse)
}

open class House {}

open class FamilyHouse : House() {}

/************
 * Output:  *
 * true     *
 * true     *
 * false    *
 * true     *
 ************/
 
 