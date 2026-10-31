package org.example;

public class Rectangle {
    private double width;
    private double height;
private String color;
public String getColor(){
    return color;
}
public void setColor(String color){
    this.color = color;
}
    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return width*height;
    }
    public double perimeter(){
        return (width+height)*2;
    }
}
