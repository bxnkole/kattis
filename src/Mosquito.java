import java.util.Scanner;

public class Mosquito {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine().toLowerCase();
                String[] split = line.split(" ");

                int eggRate = Integer.parseInt(split[3]);
                int lavaPupaRate = Integer.parseInt(split[4]);
                int pupaAdultRate = Integer.parseInt(split[5]);
                int weeks = Integer.parseInt(split[6]);

                int adult = Integer.parseInt(split[0]);
                int pupa = Integer.parseInt(split[1]);
                int lava = Integer.parseInt(split[2]);
                for (int i = 0; i < weeks; i++) {
//                    System.out.println("Week: " + (i+1));

                    int eggs = adult * eggRate;
                    adult = pupa / pupaAdultRate;
                    pupa = lava / lavaPupaRate;
                    lava = eggs;

//                    System.out.println("Adult: " + adult);
//                    System.out.println("Pupa: " + pupa);
//                    System.out.println("Lava: " + lava);
//                    System.out.println("Eggs: " + eggs);
//                    System.out.println();
                }
                System.out.println(adult);

            }
        }
    }
}
