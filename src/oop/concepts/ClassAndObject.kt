package oop.concepts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val car = Car("BMW")
    nameAndSpeed(car)

    car.accelerate(20.0)
    nameAndSpeed(car)

    car.stop()
    nameAndSpeed(car)
}

fun nameAndSpeed(car: Car) {
    println("${car.name} drives at ${car.speed} km/h")
}

class Car(var name: String) {
    var speed = 0.0
        private set

    fun accelerate(speed: Double) { this.speed = speed }

    fun stop() { this.speed = 0.0 }
}

/****************************
 * Output:                  *
 * BMW drives at 0.0 km/h   *
 * BMW drives at 20.0 km/h  *
 * BMW drives at 0.0 km/h   *
 ****************************/
 
 