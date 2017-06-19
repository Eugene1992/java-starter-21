package Classwork;

import java.util.Scanner;

/**
 * Created by Дима on 19.06.2017.
 */
public class сw_6 {
    public static void main(String[] args) {
        System.out.println("Enter the number#1");
        Scanner numberOne = new Scanner(System.in);
        int dota = numberOne.nextInt();
        System.out.println("Enter the number#2");
        Scanner numbetTwo = new Scanner(System.in);
        int back = numbetTwo.nextInt();


    }
    static int classwork(int dota, int back) {
        int classwork = dota;
        for (int i = dota; i < back; i++) {
            classwork = classwork + i;
        }
        return classwork;
        System.out.println("classwork");


    }
}








