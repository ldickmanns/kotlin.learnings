package learnings.kotlin.kotlinVsJava.typeChecks;

/********************
 * Kotlin Learnings   *
 * @kotlin.learnings  *
 ********************/

public class InstanceOf {
    public static void main(String[] args) {
        class Building {}
        class House extends Building {}

        Building building;
        if (Math.random() < 0.5) {
            building = new Building();
        } else {
            building = new House();
        }
        System.out.println(building instanceof House);
        /** true or false. */
    }
}

