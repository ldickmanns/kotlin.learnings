package basics

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

enum class Size {
    SMALL, MEDIUM, LARGE
}

fun printSize(size: Size) {
    var sizeString = "The size is "
    sizeString += when (size) {
        Size.SMALL -> "small."
        Size.MEDIUM -> "medium."
        Size.LARGE -> "large."
    }
    println(sizeString)
}

fun main() {
    val list = listOf(Size.SMALL, Size.MEDIUM, Size.LARGE)
    for (size in list) printSize(size)
}

/************************
 * Output:              *
 * The size is small.   *
 * The size is medium.  *
 * The size is large.   *
 ************************/

