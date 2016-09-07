import java.util.Scanner;
import java.util.stream.Stream;

public class ArmyStrength {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String instancesStr = scan.nextLine();
            int instances = Integer.parseInt(instancesStr);
            for (int i = 0; i < instances; i++) {
                scan.nextLine();
                String s = scan.nextLine();
                int gCount = Integer.parseInt(s.split(" ")[0]);
                String[] gStrengths = scan.nextLine().split(" ");
                int gStrongest = Stream.of(gStrengths).mapToInt(Integer::valueOf).max().getAsInt();

                int mgCount = Integer.parseInt(s.split(" ")[1]);
                String[] mgStrengths = scan.nextLine().split(" ");
                int mgStrongest = Stream.of(mgStrengths).mapToInt(Integer::valueOf).max().getAsInt();

                if(mgStrongest > gStrongest){
                    System.out.println("MechaGodzilla");
                } else {
                    System.out.println("Godzilla");
                }

            }
        }
    }
}
