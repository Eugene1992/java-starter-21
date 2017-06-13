package cw_3;

public class Cast {
    public static void main(String[] args) {
        byte b = 100;

        int i = b;

        b = (byte) i;

        byte k = (byte) 1023;

        System.out.println(k);

//        0000 0011 1111 1111
//                  0000 0000

    }
}
