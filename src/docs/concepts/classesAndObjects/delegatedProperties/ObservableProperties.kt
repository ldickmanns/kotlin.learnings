package docs.concepts.classesAndObjects.delegatedProperties

import kotlin.properties.Delegates

/*************************
 * Kotlin Learnings      *
 *************************
 * Observable Properties *
 *************************/

object ObservableSample {
    var value by Delegates.observable("Hello") {
        _, oldValue, newValue ->
        println("$oldValue -> $newValue")
    }
}

fun main() {
    ObservableSample.value = "World"
    println(ObservableSample.value)
}
