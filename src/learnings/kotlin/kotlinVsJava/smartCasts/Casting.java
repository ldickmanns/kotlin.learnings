package learnings.kotlin.kotlinVsJava.smartCasts;

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

public class Casting {
    public static void main(String[] args) {
        Object o = new String("Hello");
        if (o instanceof String) {
            String s = (String)o;
            System.out.println(s.length());
        }
    }
}

/****************
 * Output:      *
 *              *
 ****************/

