package MethodOverriding;

public class Employeee {
    String name;
    String ssn;
    String email;
    int year_of_birth;

    //Method overloading
    public void display(){
        System.out.println("I am a method without parameter");
    }

    public void display( int a, double b){
        System.out.println("I am another method with int and double value");

    }

    public void display(String a, double b){
        System.out.println("I am another method with string and double values ");
    }


    //method overriding
    public int getSalary(){
        System.out.println("I am your parent ");
        return 0;
    }
}
