package Laba4;

public class Planet implements Nameable{
    public String name;
    int year;

    Planet(String name, int year){
        this.name = name;
        this.year = year;
    }

    @Override
    public String getName() {
        return name;
    }


}
