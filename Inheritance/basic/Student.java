package Inheritance.basic;

public class Student extends people{
    String dep;
    String Id;
    int fees;
    String semester;

    public Student(String n, String e, int a, String ad, String dep, String id, int fees, String semester) {
        super(n, e, a, ad);
        this.dep = dep;
        Id = id;
        this.fees = fees;
        this.semester = semester;
    }

    public Student(String dep, String id, int fees, String semester) {
        this.dep = dep;
        Id = id;
        this.fees = fees;
        this.semester = semester;
    }
}
