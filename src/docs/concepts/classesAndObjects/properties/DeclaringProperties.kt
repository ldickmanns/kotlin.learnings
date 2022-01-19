package docs.concepts.classesAndObjects.properties

/************************
 * Kotlin Learnings     *
 ************************
 * Declaring Properties *
 ************************/

/**
 * Properties can be mutable or immutable:
 */
class Book(
    /** Immutable *val*. */
    val name: String,
    /** Mutable *var*. */
    var price: Int
)

fun main() {
    val ca = Book("Clean Architecture", 25)
    // Directly access variable via the variable name
    println(ca.name)    // Clean Architecture

    // A var can be changed:
    ca.price = 22
    println(ca.price)   // 22
}
