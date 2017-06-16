package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 16.06.2017.
 */
public class HW04 {
    public static void main(String[] args) {
        System.out.println("Enter the number#1");
        Scanner numberOne = new Scanner(System.in);
        int a = numberOne.nextInt();

        System.out.println("Enter the number#2");
        Scanner numbetTwo = new Scanner(System.in);
        int b = numbetTwo.nextInt();

        System.out.println("Enter the number#3");
        Scanner numberThree = new Scanner(System.in);
        int c = numberThree.nextInt();
        if (a < b) {
            if (b < c) {
                System.out.println(c);
            }
            if (b > c) {
                System.out.println(b);
            }
            if (b == c) {
                System.out.println(b);
            }
        }
        if (a > b) {
            if (a < c) {
                System.out.println(c);
            }
            if (a > c) {
                System.out.println(a);
            }
            if (a == c) {
                System.out.println(a);
            }
        }
        if (a == b) {
            if (a < c) {
                System.out.println(c);
            }
            if (b == c) {
                System.out.println("I will not ansswer stupid questions!");
            }
            if (a > c) {
                System.out.println(a);
            }
        }
    }
}
