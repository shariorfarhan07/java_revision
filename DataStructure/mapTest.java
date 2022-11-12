package DataStructure;

import java.util.HashMap;
import java.util.Map;

public class mapTest {
    public static void main(String[] args) {
        Map<Integer,Integer> mp=new HashMap<>();
        mp.put(100,1);
        mp.put(200,2);
        mp.put(300,3);
        mp.put(400,4);
        System.out.println(mp);
        System.out.println(mp.put(400,5));
        System.out.println(mp.put(400,5));
        System.out.println(mp.putIfAbsent(5,5));
        System.out.println(mp.putIfAbsent(5,54));
        System.out.println(mp);
    }
}
