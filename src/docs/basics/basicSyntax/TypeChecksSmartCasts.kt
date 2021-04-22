package docs.basics.basicSyntax

/*******************************
 * Kotlin Learnings            *
 * @kotlin.learnings           *
 *******************************
 * Type Checks and Smart Casts *
 *******************************/

open class Animal

class Cat : Animal() {
    fun meow() = println("Meow!")
}

class Dog : Animal() {
    fun bark() = println("Woof!")
}

fun howDoesTheAnimalDo(animal: Animal) {
    /** The 'is' operator checks the type of an instance */
    when (animal) {
        is Cat -> animal.meow()     /** Smart cast to Cat */
        is Dog -> animal.bark()     /** Smart cast to Dog */
    }
}

fun main() {
    howDoesTheAnimalDo(Cat())   // Output: Meow!
    howDoesTheAnimalDo(Dog())   // Output: Woof!
}
