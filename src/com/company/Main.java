package com.company;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String str = "Abracadabra";
	    Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String next = sc.next();
        int rows = Integer.valueOf(next.split(" ")[0]);
        int columns = Integer.valueOf(next.split(" ")[1]);

        String row[] = new String[rows];
        for (int i = 0; i < rows; i++) {
            String next1 = sc.next();
            row[i] = next1;
        }

        int coordsLength = Integer.parseInt(sc.next());
        for (int i = 0; i < coordsLength; i++) {
            String coord = sc.next();
            String[] coordStart = new String[]{coord.split(" ")[0], coord.split(" ")[1]};
            String[] coordEnd = new String[]{coord.split(" ")[2], coord.split(" ")[3]};
            System.out.println(canDecimalMove(row, coordStart, coordEnd));
        }
        System.out.println("Done");
    }

    private static boolean canDecimalMove(String[] rows, String[] start, String[] end){
        //check if both are same
        char startValue = getValueAt(rows, start[0], start[1]);
        char endValue = getValueAt(rows, end[0], end[1]);
        System.out.println("Start: " + startValue);
        System.out.println("End: " + endValue);
        if (startValue != '1' || endValue != '1'){
            return false;
        }


        return true;
    }

    private static char getValueAt(String rows[], String row, String column){
        return rows[Integer.parseInt(row) - 1].charAt(Integer.parseInt(column) - 1);
    }
}
