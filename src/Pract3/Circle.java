package Pract3;

import java.awt.*;

public class Circle extends Shape{
    protected double radius;



    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(){}

    public Circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle: " + "Radius: '" + radius + '\''+
                " Color: '" + color + '\''+
                " filled: '" + filled + '\'' +
                " Area: '"  + getArea() + '\''+
                " Perimeter: '" + getPerimeter() + '\'';

    }
}
