import java.util.Scanner;

public class GoldbachConjecture {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNextLine()) {
                int cases = Integer.parseInt(scan.nextLine());
                for (int i = 0; i < cases; i++) {
                    StringBuilder sb = new StringBuilder();
                    int kase = Integer.parseInt(scan.nextLine());

                    int repCount = 0;
                    int half = kase / 2;
                    for (int j = 2; j <= half; j++) {
                        int other = kase - j;

                        boolean isCurrentPrime = getPrime(j);
                        boolean isOtherPrime = getPrime(other);
                        if(isCurrentPrime && isOtherPrime){
                            repCount++;
                            sb.append(j).append("+").append(other).append("\n");
                        }
                    }

                    System.out.println(kase + " has "+ repCount + " representation(s)");
                    System.out.println(sb.toString());
                }

            }
        }
    }

    private static boolean getPrime(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false; }
        }
        return true;

    }
}
