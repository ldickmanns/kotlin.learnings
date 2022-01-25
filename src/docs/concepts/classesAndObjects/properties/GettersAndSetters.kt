package docs.concepts.classesAndObjects.properties

/***********************
 * Kotlin Learnings    *
 ***********************
 * Getters and Setters *
 ***********************/

class Person(age: Int) {
    var age = age
        /** Prohibit direct setting by making the setter private. */
        private set

    /**
     * This is called a computed property, because "get"
     *
     * is called every time the property is accessed.
     */
    val isAdult get() = age >= 18

    fun birthday() {
        age += 1
    }
}

fun main() {
    val person = Person(17)
    println(person.age)     // 17
    println(person.isAdult) // false
    person.birthday()
    println(person.age)     // 18
    println(person.isAdult) // true
}
