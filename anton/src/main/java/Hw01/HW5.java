package Hw01;

public class HW5 {
    public static void main(String[] args) {
        byte b1 = 20;
        byte b2 = 40;
        byte b3;
        b3 = b2;
        b2 = b1;
        b1 = b3;
        System.out.println(b1);
        System.out.println(b2);

        int a = 4;
        int b = 2;
        a = b;
        b = a + b;
        System.out.println(a);
        System.out.println(b);
    }
}
