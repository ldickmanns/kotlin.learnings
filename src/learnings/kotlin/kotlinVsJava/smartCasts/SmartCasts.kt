package learnings.kotlin.kotlinVsJava.smartCasts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val a: Any = "Hello"
    if (a is String) {
        // a is automatically casted
        println(a.length)
    }
}

/****************
 * Output:      *
 *              *
 ****************/

