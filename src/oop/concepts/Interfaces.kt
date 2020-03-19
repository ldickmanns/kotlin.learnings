package oop.concepts

import kotlin.math.PI
import kotlin.math.pow

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Circle.
    val circle = Circle(1.0)
    println("Circle: ${circle.area()}")

    // Square.
    val square = Square(2.0)
    println("Square: ${square.area()}")
}

interface IAreaShape{
    fun area(): Double
}

class Circle(private val radius: Double) : IAreaShape {
    override fun area(): Double = radius.pow(2) * PI
}

class Square(private val sideLength: Double) : IAreaShape {
    override fun area(): Double = sideLength.pow(2)
}

/********************************
 * Output:                      *
 * Circle: 3.141592653589793    *
 * Square: 4.0                  *
 ********************************/

