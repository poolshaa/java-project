public class Factorial {
    static long factorial(int n) {
        return n <= 1 ? 0 : n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("5! = " + factorial(5));
    }
}
