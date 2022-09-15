package quizzes

fun main() {
    for (i in Test()) println(i)

    for (j in Test2()) println(j)

    for (k in Test3()) println(k)
}

val iterator: Iterator<Int>
    get() = object : Iterator<Int> {
        var hasNext = true
        override fun hasNext(): Boolean = hasNext.also { hasNext = false }

        override fun next(): Int = 1
    }

class Test : Iterable<Int> {
    override fun iterator(): Iterator<Int> = iterator
}

class Test2 : Iterator<Int> by iterator

class Test3 {
    operator fun iterator(): Iterator<Int> = iterator
}
