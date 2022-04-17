package AbstractClass;

public class BracBank extends Bank {

    @Override
    public int interest(int x) {

        System.out.println("We will give you 100x interest ");
        System.out.println("Risk will be greater ");
        System.out.println("We invest in casino ");

        return x*100;
    }

    @Override
    public void bank_details(String account_type) {
        super.bank_details(account_type);
        System.out.println("We have different type of Banking system ");
    }
}
