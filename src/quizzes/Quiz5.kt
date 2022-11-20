package quizzes

open class Car {
    open val hp = 100

    init {
        println("Created car with $hp HP")
    }
}

class SportsCar : Car() {
    override val hp: Int = 300
}

fun main() {
    Car()
    SportsCar()
}
