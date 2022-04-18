package Therap;

public class Me01 {
    public void sort(int [] a){
        int index = 0;
        for (int i = 1; i <a.length ; i++) {
            if (a[i-1]>a[i]){
                index = i;
            }



        }


    }

    public static int fun(int n){
        if(n==4){
            return 2;

        }
        else {
            return 2* fun(n+1);
        }

    }

    public static void main(String[] args) {
        System.out.println(fun(2));


    }
}
