package learnings.kotlin.basics.types

fun main() {
    val notSoReadable = 1000000
    println(notSoReadable) // 1000000

    val wayBetter = 1_000_000
    println(wayBetter) // 1000000

    val thisAlsoWorksWithFloatingPointNumbers = 1_234_567.89
    println(thisAlsoWorksWithFloatingPointNumbers) // 1234567.89
}
