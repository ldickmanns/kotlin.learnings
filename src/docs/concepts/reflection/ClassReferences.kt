package docs.concepts.reflection

import kotlin.reflect.KClass

/********************
 * Kotlin Learnings *
 ********************
 * Class References *
 ********************/

class Empty

fun main() {
    /** You can obtain the Kotlin class (KClass) with the class literal syntax */
    val cls: KClass<Empty> = Empty::class
    println("The class name is ${cls.simpleName}")
    // Output: The class name is Empty

    /** The `.java` property of a KClass instance holds the Java class reference */
    val jCls = cls.java
    println("The Java class is a ${jCls::class}")
    // Output: The Java class is a class java.lang.Class
}
