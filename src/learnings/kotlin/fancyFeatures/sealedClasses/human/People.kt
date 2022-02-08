package learnings.kotlin.fancyFeatures.sealedClasses.human

import learnings.kotlin.fancyFeatures.sealedClasses.Gender


sealed interface People {
    var gender: Gender?
    var name: String
    var lastName: String
}