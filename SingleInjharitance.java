// Single Inheritance

class Parent{//base class , super class
    void parentMethod(){
        System.out.println("This Is A Parent METHOD");
    }
}
class Child extends Parent{//derived class , sub class
    void childMethod(){
        System.out.println("This Is A child METHOD");
    }
}

public class SingleInjharitance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.parentMethod();
        obj.childMethod();
    }
}
