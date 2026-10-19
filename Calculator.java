public class Calculator {
    static double add(double a, double b) { return a + b; }
    static double sub(double a, double b) { return a - b; }
    static double mul(double a, double b) { return a * b; }
    static double div(double a, double b) { return a / b; }

    public static void demo() {
        System.out.println("Result = " + add(6, 3));
    }
}
