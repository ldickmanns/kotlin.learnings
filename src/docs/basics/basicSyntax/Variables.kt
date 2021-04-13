package docs.basics.basicSyntax

import kotlin.random.Random

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Variables            *
 ************************/

fun main() {
    /** The val keyword defines a read-only variable */
    val hello: String = "Hello "

    /** You can omit the type, if the compiler can infer it */
    val world = "World!"

    println(hello + world)  /** Output: Hello World! */

    val random = Random(42)
    /** Use var if you want to reassign your variable */
    var i = random.nextInt(until = 42)
    println(i)              /** Output: 41 */
    i = random.nextInt(until = 42)
    println(i)              /** Output: 6 */
}

