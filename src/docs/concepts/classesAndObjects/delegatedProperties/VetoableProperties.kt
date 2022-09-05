package docs.concepts.classesAndObjects.delegatedProperties

import kotlin.properties.Delegates

/***********************
 * Kotlin Learnings    *
 ***********************
 * Vetoable Properties *
 ***********************/

class Journey {
    var distanceTraveled by Delegates.vetoable(0) {
        _, oldValue, newValue -> newValue > oldValue
    }
}

fun main() {
    val myJourney = Journey()
    println(myJourney.distanceTraveled) // 0
    // Driving...
    myJourney.distanceTraveled = 100
    println(myJourney.distanceTraveled) // 100
    // Trying to decrease (which is prohibited by vetoable)
    myJourney.distanceTraveled = 80
    println(myJourney.distanceTraveled) // 100
}
