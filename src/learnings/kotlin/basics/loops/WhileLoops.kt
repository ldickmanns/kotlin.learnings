package learnings.kotlin.basics.loops

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    var i = 0

    // while loop
    while (i < 5) {
        print("$i, ")
        ++i
    }

    // do-while loop
    do {
        print(i)
    } while (i < 5)
}

/********************
 * Output:          *
 * 0, 1, 2, 3, 4, 5 *
 ********************/

