package polymorphism.part3;

public class C extends B{
    String name="class C";

    public void method(){
        System.out.println(super.name);
    }
    public void methodc(){
        System.out.println(super.name);
    }
}
