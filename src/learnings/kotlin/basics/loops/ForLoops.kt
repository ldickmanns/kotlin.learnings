package learnings.kotlin.basics.loops

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val list = (1..5).toList()

    // For Loop:
    for (i in list) {
        print("$i ")
    }

    println()

    // For Loop over ranges:
    for (i in 8 downTo 0 step 2) {
        print("$i ")
    }
}

/****************
 * Output:      *
 * 1 2 3 4 5    *
 * 8 6 4 2 0    *
 ****************/

