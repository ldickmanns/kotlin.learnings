package basics.loops

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // continue keyword
    print("Continue:\t")
    for (i in 1..5) {
        if (i == 3) continue
        print("$i, ")
    }
    println()

    // break keyword
    print("Break:\t\t")
    for (i in 1..5) {
        if (i == 3) break
        print("$i, ")
    }
    println()

    // break nested with label
    println("Break nested:")
    outer@
    for (i in 1..5) {
        for (j in 1..2) {
            if (i == 3) break@outer
            print("($i, $j), ")
        }
    }
}

/************************************
 * Output:                          *
 * Continue:	1, 2, 4, 5,         *
 * Break:		1, 2,               *
 * Break nested:                    *
 * (1, 1), (1, 2), (2, 1), (2, 2),  *
 ************************************/

