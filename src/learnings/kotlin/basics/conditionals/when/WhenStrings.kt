package learnings.kotlin.basics.conditionals.`when`

/*********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 *********************/

fun main() {
    val greet = "Hello!"
    when (greet) {
        "Hola!" -> print("Spanish!")
        "Hello!" -> print("English!")
        "Hallo!" -> print("German!")
        else -> print("Unsupported language!")
    }
}

/************
 * Output:  *
 * English! *
 ************/


