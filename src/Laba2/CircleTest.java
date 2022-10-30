package Laba2;

public class CircleTest {
    public static void main(String[] args){
        Circle c1 = new Circle(3);
        Circle c2 = new Circle(6, "Black");
        Circle c3 = new Circle();
        c1.setColor("Purple");
        c3.setRadius(2);
        System.out.println("Radius is " + c1.getRadius() + ". Color is " + c1.getColor() + ". Area is " + c1.getArea());
        System.out.println(c2);
        System.out.println(c1.getArea());
        System.out.println(c2.getColor());
        System.out.println(c3.getRadius());
    }
}
