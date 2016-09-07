import java.util.Scanner;

/**
 * Hello
 *
 * Created by banks on 9/3/2016.
 */
public class ReversedBinaryNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.next();

        String bin = Integer.toBinaryString(Integer.valueOf(next));
        String reverse = reverse(bin);
        System.out.println(toDecimal(reverse));
    }

    private static int toDecimal(String reverse) {
        int sum = 0;
        int len = reverse.length();
        for (int i = 0; i < len; i++) {
            int c = Character.getNumericValue(reverse.charAt(i));
            sum += (Math.pow(2, (len - 1) - i) * c);
        }
        return sum;
    }

    private static String reverse(String bin) {
        String str = "";
        for (int i = bin.length() - 1; i >= 0; i--) {
            str += bin.charAt(i);
        }
        return str;
    }
}
