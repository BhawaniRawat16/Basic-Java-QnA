class Parent{
     int a; 
     void parentMethod(){
        System.out.println("This is parent method"+a);
     }
}

class Child extends Parent{
    int b;
    void childMethod(){
        System.out.println("This is child method"+b);
    }
}
public class SingleInheritance1 {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.a = 10;
        ob.b = 20;

        ob.childMethod();
        ob.parentMethod();
    }
}
