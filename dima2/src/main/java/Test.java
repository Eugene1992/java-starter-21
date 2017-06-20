import java.util.Scanner;

import static java.lang.System.*;

public class Test {
    public static void main(String[] args) {
        Scanner a = new Scanner(in);
        int First, Second;
        int Do;
        out.println("Введите первое число");
        First = (int) a.nextFloat();
        out.println("Введите второе число число");
        Second = (int) a.nextFloat();
        out.println("Че надо с ними сделать?=)");
        String operation = a.next();
        switch (operation) {
            case "+":
                out.println(First + Second);
                break;
            case "-":
                out.println(First - Second);
                break;
            case "*":
                out.println(First * Second);
                break;
            case "/":
                out.println(First / Second);
                break;


        }
    }

}
