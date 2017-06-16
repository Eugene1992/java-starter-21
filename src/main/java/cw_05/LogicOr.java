package cw_05;

public class LogicOr {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        if (a > 100 || b == 20) {
            System.out.println("Success!");
        }

        if (b == 20 || a / 0 == 25) {
            System.out.println("Success!");
        }

        if (b == 20 | a / 0 == 25) {
            System.out.println("Success!");
        }
    }
}
