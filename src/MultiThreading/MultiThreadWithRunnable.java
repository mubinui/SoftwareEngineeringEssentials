package MultiThreading;


public class MultiThreadWithRunnable  implements Runnable{
    private int treadNumber;
    public MultiThreadWithRunnable (int treadNumber){
        this.treadNumber = treadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i <5 ; i++) {
            System.out.println(i + " Our Thread Number" + treadNumber);
            try {
                Thread.sleep(1000);
                if (treadNumber == 3) {
                    throw new RuntimeException();
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
