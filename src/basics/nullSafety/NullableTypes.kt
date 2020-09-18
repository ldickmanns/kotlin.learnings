package basics.nullSafety

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Non-nullable type
    var a: String
    // a = null // Compiler error

    // Nullable type
    var b: String?
    b = null // No compiler error

    a = "Asdf"
    b = "Asdf"
}

/****************
 * Output:      *
 *              *
 ****************/

