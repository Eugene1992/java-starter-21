package cw_3;

public class If {
    public static void main(String[] args) {
        int a = 5;
        boolean isRight = true;

        if (a >= 0) { // > < >= <= == !=
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }

        if (a != 5) {
            if (a != 7) {
                System.out.println("a != 7");
            }
            System.out.println("a != 5");
        }
    }
}
