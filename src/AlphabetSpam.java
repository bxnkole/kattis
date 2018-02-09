import java.util.Scanner;

/**
 * Created by Kole on 8/22/2016.
 */
public class AlphabetSpam {
    public static void main(String[] args) {

        Scanner scanner  = new Scanner(System.in);

        String next = scanner.next();
        int whiteSpaceCount = 0, lowerCount = 0, upperCount = 0, symbol = 0, total = next.length();
        for (int i = 0; i < next.length(); i++) {
            char x = next.charAt(i);

            if(x == '_') {
                whiteSpaceCount++;
            } else if(((int) x) >= 65 && ((int) x) <= 90){
                upperCount++;
            } else if(((int) x) >= 97 && ((int) x) <= 122){
                lowerCount++;
            } else if(((int) x) >= 33 && ((int) x) <= 126){
                symbol++;
            }

        }
        System.out.println(Double.valueOf(whiteSpaceCount) / Double.valueOf(total));
        System.out.println(Double.valueOf(lowerCount) / Double.valueOf(total));
        System.out.println(Double.valueOf(upperCount) / Double.valueOf(total));
        System.out.println(Double.valueOf(symbol) / Double.valueOf(total));



    }
}
