package cw_05;

public class CycleBreak {
    public static void main(String[] args) {

        int i = 10;
        while (i > 0) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
            i--;
        }
    }
}
