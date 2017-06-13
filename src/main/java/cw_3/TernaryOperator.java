package cw_3;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = -10;
        int b;

        if (a > 0) {
            b = 1;
        } else {
            b = -1;
        }

        System.out.println(b);

//        condition ? true : false
        int c = a > 0 ? 1 : -1;

        System.out.println(c);


    }
}
