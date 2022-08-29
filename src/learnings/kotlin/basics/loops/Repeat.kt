package learnings.kotlin.basics.loops

fun main() {
    repeat(times = 3) {
        println("Hello World!")
    }

    repeat(times = 3) {
        println("Hello World $it!")
    }
    // Hello World 0!
    // Hello World 1!
    // Hello World 2!
}
