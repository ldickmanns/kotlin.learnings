package kotlinVsJava.strings;

/********************
 * Kotlin Learnings  *
 * @kotlin.learnings *
 ********************/

public class Strings {
    public static void main(String[] args) {
        String name = "Kotlin Learnings";
        String greet = "Hello, my name is " + name;
        int age = 24;
        String ageString = String.format(" and I'm %d years old.", age);
        String greetWithAge = greet.concat(ageString);
        System.out.println(greetWithAge);
        /** Hello, my name is Kotlin Learnings and I'm 24 years old. */
    }
}

