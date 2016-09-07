package com.company;

import java.util.Scanner;

/**
 * Created by Kole on 8/22/2016.
 */
public class SumOfTheOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

//        String str = sc.nextLine();
        String next = sc.next();
        while (true) {
            System.out.println(next);
            sc.next();
        }
//        sc.close();
//        System.out.println(str);
//        while ((s = in.readLine()) != null) {
//            String[] split = s.split(" ");
//            for (int i = 0; i < split.length; i++) {
//                String temp = split[i];
//                split[i] = "0";
//                int partTotal = Stream.of(split).mapToInt(Integer::parseInt).sum();
//                if (Integer.valueOf(temp) == partTotal) {
//                    //my guy
//                    System.out.println(temp);
//                    break;
//                } else {
//                    split[i] = temp;
//                }
//            }
//        }
    }
}
