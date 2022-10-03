package docs.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        delay(1000)
        println("Kotlers!")
    }
    print("Hello ")
    // Output: Hello Kotlers!
}
