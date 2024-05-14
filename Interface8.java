// Entending multiple interfaces

interface A{
    void show();
}
interface B extends A{
    void show2();
}

interface C extends A , B {
    void show3();
}
 class D implements C{
    public void show(){
        System.out.println("Gabber");
    }
    public void show2(){
        System.out.println("BASANTI");
    }
    public void show3(){
        System.out.println("THAKUR");
    }
    public void display(){
        System.out.println("DHANNO");
    }
 }

public class Interface8 {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.show2();
        obj.show3();
        obj.display();
    }
}
