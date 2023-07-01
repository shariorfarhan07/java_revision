package exception;

import java.io.Serializable;

public class Tester implements Serializable, Cloneable {
    public static void main(String args[]) {

        try {
            int a = 0;
            int b = 10;
            int result = b/a;
            System.out.println(result);

        } catch(Exception e) {
            System.out.println("toString(): " + e.toString());
            System.out.println("getMessage(): " + e.getMessage());
            System.out.println("StackTrace: ");
            e.printStackTrace();
        }
    }
}