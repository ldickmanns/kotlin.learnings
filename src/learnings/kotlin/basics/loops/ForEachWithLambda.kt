package learnings.kotlin.basics.loops

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val list = (1..5).toList()

    // Normal foreach
    for (i in list) {
        print(i)
    }
    println()

    // Lambda foreach
    list.forEach { i -> print(i)}
}

/****************
 * Output:      *
 * 12345        *
 * 12345        *
 ****************/

