package cw_05;

public class RightShift {
    public static void main(String[] args) {
        int a = 21;
        System.out.println(a >> 2);

//        0000 0000 0000 0000 0000 0000 0001 0101
//        0000 0000 0000 0000 0000 0000 0000 0101

//        a / 2^n

        byte b = 120;
        b = (byte) (b >> 2);
        System.out.println(b);

//        0111 1000
    }
}
