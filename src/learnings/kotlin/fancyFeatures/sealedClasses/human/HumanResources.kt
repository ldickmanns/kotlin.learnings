package learnings.kotlin.fancyFeatures.sealedClasses.human

import learnings.kotlin.fancyFeatures.sealedClasses.Gender

sealed class HumanResources(override var gender: Gender? = Gender.NotExplicit,
                            override var name: String,
                            override var lastName: String): People

class Receptionist(
        hotel: String,
        name: String,
        lastName: String
): HumanResources(name = name, lastName = lastName)

class Manager(
        var seniority: String? = "JR",
        var category: String? = "learnings.kotlin.fancyFeatures.sealedClasses.human.Manager Staff",
        yearsOfExperience: Int,
        name: String,
        lastName: String,
): HumanResources(name = name, lastName = lastName) {
    init {
        when {
            yearsOfExperience > 5 -> {
                seniority = "SR"
                category = "SR learnings.kotlin.fancyFeatures.sealedClasses.human.Manager"
            }
            yearsOfExperience > 3 -> {
                seniority = "SSR"
                category = "Trainee learnings.kotlin.fancyFeatures.sealedClasses.human.Manager"
            }
        }
    }
}

