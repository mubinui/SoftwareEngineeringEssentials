package AbstractClass;

public abstract class Bank {

    public abstract int interest(int x);

    public void bank_details(String account_type){
        if (account_type.equals("Premium")){
            System.out.println("Welcome sir ! Thank you for choosing our bank ");

        } else if (account_type.equals("Normal")) {
            System.out.println("Welcome brother ! Thank you for choosing our bank ");

        } else if (account_type.equals("Student")) {
            System.out.println("Sorry !!! We dont think a student needs a bank account ");

        }

    }
    // We can keep methods they are not abstract in abstract class
}

