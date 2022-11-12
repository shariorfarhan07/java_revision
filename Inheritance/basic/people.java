package Inheritance.basic;

public class people {
    String name;
    String email;
    int age;
    String address;
    public people(String n,String e,int a,String ad){
         name=n;
         email=e;
         age=a;
         address=ad;
    }
    public people(){
        name="defaul";
        email="defaul@g.com";
        age=00;
        address="defaul";
    }

    @Override
    public String toString() {
        return "Name:"+name+"\n"+"Email:"+email+"\n"+"Age:"+age+"\n"+"Address:"+address+"\n";
    }
}
