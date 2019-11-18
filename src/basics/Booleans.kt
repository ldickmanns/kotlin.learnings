package basics

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    // Boolean
    val t = true
    val f = false

    // Conjunction
    println(t.and(f))
    // Lazy Conjunction
    println(t && f)

    // Disjunction
    println(t.or(f))
    // Lazy Disjunction
    println(t || f)
}

/****************
 * Output:      *
 * false        *
 * false        *
 * true         *
 * true         *
 ****************/

