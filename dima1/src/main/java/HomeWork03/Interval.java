package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 17.06.2017.
 */
public class Interval {
    public static void main(String[] args) {
        System.out.println("Please enter a number from 1 to 100, to define one of the specified intervals:");
        System.out.println("[0 - 14] [15 - 35] [36 - 50] [50 - 100].");
        Scanner number = new Scanner(System.in);
        double a = number.nextDouble();

        if (a > -1) {
            if (a < 15) {
                System.out.println("[0 - 14]");
            }
        }
        if (a == 50) {
            System.out.println("For a given value, two intervals are suitable:");
        }
        if (a > 14) {
            if (a < 36) {
                System.out.println("[15 - 35]");
            }
        }
        if (a > 35) {
            if (a < 51) {
                System.out.println("[36 - 50]");
            }
        }
        if (a > 49) {
            if (a < 100) {
                System.out.println("[50 - 100]");
            }
        }
        if (a > 100) {
            System.out.println("wow wow... Easy, boy. I said from 1 to 100.");
        }
        if (a < 0) {
            System.out.println("wow wow... Easy, boy. I said from 1 to 100.");
        }
    }
}
