package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 14.06.2017.
 */
public class HW02 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = a / 2;
        int c = b * 2;

        /*if (a == c) {
            System.out.println("The number is even. Do not be a ass hole, learn!");
        }
        if (a > c) {
            System.out.println("The number is odd.  Do not be a ass hole, learn!");
        }
        if (a == 0) {
            System.out.println("zero is an integer, since it is divisible by 2.");
        }*/

        if (a % 2 == 0) {
            if (a == 0) {
                System.out.println("zero is an integer, since it is divisible by 2.");
            } else {
                System.out.println("The number is even. Do not be a ass hole, learn!");
            }
        } else {
            System.out.println("The number is odd.  Do not be a ass hole, learn!");
        }
    }
}
