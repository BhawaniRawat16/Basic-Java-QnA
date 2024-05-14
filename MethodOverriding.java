// Method Overriding
class Parent{
    void show(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.show();
    }
}

