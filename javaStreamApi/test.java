package javaStreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        List<Integer> ls= Arrays.asList(1,2,3,4,5,6,7,8,9);
        Stream<Integer> data= ls.stream();
//        data.forEach(n-> System.out.println(n));
        data.forEach(n-> System.out.println(n*n));
    } 
}
