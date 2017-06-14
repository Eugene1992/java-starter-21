package cw_04;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer;
        boolean isEnd = true;
        while (isEnd) {
            System.out.println("Wanna beer?");
            answer = scanner.next();
            if (answer.equals("No")) {
                isEnd = false;
            }
        }
    }
}
