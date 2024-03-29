package learnings.kotlin.dataStructures.lists

data class User(
    val name: String,
    val age: Int,
)

fun main() {
    val alice = User("Alice", 21)
    val moviesForAlice = getRecommendations(alice)
    println(moviesForAlice)
    // [Comedy, Documentation, Action, Horror, Love Story]

    val bob = User("Bob", 17)
    val moviesForBob = getRecommendations(bob)
    println(moviesForBob)
    // [Comedy, Documentation, Action, Love Story]

    val charlie = User("Charlie", 14)
    val moviesForCharlie = getRecommendations(charlie)
    println(moviesForCharlie)
    // [Comedy, Documentation, Love Story]
}

fun getRecommendations_(user: User): List<String> {
    val movies = mutableListOf<String>()
    movies.add("Comedy")
    movies.add("Documentation")
    if (user.age >= 16) movies.add("Action")
    if (user.age >= 18) movies.add("Horror")
    movies.add("Love Story")
    return movies
}

fun getRecommendations__(
    user: User
) = mutableListOf<String>().apply {
    add("Comedy")
    add("Documentation")
    if (user.age >= 16) add("Action")
    if (user.age >= 18) add("Horror")
    add("Love Story")
}.toList()

fun getRecommendations(user: User) = listOfNotNull(
    "Comedy",
    "Documentation",
    "Action".takeIf { user.age >= 16 },
    "Horror".takeIf { user.age >= 18 },
    "Love Story",
)
