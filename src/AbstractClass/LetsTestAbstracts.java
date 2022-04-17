package AbstractClass;

public class LetsTestAbstracts {
    public static void main(String[] args) {
        SouthEast ac1 = new SouthEast();
        int i1 = ac1.interest(500);
        System.out.println(i1);
        ac1.bank_details("Premium");
        ac1.bank_details("Student");

        System.out.println("------------------------------------------------");

        BracBank ac2 = new BracBank();
        int i2 = ac2.interest(500);
        System.out.println(i2);
        ac2.bank_details("Premium");
        ac2.bank_details("Student");

        System.out.println("_________________________________________________");

        Bank b1 = new Bank() {
            @Override
            public int interest(int x) {
                System.out.println("Object b1 is implementing something ");
                return x*1000;
            }
        };
        int i3 = b1.interest(100);
        b1.bank_details("Student");

        System.out.println("--------------------------------------------------");

        Bank b2 = new BracBank();
        int i4 = b2.interest(100);
        System.out.println(i4);
        b2.bank_details("Student");

        System.out.println("-------------------------------------------------");
        Bank b3 = new BracBank();
        int i5 = b2.interest(100);
        System.out.println(i5);
        b2.bank_details("Student");




    }
}
