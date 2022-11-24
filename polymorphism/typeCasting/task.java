package polymorphism.typeCasting;

public class task {
    public static void main(String[] args) {
        A a=new C(); // works as normal
        B b1=(B)((A) new C());// passes comiler but creates run time error.
        b1.method1();
//        B b2=new C();  // extends same parent class but gives error.


    }
}
class  A{
    public void method1(){
        System.out.println("A");
    }
}
class B extends A{

}
class  C extends A{

}