package Laba1;

import java.util.Arrays;
import java.util.Scanner;

public class Zadacha4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int values : arr) {
            System.out.print(values + " ");
        }
    }
}
