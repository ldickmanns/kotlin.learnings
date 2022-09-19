package docs.standardLibrary.scopeFunctions

class Logger(private val tag: String) {
    fun log(string: String) = println("$tag: $string")
}

data class Person(val name: String, var age: Int) {
    private val logger = Logger(this::class.simpleName ?: "Person")

    fun isOfLegalAge() = (age >= 18).also {
        if (it) logger.log("$name is of legal age")
        else logger.log("$name is not of legal age")
    }
}

fun main() {
    var a = 42
    var b = 69

    a = b.also { b = a }

    println(a) // 69
    println(b) // 42

    val me = Person("Ludwig", 26)
    me.isOfLegalAge()
    // Person: Ludwig is of legal age
}
