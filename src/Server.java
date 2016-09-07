import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        String line1 = scanner.next();
        String[] split1 = line1.split(" ");
        int n = Integer.parseInt(split1[0]);
        int T = Integer.parseInt(split1[1]);

        String line2 = scanner.next();
        String[] split2 = line2.split(" ");

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(split2[i]);
            if(sum > T){
                System.out.println(i);
                break;
            } else {
                //ah alakoba, you wan make i fail abi
                if(i == split2.length - 1){
                    System.out.println(split2.length);
                }
            }
        }
    }
}
