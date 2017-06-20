import java.util.Scanner;

import static java.lang.System.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner a = new Scanner(in);
        int First, Second;
        out.println("Введите первое число");
        First = a.nextInt();
        out.println("Введите второе число число");
        Second = a.nextInt();
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
