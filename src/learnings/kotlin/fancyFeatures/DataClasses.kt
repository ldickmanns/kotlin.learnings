package learnings.kotlin.fancyFeatures

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************
 * Data Classes         *
 ************************/

data class InstaPage(val name: String, val followers: Int)

fun main() {
    val kl = InstaPage("Kotlin Learnings", 3000)
    /** The compiler generates a toString method for data classes */
    println(kl.toString())
    // Output: InstaPage(name=Kotlin Learnings, followers=3000)

    /** The compiler also generates a equals method */
    val anotherKl = InstaPage("Kotlin Learnings", 3000)
    println(kl == anotherKl) /** Instead of equals you can use == */
    // Output: true

    /** Also, the compiler generates a copy method, which supports named
     *  arguments to change values */
    val grownKl = kl.copy(followers = 3333)
    println(grownKl)
    // Output: InstaPage(name=Kotlin Learnings, followers=3333)
    /** And, of course, this is not equal to the first kl object, because
     *  the number of followers changed */
    println(kl == grownKl)
    // Output: false

    /** Further, Kotlin supports Destructing Declarations for data classes */
    val (name, followers) = grownKl
    println("$name now has $followers Followers")
    // Output: Kotlin Learnings now has 3333 Followers
}
