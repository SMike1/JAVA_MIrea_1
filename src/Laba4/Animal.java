package Laba4;

public class Animal implements Nameable {
    public String name;
    public int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }


}
