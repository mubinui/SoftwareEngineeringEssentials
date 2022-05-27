package Polymorphism;

public class Dog extends Animal{
    private int breed;

    public int getBreed() {
        return breed;
    }

    @Override
    public void eat() {
        System.out.println("Biscuit");
    }

    public void setBreed(int breed) {
        this.breed = breed;
    }
}
