package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        System.out.println(a.get(1));
        a.put(1,11);
        a.put(2,11);
        a.put(3,11);
        a.put(4,11);
        a.put(5,11);

        Set b=a.keySet();
        Iterator i = b.iterator();
        while (i.hasNext()){
            System.out.println(i);
            i.next();
        }

    }
}
