package Pract5;

public class zadacha2 {
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }
        return recursion(n - 1) + " " + n;
    }
    public static void main(String[] args){
        System.out.print(recursion(54));
    }
}
