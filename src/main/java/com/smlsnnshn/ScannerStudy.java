package com.smlsnnshn;

import java.util.Scanner;

public class ScannerStudy {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Entry 1: ");
        String entry1 = scanner.nextLine();

        System.out.println("Entry 2: ");
        String entry2 = scanner.nextLine();

        System.out.println("Entry 3: ");
        String entry3 = scanner.nextLine();
//        scanner.next();

        System.out.println(entry1);
        System.out.println(entry2);
        System.out.println(entry3);


    }

}
