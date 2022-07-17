package learnings.kotlin.dataStructures.arrays

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Factory function
    val intArray0 = intArrayOf(0, 1, 2)
    intArray0.forEach { print(it) } // 012
    // Constructor
    val intArray1 = IntArray(3)
    intArray1.forEach { print(it) } // 000
    // Constructor + Lambda
    val intArray2 = IntArray(3) { it * 3 }
    intArray2.forEach { print(it) } // 036
}

/****************
 * Output:      *
 *              *
 ****************/

