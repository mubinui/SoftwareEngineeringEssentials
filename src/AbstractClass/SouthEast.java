package AbstractClass;

public class SouthEast extends Bank{
    @Override
    public int interest(int x) {
        System.out.println("We do legal Investments so your money is safe here");
        System.out.println("Lesser risk");
        System.out.println("We invest in GDP");
        return 5*x;
    }
}
