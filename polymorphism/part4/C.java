package polymorphism.part4;

public class C extends B{
    String name="class C";
    String namec="class C";
    public void method(){
        System.out.println(super.name);
    }
    public void methodc(){
        System.out.println(super.name);
    }

}
