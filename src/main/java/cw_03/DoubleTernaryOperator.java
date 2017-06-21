package cw_03;

public class DoubleTernaryOperator {
    public static void main(String[] args) {
        int a = 0;
        int b;

        if (a >= 0) {
            if (a == 0) {
                b = 0;
            } else {
                b = 1;
            }
        } else {
            b = -1;
        }

        System.out.println(b);

//        condition ? true : false
        int c = a >= 0 ? a == 0 ? 0 : 1 : -1;

        System.out.println(c);
    }
}
