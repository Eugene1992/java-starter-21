package cw_03;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println("Hello " + name);

        int age = scan.nextInt();
        if (age > 18) {
            System.out.println("XXX");
        }
    }
}
