package DataStructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        System.out.println(a.get(1));
        a.put(1,11);
        a.put(2,11);
        a.put(3,11);
        a.put(4,11);
        System.out.println(a.put(5,11));
        System.out.println(a.putIfAbsent(5,111));


        Set b=a.keySet();
        Iterator i = b.iterator();
        while (i.hasNext()){
            System.out.println(i.next());

        }

        for (Map.Entry<Integer,Integer> en:a.entrySet()
             ) {
            System.out.println(en);
            System.out.println(en.getKey());
            System.out.println(en.getValue());

        }
        System.out.println("this is a test case to learn hashmap");
        String sentence= """
               What is a paragraph? Paragraphs are the building blocks of papers.
               Many students define paragraphs in terms of length: 
               a paragraph is a group of at least five sentences, 
               a paragraph is half a page long, etc. In reality, 
               though, the unity and coherence of ideas among 
               sentences is what constitutes a paragraph.
                """;
        HashMap<Character,Integer> hm=new HashMap<>();
        for (int j = 0; j < sentence.length(); j++) {
            if (hm.containsKey(sentence.charAt(j)) && sentence.charAt(j)!=' ' && sentence.charAt(j)!=13){
                hm.replace(sentence.charAt(j), hm.get(sentence.charAt(j))+1);
            }else{
                hm.put(sentence.charAt(j),1);
            }
        }
        for (Map.Entry<Character,Integer> e:hm.entrySet()
             ) {
            System.out.println(e);
        }


    }


}
