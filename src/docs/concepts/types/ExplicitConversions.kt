package docs.concepts.types

/************************
 * Kotlin Learnings     *
 ************************
 * Explicit Conversions *
 ************************/

fun main() {
    val i: Int = 5
    println(i is Int)
    // Output: true
    /** The following would result in a type
     *  mismatch as Int is not a subtype of Long */
    // val l: Long = i
    /** Therefore, conversions must be explicit */
    val l: Long = i.toLong()
    println(l is Long)
    // Output: true

    /** However, many operators are overloaded to
     *  accept e.g. an Int and a Long */
    val sum = i + l
    println(l is Long)
    // Output: true
}
