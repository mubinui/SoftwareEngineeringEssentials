package MethodOverloadingAndOverriding;

public class Employee {
    String name;
    String ssn;
    String emailAddress;
    int yearOfBirth;
    // Method overloading
    public void display(){
        System.out.println("Method without parameter");
    }
    public void display(int a , double b){
        System.out.println("Method with two parameter");
    }

    // Method overriding
    public int getSalary(){
        return 0;
    }

}
