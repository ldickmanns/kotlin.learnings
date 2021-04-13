package learnings.kotlin.basics.nullSafety

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val list: List<Int>? = listOf(1, 2, 3, 4, 5)
    val length: Int? = list?.size
    println(length)
}

/****************
 * Output:      *
 *              *
 ****************/

