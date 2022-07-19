package docs.concepts.classesAndObjects.inheritance

/************************
 * Kotlin Learnings     *
 ************************
 * Multiple Inheritance *
 ************************/

// TODO idea

interface Drawable {
    fun draw() = println("Drawing a Drawable")
}

open class Circle {
    open fun draw() = println("Drawing a Circle")
}

class DrawableCircle : Circle(), Drawable {
    override fun draw() {
        super<Drawable>.draw()
        super<Circle>.draw()
    }
}

fun main() {
    DrawableCircle().draw()
}
