package Polymorphism;

public class Tester {
    public static void main(String[] args) {
        Animal my = new Animal();
        my.eat();
        Dog d = new Dog();
        d.eat();
        Animal an = new Dog();
        an.eat();

    }
}
