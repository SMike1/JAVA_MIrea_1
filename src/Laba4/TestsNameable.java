package Laba4;

public class TestsNameable {
    public static void main(String[] args){
        Animal a1 = new Animal("Собака", 5);
        Car c1 = new Car("BMW", "red");
        Planet p1 = new Planet("Saturn", 2005);
        System.out.println(a1.getName());
        System.out.println(c1.getName());
        System.out.println(p1.getName());
    }
}
