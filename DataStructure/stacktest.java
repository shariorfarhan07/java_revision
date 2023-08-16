package DataStructure;

import java.util.Stack;

public class stacktest {


    public static void main(String[] args) {
        Stack<Integer> sp=new Stack<>();
        sp.push(1);
        sp.push(2);
        sp.push(3);
        sp.push(4);
//        System.out.println(sp.peek());
//        System.out.println( sp.pop());
//        System.out.println(sp.peek());
//        System.out.println( sp.pop());
//        System.out.println(sp.peek());
//        System.out.println( sp.pop());
//        System.out.println(sp.peek());
//        System.out.println( sp.pop());
        System.out.println( sp.firstElement());
        System.out.println( sp);
        System.out.println( sp.peek());

    }
}
