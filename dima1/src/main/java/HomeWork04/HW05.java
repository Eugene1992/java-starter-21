package HomeWork04;

import java.util.Scanner;

/**
 * Created by D_ma on 18.06.2017.
 */
public class HW05 {
    public static void main(String[] args) {
        System.out.println("Please choose from which numbers the Fibonacci sequence will begin:");
        System.out.println("Press 1 to start the sequence with 1 and 0.");
        System.out.println("Press 2 to start the sequence with 1 and 1.");
        Scanner ver = new Scanner(System.in);
        byte v = ver.nextByte();

        long a = 1;
        long b = v == 1 ? 0 : 1;

        if (v == 1) {
            while (a < 99999999) {
                System.out.println(a);
                System.out.println(b);
                a = a + b;
                b = a + b;
            }
        }
        if (v == 2) {
            while (a < 999999999) {
                System.out.println(a);
                System.out.println(b);
                a = a + b;
                b = a + b;
            }
        }
        if (v == 0) {
            System.out.println("Such a command does not exist.");
        }
        if (v < 0) {
            System.out.println("Such a command does not exist.");
        }
        if (v > 2) {
            System.out.println("Such a command does not exist.");
        }
        System.out.println("I specifically limited the work of the program, because the circulation heavily loads the processor.");
    }
}