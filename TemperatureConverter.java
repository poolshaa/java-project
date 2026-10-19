public class TemperatureConverter {
    static double cToF(double c) { return c * 9 / 5 + 32; }
    static double fToC(double f) { return (f - 32) * 5 / 9; }

    public static void demo() {
        System.out.println("25 C = " + cToF(25) + " F");
    }
}
