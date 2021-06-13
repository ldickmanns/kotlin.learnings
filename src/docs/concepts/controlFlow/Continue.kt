package docs.concepts.controlFlow

/********************
 * Kotlin Learnings *
 ********************
 * Continue         *
 ********************/

fun main() {
    for (i in 1..5) {
        /** Jump to the next step */
        if (i == 3) continue
        println(i)
    }
    /*
     * Output:
     * 1
     * 2
     * 4
     * 5
     */
}
