package docs.concepts.classesAndObjects

/********************
 * Kotlin Learnings *
 ********************
 * Init             *
 ********************/

/** The primary constructor cannot execute any code */
class NPCCharacter(val name: String) {
    var hp = 100.also { println("HP: $it") }

    /** Therefore, initializing code is put in init blocks */
    init {
        println("Character $name is initialized!")
    }

    var atk = 30.also { println("ATK: $it") }

    /** Initialization of properties and init blocks happens top-to-bottom */
    init {
        println("Character $name has been spawned!")
    }
}

fun main() {
    val smith = NPCCharacter("Smith")
    // Output (in that order):
    // HP: 100
    // Character Smith is being initialized!
    // ATK: 30
    // Character Smith has been spawned!

    println("Status ${smith.name}: ${smith.hp}HP, ${smith.atk}ATK.")
    // Output:
    // Status Smith: 100HP, 30ATK.
}
