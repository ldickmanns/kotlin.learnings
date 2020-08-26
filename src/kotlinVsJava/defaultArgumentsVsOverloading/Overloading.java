package kotlinVsJava.defaultArgumentsVsOverloading;

/************************
 * Kotlin Learnings     *
 * @kotlin.learnings    *
 ************************/

public class Overloading {
    public static String convertToString(double d) {
        return convertToString(d, false);
    }

    public static String convertToString(double d, boolean toUpperCase) {
        return convertToString(d, toUpperCase, "");
    }

    public static String convertToString(double d, String suffix) {
        return convertToString(d, false, suffix);
    }

    public static String convertToString(double d, boolean toUpperCase, String suffix) {
        String s = "This is a " + d + suffix;
        return toUpperCase ? s.toUpperCase(): s;
    }

    public static void main(String[] args) {
        System.out.println(convertToString(2.0));  /** This is a 2.0 */
        System.out.println(convertToString(2.0, " test"));  /** This is a 2.0 test */
        System.out.println(convertToString(2.0, true));  /** THIS IS A 2.0 */
        System.out.println(convertToString(2.0, true, " test"));  /** THIS IS A 2.0 TEST */
    }
}

