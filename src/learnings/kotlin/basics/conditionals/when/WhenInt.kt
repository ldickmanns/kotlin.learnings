package learnings.kotlin.basics.conditionals.`when`

import kotlin.random.Random

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val i = Random.nextInt(4)
    println(i)

    when (i) {
        0 -> println("i is zero")
        1 -> println("i is one")
    } /** You don't need to match each case */

    when (i) {
        0, 1 -> println("i is zero or one")     /** Matching multiple cases */
        else -> println("Not zero or one")      /** Default case */
    }

    when (i) {
        in 0..1 -> println("i is zero or one")  /** Matching ranges */
        !in 0..1 -> println("Not zero or one")  /** ! operator can be used as well */
    }

    when (i) {
        is Int -> println("This is a int")      /** Matching type */
        else -> println("This isn't a int")
    }

    when {                                      /** Instead of if - else if chain */
        i % 2 == 0 -> println("This isn't odd")
        i % 2 == 1 -> println("This is odd")
    }
}

/****************
 * Output:      *
 *              *
 ****************/

