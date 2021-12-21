package docs.concepts.classesAndObjects.inheritance

/************************
 * Kotlin Learnings     *
 ************************
 * Super Implementation *
 ************************/

open class Employee {
    /** Base salary for every employee. */
    open fun computeSalary() = 100
}

class SoftwareEngineer : Employee() {
    /** Use base salary to compute salary. */
    override fun computeSalary() =
        super.computeSalary() + 50
}

fun main() {
    println(Employee().computeSalary())         // 100
    println(SoftwareEngineer().computeSalary()) // 150
}
