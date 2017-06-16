package HomeWork03;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by D_ma on 14.06.2017.
 */
public class HW03 {
    public static void main(String[] args) {
        out.println("Enter the number #1");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        out.println("Enter the number #2");
        double b = scanner.nextDouble();
        if (a == b) {
            System.out.println("I foresaw such a question, and I consider it inappropriate to dismiss it.");
        } else {
            if (a < 10) {  //*Ветка1*//
                if (b < 10) {
                    double c1 =  (10 - a);
                    double c2 =  (10 - b);
                    if (c1 < c2) {
                        System.out.println(a);
                    }
                    if (c1 > c2) {
                        System.out.println(b);
                    }
                }
                if (b > 10) {
                    double c1 = (10 - a);
                    double c2 = (b - 10);
                    if (c1 < c2) {
                        System.out.println(a);
                    }
                    if (c1 > c2) {
                        System.out.println(b);
                    }
                }

            }
            if (a > 10) {   //*Ветка2*//
                if (b < 10) {
                    double c1 = (a - 10);
                    double c2 = (10 - b);
                    if (c1 < c2) {
                        System.out.println(a);
                    }
                    if (c1 > c2) {
                        System.out.println(b);
                    }
                }
                if (b > 10) {
                    double c1 = (a - 10);
                    double c2 = (b - 10);
                    if (c1 < c2) {
                        System.out.println(a);
                    }
                    if (c1 > c2) {
                        System.out.println(b);
                    }
                }
            }
            if (a == 10) {
                System.out.println(10);
            }
            if (b == 10) {
                System.out.println(10);
            }
        }
    }
}
// TODO: 16.06.2017  