package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 16.06.2017.
 */
public class HW05 {
    public static void main(String[] args) {
        System.out.println("Enter four different numbers.");
        System.out.println("Enter the number#1");
        Scanner numberOne = new Scanner(System.in);
        double a = numberOne.nextDouble();

        System.out.println("Enter the number#2");
        Scanner numbetTwo = new Scanner(System.in);
        double b = numbetTwo.nextDouble();

        System.out.println("Enter the number#3");
        Scanner numberThree = new Scanner(System.in);
        double c = numberThree.nextDouble();

        System.out.println("Enter the number#3");
        Scanner numberFore = new Scanner(System.in);
        double d = numberThree.nextDouble();

        if (a < b) {
            if (b < c) {
                if (c < d) {
                    System.out.println(b);
                }
                if (c > d) {
                    System.out.println(a);
                }
                if (c == d) {
                    System.out.println("Open your eyes. The key word is DIFFERENT!");
                }
                if (b > c) {
                    if (c < d) {
                        if (d < a) {
                            System.out.println(d);
                        }
                        if (d > a) {
                            System.out.println(c);
                        }
                    }
                    if (c > d) {
                        System.out.println(d);
                    }
                    if (c == d) {
                        System.out.println("Open your eyes. The key word is DIFFERENT!");
                    }
                }
            }
        }
        if (a > b) {
            if (b < c) {
                if (c < d) {
                    System.out.println(c);
                }
                if (c > d) {
                    System.out.println(b);
                }
                if (c == d) {
                    System.out.println("Open your eyes. The key word is DIFFERENT!");
                }
            }
            if (b > c) {
                if (c < d) {
                    if (d < a) {
                        System.out.println(d);
                    }
                    if (d > a) {
                        System.out.println(c);
                    }
                }
                if (c > d) {
                    System.out.println(c);
                }
                if (c == d) {
                    System.out.println("Open your eyes. The key word is DIFFERENT!");
                }
            }
        }
        if (a == b) {
            System.out.println("Open your eyes. The key word is DIFFERENT!");
        }
    }
}


