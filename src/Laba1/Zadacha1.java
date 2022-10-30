package Laba1;

import java.util.Scanner;
public class Zadacha1 {
    public static void main(String[] args) {
        int n;
        int Sum = 0;
        int i = 0;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Введите размер  массива");
        n = s1.nextInt();
        int[] a = new int[n];
        Scanner s = new Scanner(System.in);
        System.out.println("Введите элементы массива");


        /*
        for(int i = 0; i<n;i++) {
            a[i] = s.nextInt();
            Sum = Sum + a[i];
        }
         */
        /*
        while (i < n){
            a[i] = s1.nextInt();
            Sum = Sum + a[i];
            i++;
        }

         */
        do{
            a[i] = s1.nextInt();
            Sum = Sum + a[i];
            i++;
        }while(i<n);

        System.out.println("сумма эллементов массива равна: " + Sum);

    }
}