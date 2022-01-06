package news

/********************
 * Kotlin Learnings *
 ********************
 * List Builder     *
 ********************/

fun main() {
    val neg = listOf(-3, -2, -1)

    val numbers = buildList {
        addAll(neg)
        add(0)
        addAll(1..3)
    }

    println(numbers)
}
