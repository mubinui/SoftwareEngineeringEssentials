package MethodOverriding;


public class EmployeeeDemo {
    public static void main(String[] args) {
        Employeee e1 = new Employeee();
        e1.display();
        e1.display(1,3);
        e1.display("Mubin",11);
        int y = e1.getSalary();


        EmployeeeOverriding e2 = new EmployeeeOverriding();
        int x = e2.getSalary();

        Employeee e3 = new EmployeeeOverriding();
        int a = e1.getSalary();
        // the method will run from the parent class

        //EmployeeeOverriding e4 = new Employeee(); not possible



    }

}
