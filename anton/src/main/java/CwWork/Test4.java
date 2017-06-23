package CwWork;

public class Test4 {
    public static void main(String[] args) {
        int[] array = {4, 8, -3, 5, -54, 46, 78, -67};
        System.out.println(nums(array));
    }

    static int nums(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]< 0) {
                sum = array[i] + sum;
            }
        }
        return sum;
    }

}
