package Queue;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class LinkedList {
    public static void main(String[] args) {

//        Node n1 = new Node(10,null,null);
//        Node n2 = new Node(20, null,null);
//        Node n3 = new Node(30,null,null);
//        Node n4 = new Node(40, null,null);
//
//        n1.next = n2;
//        n2.prev = n1;
//        n2.next = n3;
//        n3.prev = n2;
//        n3.next = n4;
//        n4.prev = n3;
//        n4.next = n1;
//        n1.prev = n4;
//        Node tail = new Node(0,null,null);
//        for(Node x = n4; x!=null; x=x.prev){
//            System.out.print(x.val+"->");
//            tail =x;
//        }
        Queue <Integer> queue = new java.util.LinkedList<>();
        Queue<Integer> queue1 = new PriorityQueue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);

        queue1.add(11);
        queue1.add(3);
        queue1.add(5);
        queue1.add(9);
        System.out.println(queue1);
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());
        System.out.println(queue1.remove());

        Stack<Integer> stack = new Stack<>();

        stack.add(10);
        stack.add(20);
        stack.add(30);
        int x = stack.search(30);
        System.out.println(x);







    }
}
