public class EvenOdd {
    static boolean isEven(int n) { return n % 2 == 0; }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(n + (isEven(n) ? " is even" : " is odd"));
    }
}
