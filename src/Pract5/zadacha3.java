package Pract5;

public class zadacha3 {
    public static String recursion(int a, int b){
        if (a == b){
            return Integer.toString(a);
        }
        if (a>b){
            return a + " " + recursion(a-1, b);
        }
        else {
            return a + " " + recursion(a+1, b);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion(10,1));
        System.out.println(recursion(1,10));
        System.out.println(recursion(5,5));
    }
}