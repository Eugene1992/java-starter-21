package cw_03;

public class IfElse {
    public static void main(String[] args) {
        int k = -10;

        if (k > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }

        if (k > 0) {
            System.out.println("Positive");
        } else if (k < 0){
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}
