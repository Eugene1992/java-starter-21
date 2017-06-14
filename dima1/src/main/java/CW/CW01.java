package CW;

import java.util.Scanner;

/**
 * Created by D_ma on 14.06.2017.
 */
public class CW01 {
    public static void main(String[] args) {
        System.out.println("Enter the number 1...127");
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
//         654 3210
//        XXXX XXXX
//        b6b5b4 b3b2b1b0

        int b0, b1, b2, b3, b4, b5, b6;

        b0 = i % 2;
        i = i / 2;

        b1 = i % 2;
        i = i / 2;

        b2 = i % 2;
        i = i / 2;

        b3 = i % 2;
        i = i / 2;

        b4 = i % 2;
        i = i / 2;

        b5 = i % 2;
        i = i / 2;

        b6 = i % 2;

        System.out.printf("%d%d%d%d%d%d%d", b6, b5, b4, b3, b2, b1, b0);
    }
}
