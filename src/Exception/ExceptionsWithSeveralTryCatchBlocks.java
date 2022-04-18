package Exception;

public class ExceptionsWithSeveralTryCatchBlocks {
    public void devide_by_zero(){
        int a = 10/0;

    }

    public static void main(String[] args) {
        int [] a = new int[5];
        ExceptionsWithSeveralTryCatchBlocks ex = new ExceptionsWithSeveralTryCatchBlocks();
        try{
            int x = a[4];
            ex.devide_by_zero();
        }
        catch (ArithmeticException e ){
            e.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("All errors handled ");
        }

    }
}
