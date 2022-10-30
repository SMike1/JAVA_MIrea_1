package Laba3;

public class Plate extends Dish{
    private String size;
    public Plate(String material, String color, String size) {
        super(material, color);
        this.size = size;
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Plate:" + " Size: '" + size + '\'' +
                " Material: '" + material  + '\'' +
                " Color: '" + color + '\'';
    }
}

