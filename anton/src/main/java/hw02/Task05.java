package hw02;

/**
 * THE SECOND BIGGEST
 */
public class Task05 {
    public static void main(String[] args) {
        int a = 24355;
        int b = 34656;
        int c = 23434;
        int d = 43553;
        int biggest = a > b ? 24355 : 34656;
        int biggest2 = c > d ? 23434 : 43553;
        int sum = 0;
        sum = sum + biggest;
        int sum2 = 0;
        sum2 = sum2 + biggest2;
        if (sum < sum2) {
            System.out.println(sum);
        } else if (sum2 < sum) {
            System.out.println(sum2);
        }



    }
}
