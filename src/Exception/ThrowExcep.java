package Exception;

public class ThrowExcep {
    static void fun(){
        try{
            throw new NullPointerException("Cuca");
        }
        catch (NullPointerException e){
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        try{
            fun();
        }
        catch (NullPointerException e){
            System.err.println("Caught in main");
        }
    }
}
