package HomeWork03;

import java.util.Scanner;

/**
 * Created by D_ma on 17.06.2017.
 */
public class HW06 {
    public static void main(String[] args) {
        System.out.println("Введите три члена квадратного уравнения.");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the member a");
        double a = scanner.nextDouble();

        System.out.println("Enter the member b");
        double b = scanner.nextDouble();

        System.out.println("Enter the member c");
        double c = scanner.nextDouble();

//      ax^2 - bx + c = 0;
//      D = b^2 - 4ac
        double D = b * b - 4 * a * c;
        System.out.println("D= "+ D);

        if (D < 0) {
            System.out.println("The quadratic equation has no roots.");
        }
        if (D == 0) {
            System.out.println("The quadratic equation has only one root.");
            double x = -b / (2 * a);
            System.out.println("X= " + x);
        }
        if (D > 0) {
            double sqrtD = Math.sqrt(D);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("X1= " + x1);
            System.out.println("X2= " + x2);
        }
    }
}
