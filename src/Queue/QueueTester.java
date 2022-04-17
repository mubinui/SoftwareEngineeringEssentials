package Queue;

public class QueueTester {
    public static void main(String[] args) throws Exception {
        AQueue q1 = new AQueue();
        System.out.println(q1.is_empty());
        System.out.println(q1.size());
        q1.enqueue(10);
        q1.enqueue(20);
        System.out.println(q1.peek());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        q1.enqueue(30);
        q1.enqueue(40);
        System.out.println(q1.peek());
        q1.enqueue(50);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        for (int i = 0; i <100 ; i++) {
            q1.enqueue(1);

        }
        for (int i =0; i<105; i++){
            System.out.print(q1.dequeue()+"->");
        }


    }

}
