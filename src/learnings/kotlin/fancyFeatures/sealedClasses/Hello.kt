package learnings.kotlin.fancyFeatures.sealedClasses

import learnings.kotlin.fancyFeatures.sealedClasses.Gender
import learnings.kotlin.fancyFeatures.sealedClasses.human.Manager

fun main(args: Array<String>) {
    val manager = Manager(yearsOfExperience = 7, name = "Leandro", lastName = "Maro")

    println("learnings.kotlin.fancyFeatures.sealedClasses.human.Manager seniority: ${manager.seniority} and learnings.kotlin.fancyFeatures.sealedClasses.human.Manager gender: ${manager.gender}")
    manager.gender = Gender.Male
    println("learnings.kotlin.fancyFeatures.sealedClasses.human.Manager gender: ${manager.gender}")
}
/*
  Data class wont compile because is outside of sealed package
 */
// data class Test(val test: String) : Human