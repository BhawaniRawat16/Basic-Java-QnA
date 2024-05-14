// Entending and implementing (multiple interfaces)

interface A{
    void show();
}
interface B {
    void show2();
}

class C {
    void show3(){
        System.out.print("CHHALI");
    }
}
 class D extends C implements A ,B{
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

public class interfaces10 {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
        obj.show2();
        obj.show3();
        obj.display();
    }
}

   