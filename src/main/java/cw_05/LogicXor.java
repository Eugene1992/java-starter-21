package cw_05;

public class LogicXor {
    public static void main(String[] args) {
        System.out.println(true ^ false);
        System.out.println(false ^ true);

        System.out.println(true ^ true);
        System.out.println(false ^ false);

        int a = 10;
        int c;

        if (true) {
            int b = 10;
            c = b;
            System.out.println(a);
        }

        if (true) {
            int b = 10;
            c = b;
            System.out.println(a);
        }

    }
}
