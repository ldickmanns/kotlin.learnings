package docs.concepts.classesAndObjects.functionalInterfaces;

/**
 * Before Java 8, you could either create a class implementing the operator:
 */
class Plus implements ArithmeticOperation {
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}

/**
 * Or an anonymous class:
 */
public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Or an anonymous class:
        ArithmeticOperation minus = new ArithmeticOperation() {
            @Override
            public int operation(int x, int y) {
                return x - y;
            }
        };

        // Since Java 8 you can use a Lambda:
        ArithmeticOperation times = (x, y) -> x * y;

        System.out.println(new Plus().operation(2, 2)); // 4
        System.out.println(minus.operation(2, 2));      // 0
        System.out.println(times.operation(2, 2));      // 4
    }
}
