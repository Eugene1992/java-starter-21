package cw_05;

public class LogicNot {
    public static void main(String[] args) {
        String str = "Hello!";

        if (!str.equals("Hello")) {
            System.out.println("Success");
        }

        if (!str.equals("Hello!")) {
            System.out.println("Success");
        }
    }
}
