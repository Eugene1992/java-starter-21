package hw02;

import java.util.Scanner;

/**
 * INTERVAL
 */
public class Interval {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 100: ");
        int num = myNumber.nextInt();
        if (num < 0 ) {
            System.out.println("WTF reed the sentence");
        } else if (num > 0 || num <= 14){
            System.out.println("First Group: 0 - 14");
        } else if (num == 15 || num <= 35) {
            System.out.println("Second Group: 15 - 35");
        } else if (num == 36 || num <= 50) {
            System.out.println("Third Group: 36 - 50");
        } else if (num == 50 || num <= 100){
            System.out.println("Fourth Group: 50 - 100");
        } else {
            System.out.println("WTF reed the sentence");
        }
    }
}
