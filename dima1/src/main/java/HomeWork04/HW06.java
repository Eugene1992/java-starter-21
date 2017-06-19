package HomeWork04;

import java.util.Scanner;

/**
 * Created by D_ma on 18.06.2017.
 */
public class HW06 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();


        String res = "";
        while (a > 0 ) {
            int b = a % 2;
            res = b + res;
            a = a / 2;
        }
        System.out.println(res);
    }
}
