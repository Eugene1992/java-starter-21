package cw_05;

public class InnerCycle {
    public static void main(String[] args) throws InterruptedException {
        outer:
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
            inner:
            for (int j = 0; j < 10; j++) {
                System.out.print(" j = " + j);
                if (j == 7) break outer;
                Thread.sleep(300);
            }
            System.out.println();
        }
    }
}
