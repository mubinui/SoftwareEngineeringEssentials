package Abstraction;

public class Tester {
    public static void main(String[] args) {


        Circle c1 = new Circle("Red",5);
        System.out.println(c1.toString());
        Shape s1 = new Circle("RED",6);
        System.out.println(s1.toString());
        Shape s2 = new Rectangle("Green", 4,4);
        System.out.println(s2.toString());


    }
}
