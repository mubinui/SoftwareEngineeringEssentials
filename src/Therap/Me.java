package Therap;

public class Me {
    public static void main(String[] args) {
        int x = 10;
        int i = 1;
        int j= 1;
        while(i<10){
            j = i*j;
            i = i+1;
            if (i == x){
                break;
            }
        }

    }

}
