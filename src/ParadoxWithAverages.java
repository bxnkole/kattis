import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by banks on 9/3/2016.
 */
public class ParadoxWithAverages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < cases; i++) {
            int[] cs = new int[sc.nextInt()];
            int[] eco = new int[sc.nextInt()];

            Arrays.setAll(cs, j -> sc.nextInt());
            Arrays.setAll(eco, j -> sc.nextInt());

            double csAverage = getAverage(cs);
            double ecoAverage = getAverage(eco);

            int validJoke = 0;
            for (int csStudent : cs) {
                if ((csStudent < csAverage) && (csStudent > ecoAverage)) {
                    validJoke++;
                }
            }
            System.out.println(validJoke);
        }
    }

    private static double getAverage(int[] iqs) {
        int sum = 0;
        for (int iq : iqs) {
            sum += iq;
        }
        return ((double) sum) / iqs.length;
    }
}
