public class Main {
    public static boolean isInCircle(Double x, Double y) {
        return Math.sqrt(x*x + y*y) <= 1;
    }

    public static void main(String[] args) {
        System.out.println("program initialized");

        Integer N = 100000000;
        ImperativeCalc.calculate(N);
        FunctionalCalc.calculate(N);
    }
}
