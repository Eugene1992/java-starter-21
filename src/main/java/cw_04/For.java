package cw_04;

public class For {
    public static void main(String[] args) {

        /*int i = 0;
        while (i < 10) {
            System.out.println("Hello");
            i++;
        }*/

        /*for(int i = 0; i < 10; i++) {
            System.out.println("Hello " + i);
        }*/

        /*for (;;) {
            System.out.println("Hello");
        }*/

        /*int i = 0;
        for(;i < 10;) {
            System.out.println("Hello " + i);
            i++;
        }*/

        for(int i = 0, j = 100; i < 10; i++, j -= 4) {
            System.out.println(j);
            j--;
        }
    }
}
