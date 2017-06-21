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

//    1. Создать целочисленный массив и заполнить его данными
//    2. Создать метод, который принимает на вход массив и выводит его на экран
//    3. Создать метод, который принимает на вход массив и подсчитывает сумму элементов и возвращает ее.
}
