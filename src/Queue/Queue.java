package Queue;

public interface Queue {
    //size
    //is_empty
    //enqueue
    //dequeue
    //peek
    public int size();
    public void enqueue(Object o);
    public Object dequeue() throws Exception;
    public Object peek();
    public boolean is_empty();

}
