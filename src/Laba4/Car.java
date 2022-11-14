package Laba4;

public class Car implements Nameable {
    public String name;
    public String color;

    Car(String name, String color){
        this.name = name;
        this.color = color;
    }

    @Override
    public String getName() {
        return name;
    }


}