package hw02;

/**
 * THE BIGGEST
 */
public class Task04 {
    public static void main(String[] args) {
        int a = 34556;
        int b = 45435;
        int c = 24349;
        int sum = 0;
        int sum2 = a > b ? 34556 : 45435;
        sum = sum + sum2;
        if (sum > c) {
            System.out.println(sum);
        } else if (sum < c) {
            System.out.println(c);
        } else {
            System.out.println("CALL THE PROGRAMMER");
        }






    }
}
