package docs.concepts.controlFlow

/********************
 * Kotlin Learnings *
 ********************
 * Break            *
 ********************/

fun main() {
    for (i in 1..5) {
        println(i)
        if (i == 3) {
            println("i is 3")
            /** Jump out of the nearest
             *  enclosing loop with break */
            break
        }
    }
    /*
     * Output:
     * 1
     * 2
     * 3
     * i is 3
     */
}
