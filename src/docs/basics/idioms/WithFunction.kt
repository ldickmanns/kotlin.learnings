package docs.basics.idioms

/********************
 * Kotlin Learnings *
 ********************
 * with Function    *
 ********************/

/** With the with function, you can call
 *  multiple methods on an object instance */
fun main() {
    val list = mutableListOf(1, 2, 3)

    val arr = with(list) {
        add(4)                  // [1, 2, 3, 4]
        add(0, 0) // [0, 1, 2, 3, 4]
        removeAt(2)       // [0, 1, 3, 4]
        toIntArray()
    } /** You can return something other than list */

    println(arr.contentToString())
    // Output: [0, 1, 3, 4]
}
