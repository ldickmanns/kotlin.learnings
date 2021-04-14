package learnings.kotlin.basics.nullSafety

import kotlin.random.Random

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val i = Random.nextInt(1, 3)
    val string = if (i > 1) "Greater" else null
    /**
     * The Elvis Operator (?:)
     * If the left-hand side is not null, return
     * it. Otherwise, return the right-hand side.
     */
    val result = string ?: "Equal"
    println(i)
    println(result)
}

/************************
 * Output:              *
 ************************
 * Either:  * Or:       *
 * 1        * 2         *
 * Equal    * Greater   *
 ************************/

