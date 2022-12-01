package Laba3;

public class TestDish {
    public static void main(String[] args){
        Plate p1 = new Plate("glass", "white", "big");
        Cup c1 = new Cup("glass", "transparent", 0.5);
        System.out.println(c1.getColor());
        System.out.println(p1.getColor());
        System.out.println(p1);
        System.out.println(c1);
    }
}
