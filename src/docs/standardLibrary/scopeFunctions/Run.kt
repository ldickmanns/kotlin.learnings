package docs.standardLibrary.scopeFunctions

/********************
 * Kotlin Learnings *
 ********************
 * Run              *
 ********************/

fun buildCarRun(carBuilder: CarBuilder): Car {
    val car = carBuilder.run {
        addLeatherSeats()
        addRoofWindow()
        addSeatHeating()
        addBackwardsCamera()
        build()
    }

    println("Built car!")

    return car
}

fun main() {

}
