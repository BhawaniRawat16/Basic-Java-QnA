// Super Keywor - Access in hidden variable
class Parent{
    int a = 10;
}

class Child extends Parent{
    int a = 20;
    void show(){
        System.out.println(a);
        System.out.println(super.a);
    }
}
public class SuperHiddenVariable {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.show();
    }
}
