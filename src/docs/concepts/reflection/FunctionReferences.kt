package docs.concepts.reflection

import java.time.LocalDate
import java.time.format.TextStyle
import java.util.*

/***********************
 * Kotlin Learnings    *
 ***********************
 * Function References *
 ***********************/

fun getDayOfWeek(): String {
    val dayOfWeek = LocalDate.now().dayOfWeek
    return dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH)
}

fun printFromFactory(factory: () -> String) {
    val string = factory()
    println(string)
}

fun main() {
    /** `printFromFactory` expects a function producing a String */
    val dowFactory = ::getDayOfWeek
    printFromFactory(dowFactory)
    // Output: Tuesday

    /** We can even inline the call */
    printFromFactory(::getDayOfWeek)
}
