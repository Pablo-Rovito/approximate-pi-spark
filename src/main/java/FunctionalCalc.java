import java.util.Calendar;
import java.util.stream.IntStream;

public class FunctionalCalc {
    public static void calculate(Integer N) {
        long startTime = Calendar.getInstance().getTimeInMillis();

        long n = IntStream.range(0, N)
                .mapToObj(throwNumber -> new Double[] { Math.random(), Math.random() })
                .filter(coordinates -> Main.isInCircle(coordinates[0], coordinates[1]))
                .count();
        System.out.println("(funcional) Pi vale masomeno: " + (double) 4*n/N);
        long endTime = Calendar.getInstance().getTimeInMillis();
        System.err.println((double) (endTime - startTime)/1000);
    }
}