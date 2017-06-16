package CW;

import java.util.Scanner;

/**
 * Created by D_ma on 16.06.2017.
 */
public class CW3 {
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
