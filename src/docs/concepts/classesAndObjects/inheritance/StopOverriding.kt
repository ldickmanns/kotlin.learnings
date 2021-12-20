
    package docs.concepts.classesAndObjects.inheritance

    /********************
     * Kotlin Learnings *
     ********************
     * Stop Overriding  *
     ********************/

    /**
     * In previous posts, you learnt how to declare overridable functions and properties.
     *
     * But what if you want to prevent further overriding of an overridden function/property?
     */
    enum class NumberType { INTEGER, FLOATING_POINT }

    /** Numbers are either integer numbers or floating point numbers. */
    interface Number {
        val numberType: NumberType
    }

    open class IntegerNumber : Number {
        /**
         * This class should be the superclass for all more specific types of integer numbers.
         *
         * Therefore, subclasses are also all integers. Thus, [numberType] should remain
         *
         * [NumberType.INTEGER]. To prevent [numberType] from changing, we declare it as **final**.
         */
        final override val numberType = NumberType.INTEGER
    }

    class SomeOtherNumber : IntegerNumber() {
        /** Having the [numberType]``` ```modified as **final** prevents errors like this. */
        // override val numberType = NumberType.FLOATING_POINT
    }



    