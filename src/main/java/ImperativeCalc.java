import java.util.Calendar;

public class ImperativeCalc {

    public static void calculate(Integer N) {
        long startTime = Calendar.getInstance().getTimeInMillis();
        Integer n = 0;

        for(int i = 0; i < N; i++) {
            if(Main.isInCircle(Math.random(), Math.random())) {
                n=n+1;
            }
        }
        System.out.println("(imperativo) Pi vale masomeno: " + (double) 4*n/N);

        long endTime = Calendar.getInstance().getTimeInMillis();
        System.err.println((double) (endTime - startTime)/1000);
    }
}
