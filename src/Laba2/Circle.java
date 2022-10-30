package Laba2;

public class Circle {
    public double radius;
    public String color;

    public Circle(double r, String c){
        radius = r;
        color = c;
    }
    public Circle(double r){
        radius = r;
        color = "white";
    }

    public Circle(){
        radius = 3;
        color = "red";
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public String getColor(){
        return color;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", Area='" + getArea() + '\'' +
                '}';
    }
}
