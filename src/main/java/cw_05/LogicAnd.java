package cw_05;

public class LogicAnd {
    public static void main(String[] args) {
        int a = 100, b = 20, c = 30, d = 0;

        if (a > b) {
            if (a > c) {
                System.out.println(a);
            }
        }

        if (a < 0 && a / 0 == 10) {     // simple schema
            System.out.println(a);
        }

        if (a < 0 & a / 0 == 10) {      // full schema
            System.out.println("Yeeah!");
        }
    }
}
