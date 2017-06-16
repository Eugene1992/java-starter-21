package hw02;

/**
 * THE BIGGEST
 */
public class Task04 {
    public static void main(String[] args) {
        int a = 34556;
        int b = 45435;
        int c = 24349;
        int sum2 = a > b ? a : b;
        if (sum2 > c) {
            System.out.println(sum2);
        } else if (sum2 < c) {
            System.out.println(c);
        } else {
            System.out.println("CALL THE PROGRAMMER");
        }
    }
}
