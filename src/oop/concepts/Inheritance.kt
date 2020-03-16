package oop.concepts

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

fun main() {
    // Animal.
    val wolf = Animal("Wolf")
    wolf.call()

    // Cat.
    val cat = Cat("Catty")
    // Inherited function.
    cat.call()
    // Extending function
    cat.meow()

}

open class Animal(private var name: String) {
    fun call() = println("$name!")
}

class Cat(name: String) : Animal(name) {
    fun meow() = println("Meow!")
}

/****************
 * Output:      *
 * Wolf!        *
 * Catty!       *
 * Meow!        *
 ****************/

