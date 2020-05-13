package fancyFeatures

import java.util.*

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val ls = LazyScanner()
    val text = ls.scanner.nextLine()
    println(text)
}

class LazyScanner {
    /**
     * Lazy Initialization means that the member value
     * is only initialized if it is needed. This way
     * we only create the Scanner if its accessed.
     */
    val scanner: Scanner by lazy { Scanner(System.`in`) }
}

/************************************
 * Input:   Kotlin Learning rocks!  *
 * Output:  Kotlin Learning rocks!  *
 ************************************/

