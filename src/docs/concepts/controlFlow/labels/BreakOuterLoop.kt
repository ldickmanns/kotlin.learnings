package docs.concepts.controlFlow.labels

/********************
 * Kotlin Learnings *
 ********************
 * Break Outer Loop *
 ********************/

fun main() {
    outer@
    for (i in 1..5) {
        for (j in 1..5) {
            if (i + j == 5) {
                println("i = $i")
                println("j = $j")
                break@outer
            }
        }
    }
    // Output:
    // i = 1
    // j = 4
}
