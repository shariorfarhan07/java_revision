public class variables {
    public static void main(String[] args) {
        /**TYPE        BYTE             RANGE
         * byte        1                [-128, 127]
         * short       2                [-32K, 32K]
         * int         4                [-2B, 2B]
         * long        8
         * float       4
         * double      8
         * char        2                'A', 'B', 'C', …
         * boolean     1                true / false
         *
         * The default integer type in Java is int. To represent a long value, we should add L
         * to it as a postfix.
         * The default floating-point type in Java is double. To represent a float, we should
         * append F to it as a postfix.
         */
        byte age = 30;
        long viewsCount = 3_123_456L;

        float price = 10.99f;
        double num=20.20;

        char letter = 'A';
        String line= "i love pizza";
        boolean isEligible = true;

        System.out.println(age);
        System.out.println(viewsCount);
        System.out.println(price);
        System.out.println(num);
        System.out.println(line);
        System.out.println(isEligible);
        System.out.println(letter);
        System.out.println((int)price);
//        int apple=10;
//        double applepie=apple;
//        System.out.println(applepie);
        double apple=10;
        int applepie=(int)apple;
        System.out.println(applepie);


    }
}
