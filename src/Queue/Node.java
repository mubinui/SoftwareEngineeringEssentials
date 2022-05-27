package Queue;

public class Node {
    public Node next;
    public Node prev;
    public Object val;


    public Node(Object v, Node n, Node prev){
        this.val = v;
        this.next = n;
        this.prev = prev;
    }
}
