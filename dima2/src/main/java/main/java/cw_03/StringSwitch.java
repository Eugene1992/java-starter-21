package cw_03;

public class StringSwitch {
    public static void main(String[] args) {
        String someWonderfullString = "A";

        if (someWonderfullString.equals("A")) {
            System.out.println(10);
        } else if (someWonderfullString.equals("B")) {
            System.out.println(11);
        } else if (someWonderfullString.equals("C")) {
            System.out.println(12);
        } else if (someWonderfullString.equals("D")) {
            System.out.println(13);
        } else if (someWonderfullString.equals("E")) {
            System.out.println(14);
        } else if (someWonderfullString.equals("F")) {
            System.out.println(15);
        } else {
            System.out.println("9 < someWonderfullString > 15");
        }

        switch (someWonderfullString) {
            case "A":
                System.out.println(10);
                break;
            case "B":
                System.out.println(11);
                break;
            case "C":
                System.out.println(12);
                break;
            case "D":
                System.out.println(13);
                break;
            case "E":
                System.out.println(14);
                break;
            case "F":
                System.out.println(15);
                break;
            default:
                System.out.println("9 < someWonderfullString > 15");
        }
    }
}
