package Static;

public class StudentStaticVariable {
    int rollno;
    String name;
    static String college = "MIT";

    static int count_student = 0;

    StudentStaticVariable(int r, String n ){
        rollno = r;
        name = n;
        count_student++;

    }

    void display(){
        System.out.println(rollno+" "+name+" "+count_student+" "+college);
    }

    public static void main(String[] args) {
        StudentStaticVariable s1 = new StudentStaticVariable(18101640, "Mubin");
        s1.display();

        StudentStaticVariable s2 = new StudentStaticVariable(18101641, "Tubin UIC");
        s2.display();
    }
}
