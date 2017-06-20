package Homework.hw3;


import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

/**
 * Created by Дима on 20.06.2017.
 */
public class hw3 {
    public static void main(String[] args) {
        System.out.println( " First Number");
        Scanner bitch = new Scanner(System.in);
        double a = bitch.nextDouble();
        System.out.println( " Second Number");
        Scanner ass = new Scanner(System.in);
        double b = ass.nextDouble();
        double c = 10;
        if (a == b) {
            System.out.println(" You Activate the bomb xD pip pip pip  ");
        } else {


            if (a > 10) {
                if (b > 10) {
                    double a1 = (a - 10);
                    double b1 = (b - 10);
                    if (a1 < b1) {
                        System.out.println(a);
                    }
                    if (a1 > b1) {
                        System.out.println(b);


                    }
                }
                if (b < 10) {
                    double a1 = (a - 10);
                    double b1 = (10 - b);
                    if (a1 < b1) {
                        System.out.println(a);
                    }
                    if (a1 > b1) {
                        System.out.println(b);
                    }
                }
            }
            if (a < 10) {
                if (b > 10) {
                    double a1 = (10 - a);
                    double b1 = (b - 10);
                    if (a1 < b1) {
                        System.out.println(a);
                    }
                    if (a1 > b1) {
                        System.out.println(b);


                    }
                }
                if (b < 10) {
                    double a1 = (10 - a);
                    double b1 = (10 - b);
                    if (a1 < b1) {
                        System.out.println(a);
                    }
                    if (a1 > b1) {
                        System.out.println(b);

                    }
                }
            }
        }
    }
}








