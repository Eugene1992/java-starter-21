package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 17.06.2017.
 */
public class HW06 {
    public static void main(String[] args) {
        System.out.println("Введите три члена квадратного уравнения.");
        System.out.println("Eanter the member a");
        Scanner numberone = new Scanner(System.in);
        double a = numberone.nextDouble();
        System.out.println("Eanter the member b");
        Scanner numberTwo = new Scanner(System.in);
        double b = numberTwo.nextDouble();
        System.out.println("Eanter the member c");
        Scanner numberThree = new Scanner(System.in);
        double c = numberThree.nextDouble();


        double D = (b * b) -4 * (a * c);
        System.out.println("D= "+ D);

        if (D < 0) {
            System.out.println("The quadratic equation has no roots.");
        }
        if (D == 0) {
            System.out.println("The quadratic equation has only one root.");
            double x = -(b) / (2 * a);
            System.out.println("X= " + x);
        }
        if (D > 0) {
            double sqrtD = Math.sqrt(D);
            double minusb = b * (-1);
            double minussqrtD = sqrtD * (-1);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (minusb - sqrtD) / (2 * a);
            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
        }
    }
}
