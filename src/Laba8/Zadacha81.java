package Laba8;

import java.io.*;
import java.util.Scanner;

public class Zadacha81 {
    public static void main(String[] args)throws IOException{
        System.out.println("Введите строку которую хотите записать в файл");
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int i = 0;

        File file = new File("Zadacha1.txt");

        file.createNewFile();

        FileWriter writer = new FileWriter(file);

        writer.write(line);
        writer.flush();
        writer.close();

        //2 zadanie
        FileReader fr = new FileReader(file);
        char[] a = new char[20];

        fr.read(a);


        for(char c : a){

            System.out.print(c);
        fr.close();
        }
    }
}
