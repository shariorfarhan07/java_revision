package polymorphism.part3;

public class mainpart3 {
    public static void main(String[] args) {
//        class A inherites B and B inherites c
        A a=new A();
        B b=new B();
        C c=new C();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a.name);
        System.out.println(b.name);
        System.out.println(c.name);
        System.out.println("==================================");
        A aa=new A();   // parent class on parrent class
        A bb=new B();   // child class on parrent class
        B cc=new C();   // child class on parrent class
        System.out.println(aa);
        System.out.println(bb);
        System.out.println(cc);

        System.out.println(aa.name);
        System.out.println(bb.name);
        System.out.println(cc.name);
        /*
         * if we construct a class in its parent class variable type and print  same variable
         * it will print the value store in its parent class
         */
        System.out.println("==================================");
        a.method();
        b.method();
        c.method();

        System.out.println("==================================");
        aa.method();
        bb.method();
        cc.method();
        /*
         * if we construct a class in its parent class variable type and print same methods
         * it will print the value store in its same class
         * */
        System.out.println("==================================");


    }
}
