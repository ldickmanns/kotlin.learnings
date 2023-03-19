package learnings.kotlin.kotlinVsJava.containsVsIn;

import java.util.ArrayList;

public class Contains {
    public static void main(String[] args) {
        var list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(i);
        }
        System.out.println(list.contains(2)); // true
        System.out.println(list.contains(5)); // false
    }
}
