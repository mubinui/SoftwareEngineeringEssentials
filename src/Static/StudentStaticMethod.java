package Static;

public class StudentStaticMethod {
    int rollno;
    String name;
    static String college = "Collectorate";
    static void change (){
        college = "MIT";
       // rollno = 18101640;
        // we cannot keep un-static variable in static method
        // it will give compilation error
    }
    // constructor
    StudentStaticMethod(int r, String n){
        rollno = r ;
        name = n ;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        StudentStaticMethod.change();
        StudentStaticMethod s1 = new StudentStaticMethod(18101640, "Mubin UIC");
        StudentStaticMethod s2 = new StudentStaticMethod(18101641, "SH UIC ");
        StudentStaticMethod s3 = new StudentStaticMethod(18101640, "SF UIC");
        s1.display();
        s2.display();
        s3.display();

    }
}
