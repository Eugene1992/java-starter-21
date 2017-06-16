package cw_05;

public class CycleContinue {
    public static void main(String[] args) {
        int i = 10;
        while (i > 0) {
            i--;
            if (i == 6) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
