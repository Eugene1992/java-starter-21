package cw_07;

public class Problem {
    public static void main(String[] args) {
        int[] ints = {2, 5, 6, 7, 3};
        System.out.println(calcNumsSum(1, 2, 3));
        System.out.println(calcNumsSum(new int[]{2, 5, 6}));
        System.out.println(calcNumsSum(ints));

    }

    static int calcNumsSum(int a, int b, int c) {
        return a + b + c;
    }

    static int calcNumsSum(int[] ints) {
        return 0;
    }
}
