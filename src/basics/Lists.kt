package basics

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    // Immutable list
    val iList = listOf(1, 2, 3)

    // Mutable list
    val mList = mutableListOf(1, 2, 3)

    // Adding an element
    mList.add(4)
    println(mList)
    mList.add(1, 0)
    println(mList)

    // Retrieving elements
    println(mList[3])

    // Removing an element
    mList.remove(0)
    println(mList)

    // Iterating over the elements
    for (element in iList) {
        print(element)
    }
}

/********************
 * Output:          *
 * [1, 2, 3, 4]     *
 * [1, 0, 2, 3, 4]  *
 * 3                *
 * [1, 2, 3, 4]     *
 * 123              *
 ********************/

