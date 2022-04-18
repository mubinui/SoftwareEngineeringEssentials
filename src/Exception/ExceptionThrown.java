package Exception;

public class ExceptionThrown {
    public static int devide_by_zero(int a, int b){
        int x = a/b;
     return x;
    }


    public static int computeDivision(int a , int b){
        int res = 0;
        try{
            res = devide_by_zero(a,b);
        }
        catch (NumberFormatException e){
            System.err.println("Exception occurred");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int i = computeDivision(a,b);

        }
        catch (ArithmeticException e){
            System.err.println("Arithmetic exception occurred");

        }
    }
}
