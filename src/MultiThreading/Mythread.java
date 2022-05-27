package MultiThreading;

public class Mythread {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Thread m = new Thread(new MultiThreadWithRunnable(i));
            m.start();
            m.isAlive();

        }


    }
}
