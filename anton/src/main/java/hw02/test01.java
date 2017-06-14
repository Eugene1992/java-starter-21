package hw02;

import java.util.Scanner;

/**
 * TEST 01
 */
public class test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String num = scan.next();

        int myNumber = scan.nextInt();
        if (myNumber % 2 == 0) {
            System.out.println("Chentoe");
        } else {
            System.out.println("Nechetnoe");
        }

    }
}
