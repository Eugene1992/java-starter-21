package hw02;

import java.util.Scanner;

/**
 * CALCULATOR
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNumber = myNumber.nextInt();
        System.out.println("Enter the second number");
        int secondNumber = myNumber.nextInt();
        System.out.println("Choose the operation: ");
        String operation = myNumber.next();
        if (operation.equals("+")) {
            System.out.println(firstNumber + secondNumber);
        } if (operation.equals("-")) {
            System.out.println(firstNumber - secondNumber);
            if (operation.equals("*")) {
                System.out.println(firstNumber * secondNumber);
                if (operation.equals("/")) {
                    System.out.println(firstNumber / secondNumber);
                } else {
                    System.out.println("Something went wrong, call the programmer: 0997672606");
                }
            }
        }



    }
}
