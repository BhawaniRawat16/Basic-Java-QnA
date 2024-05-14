//reffer child by parent object

class Parent{
    void show(){
        System.out.println("Abc");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("pqr");
    }
}
public class refferchildclass {
    public static void main(String[] args) {
        Parent ob = new Parent();
        ob.show();

        ob = new Child();
        ob.show();
    }
}
