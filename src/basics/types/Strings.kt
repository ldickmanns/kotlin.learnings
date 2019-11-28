package basics.types

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    // String
    val s1 = "Hi"

    // Iterating over it
    for (c in s1) {
        println(c)
    }

    // Concatenation
    val s2 = s1 + "!"
    println(s2)

    // String templates
    val i = 3
    val s3 = "${i}rd String"
    println(s3)
}

/****************
 * Output:      *
 * H            *
 * i            *
 * Hi!          *
 * 3rd String   *
 ****************/

