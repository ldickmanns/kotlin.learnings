package docs.standardLibrary.scopeFunctions

/********************
 * Kotlin Learnings *
 ********************
 * With             *
 ********************/

fun buildCarWith(carBuilder: CarBuilder) {
    val car = with(carBuilder) {
        addLeatherSeats()
        addRoofWindow()
        addSeatHeating()
        addBackwardsCamera()
    }.build()
    println(car)
}
