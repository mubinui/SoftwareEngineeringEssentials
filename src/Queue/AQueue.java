package Queue;

public class AQueue implements Queue{
    int front =0;
    int rear = -2;
    int s = 0;
    Object a[]= new Object[4];
    @Override
    public int size() {
        return s;
    }

    @Override
    public void enqueue(Object o) {
        if (size()==a.length){
            Object [] b = new Object[a.length*2];
            for (int i = 0; i <a.length ; i++) {
                b[i]=a[i];

            }
            a = b;

        }

        if (size()==0){
            a[0] = o;
            rear = 1;
            s++;

        }
        else {
            a[rear] = o;
            rear++;
            s++;
        }

    }

    @Override
    public Object dequeue() throws Exception {

        try {

            if (size() > 0) {
                Object x = null;
                x = a[front];

                leftShift(a);
                a[size() - 1] = null;

                s--;
                return x;

            }
        }
        catch (Exception e){
            e.printStackTrace();

        }
        return null;




    }

    @Override
    public Object peek() {
        return a[0];
    }

    @Override
    public boolean is_empty() {
        return size()==0;
    }
    public void leftShift(Object a[]){
        for (int i=0; i<size()-1;i++){
            a[i] = a[i+1];
        }


    }
}
