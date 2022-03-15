package Abstraction;

public class Rectangle extends Shape{
    double length;
    double height;

    public Rectangle(String color, double length, double height){
        // calling shape constructor
        super(color);
        System.out.println("Rectangle color "+color);
        this.length = length;
        this.height = height;
        System.out.println("Rectangle constructor called ");
    }

    @Override
    double area() {
        return length * height;
    }

    public String toString(){
        return "Rectangle{"+
                "area="+area()+ ", color='" + color + '\''
                +'}';
    }
}
