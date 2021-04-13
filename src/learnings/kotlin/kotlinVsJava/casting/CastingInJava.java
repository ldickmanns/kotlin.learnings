package learnings.kotlin.kotlinVsJava.casting;

/********************
 * Kotlin Learnings   *
 * @kotlin.learnings  *
 ********************/

public class CastingInJava {
    public static void main(String[] args) {
        /** Implicit cast */
        int i = 3;
        long l = i;

        /** Explicit cast */
        class Building {}
        class House extends Building {}
        Building building = new House();
        House house = (House)building;

        System.out.println(i);
        System.out.println(l);
        System.out.println(house);
    }
}

/****************
 * Output:      *
 *              *
 ****************/

