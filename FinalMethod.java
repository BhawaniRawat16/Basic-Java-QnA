  // Final Method - can not override
class Parent{
    final void show(){
        System.out.println("Hello");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("World");
    }
}
public class FinalMethod {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.show();
    }
}
