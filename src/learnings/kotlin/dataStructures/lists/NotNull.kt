package learnings.kotlin.dataStructures.lists

data class User(
    val name: String,
    val age: Int,
)

fun main() {
    val alice = User("Alice", 21)
    val moviesForAlice = getRecommendations(alice)
    println(moviesForAlice)

    val bob = User("Bob", 17)
    val moviesForBob = getRecommendations(bob)
    println(moviesForBob)
}

fun getRecommendations_(user: User): List<String> {
    val movies = mutableListOf<String>()
    movies.add("Comedy")
    movies.add("Documentation")
    if (user.age >= 16) movies.add("Action")
    if (user.age >= 18) movies.add("HorrorD")
    movies.add("Love Story Movie")
    return movies
}

fun getRecommendations__(
    user: User
) = mutableListOf<String>().apply {
    add("Comedy")
    add("Documentation")
    if (user.age >= 16) add("Action")
    if (user.age >= 18) add("HorrorD")
    add("Love Story Movie")
}.toList()

fun getRecommendations(user: User) = listOfNotNull(
    "Comedy Movie",
    "Documentation",
    "Action Movie".takeIf { user.age >= 16 },
    "Horror Movie".takeIf { user.age >= 18 },
    "Love Story Movie",
)
