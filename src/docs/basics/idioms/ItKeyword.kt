package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * it Keyword           *
 ************************/

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    /** Normal Lambda */
    val mappedList = list.map { i -> i + 2 }
    /** 'it' is the implicit name of a single parameter */
    val filteredList = list.filter { it >= 3 }

    println(mappedList)     // Output: [3, 4, 5, 6, 7]
    println(filteredList)   // Output: [3, 4, 5]
}
