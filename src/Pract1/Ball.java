package Pract1;

import java.awt.*;

public class Ball {
    public String title;
    public int size;
    public String color;

    public Ball(String t, int s, String c){
        title = t;
        size = s;
        color = c;
    }
    public Ball(String t, int s){
        title = t;
        size = s;
    }

    public Ball(String t){
        title = t;
        size = 20;
    }

    public Ball(){
        title = "Ball Star";
        size = 30;
    }

    public void setSize(int size){
        this.size = size;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getTitle(){
        return title;
    }

    public String getColor() {
        return color;
    }

    public int getSize(){
        return size;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "title='" + title + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }


}
