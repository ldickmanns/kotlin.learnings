package docs.concepts.classesAndObjects.inheritance

/************************
 * Kotlin Learnings     *
 ************************
 * Initialization Order *
 ************************/

open class Character(val name: String) {
    init { println("$name has been created!") }

    /** Pay extra attention to open properties. */
    open val hp = 100

    /** IntelliJ even warns you when using a non-final property in the constructor. */
    init { println("$name has $hp HP.") }
}

class Warrior(name: String) : Character(name) {
    /** It warns you because the property can be overridden leading to undesired behavior. */
    override val hp = 250.also {
        println("$name has $it HP.")
    }
}

fun main() {
    /** The superclass is initialized first. Therefore, the following happens: */
    val warrior = Warrior("Hans")
    /**************************
     * Output:                *
     **************************
     * Hans has been created! *
     * Hans has 100 HP.       *
     * Hans has 250 HP.       *
     **************************/
}
