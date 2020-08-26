package kotlinVsJava.defaultArgumentsVsOverloading

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun convertToString(d: Double, toUpperCase: Boolean = false,
                    suffix: String = ""): String {
    val s = "This is a $d$suffix"
    return if (toUpperCase) s.toUpperCase() else s
}

fun main() {
    println(convertToString(2.0))  /** This is a 2.0 */
    println(convertToString(2.0, suffix = " test"))  /** This is a 2.0 test */
    println(convertToString(2.0, true))  /** THIS IS A 2.0 */
    println(convertToString(2.0, true, " test"))  /** THIS IS A 2.0 TEST */
}

