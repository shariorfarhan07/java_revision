package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class queuetest {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.peek());
        System.out.println(q.add(1));
        System.out.println(q.offer(11));
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.element());
        System.out.println(q.remove());
    }
}
