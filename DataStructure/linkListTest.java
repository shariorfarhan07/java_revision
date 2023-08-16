package DataStructure;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class linkListTest {
    public static void main(String[] args) {
        LinkedList<Integer> lp=new LinkedList<>();
//        lp.push(1);
//        lp.push(2);
//        lp.push(3);
//        lp.push(4);
//        lp.push(5);

        lp.add(1);
        lp.add(2);
        lp.add(3);
        lp.add(4);
        lp.add(5);
        System.out.println(lp.get(0));
        System.out.println(lp);
        lp.add(1,111);



        System.out.println(lp);

        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9);
        ls.forEach(n-> {
            System.out.print(n);
            System.out.println();
        });
    }
}
