package docs.standardLibrary.scopeFunctions

interface Car

interface CarBuilder {
    fun addLeatherSeats(): CarBuilder
    fun addRoofWindow(): CarBuilder
    fun addSeatHeating(): CarBuilder
    fun addBackwardsCamera(): CarBuilder

    fun build(): Car
}

fun oldBuildCar(carBuilder: CarBuilder): Car {
    val car = carBuilder
        .addLeatherSeats()
        .addRoofWindow()
        .addSeatHeating()
        .addBackwardsCamera()
        .build()
    println("Built car!")
    return car
}

fun buildCar(carBuilder: CarBuilder):Car {
    val car = carBuilder.apply {
        addLeatherSeats()
        addRoofWindow()
        addSeatHeating()
        addBackwardsCamera()
    }.build()

    println("Built car!")

    return car
}

fun main() {

}
