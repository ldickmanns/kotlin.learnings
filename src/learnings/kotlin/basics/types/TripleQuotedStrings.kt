package learnings.kotlin.basics.types

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    val greet = """
        Hello, this is a raw String.
        This means no escaping is required
        and it can contain newlines.
    """.trimIndent()
    println(greet)
    /****************************************
     * Output:                              *
     * Hello, this is a raw String.         *
     * This means no escaping is required   *
     * and it can contain newlines.         *
     ****************************************/

    val margins = """
        #  The trimMargin function can be used
        #to indicate which leading whitespaces
        #   should be removed from the String.
    """.trimMargin("#")
    println(margins)
    /********************************************
     * Output:                                  *
     *   The trimMargin function can be used    *
     * to indicate which leading whitespaces    *
     *    should be removed from the String.    *
     ********************************************/
}



