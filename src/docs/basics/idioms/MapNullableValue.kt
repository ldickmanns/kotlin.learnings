package docs.basics.idioms

/************************
 * Kotlin Learnings     *
 ************************
 * Map a nullable value *
 * with a default value *
 ************************/

fun plusTenToString(i: Int?): String {
    /** Safe call (?.) */
    return i?.let {
        val plusTen = it + 10
        plusTen.toString()
    } ?: "No int was passed in"
    /** Elvis operator for default value */
}

fun main() {
    val s1 = plusTenToString(null)
    println(s1)
    // Output: No inst was passed in

    val s2 = plusTenToString(10)
    println(s2)
    // Output: 20
}
