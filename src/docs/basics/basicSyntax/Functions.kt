package docs.basics.basicSyntax

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Functions            *
 ************************/

/**
 * Standard function. In Kotlin, functions can be top-level. That
 * is, they don't need a surrounding class, object, or interface.
 */
fun mul(x: Int, y: Int): Int {
    return x * y
}

/** Shorter single-expression with inferred return type. */
fun mulShort(x: Int, y: Int) = x * y

/**
 * Functions with no returned value can use Unit as return type.
 * However, Unit can be omitted. Therefore, it's not highlighted.
 */
fun printMul(x: Int, y: Int): Unit {
    println(mul(x, y))
}

fun main() {
    println(mulShort(3, 4))     /** Output: 12 */
    printMul(3, 5)              /** Output: 12 */
}
