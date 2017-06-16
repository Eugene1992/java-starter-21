package hw02;

import java.util.Locale;
import java.util.Scanner;

/**
 * NEAREST TO 10
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter the first floating number: ");
        double a = myNumber.nextDouble();
        System.out.println("Enter the second floating number: ");
        double b = myNumber.nextDouble();
        int num = 10;
        double c = Math.abs(num - a);
        double d = Math.abs(num - b);
        if (c > d) {
            System.out.println(b);
        }
        if (d > c) {
            System.out.println(a);
        } else {
            System.out.println("CALL THE PROGRAMMER");
        }
    }
}
