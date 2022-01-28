package docs.concepts.classesAndObjects.properties

/********************
 * Kotlin Learnings *
 ********************
 * Backing Fields   *
 ********************/

class SarcasticComedian(isFunny: Boolean) {
    var isFunny: Boolean = !isFunny
        set(value) {
            // The following would cause a StackOverflowError as
            // you recursively call the setter again and again.
            /** isFunny = value */
            /** Instead, use the backing field called "field" */
            field = !value
        }
}

fun main() {
    val sarcasticComedian = SarcasticComedian(false)
    println(sarcasticComedian.isFunny)  // true
    sarcasticComedian.isFunny = true
    println(sarcasticComedian.isFunny)  // false
}
