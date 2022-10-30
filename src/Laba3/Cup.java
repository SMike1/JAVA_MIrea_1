package Laba3;

public class Cup extends Dish {
    private double size;


    public Cup(String material, String color, double size) {
        super(material, color);
        this.size = size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public String toString() {
        return "Cup:" + " Size: '" + size + '\'' +
                " Material: '" + material  + '\'' +
                " Color: '" + color + '\'';
    }
}

