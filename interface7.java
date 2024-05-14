// Entends interfaces

interface A{
    void show();
}
interface B extends A{
    void show2();
}
 class C implements B{
    public void show(){
        System.out.println("Gabber");
    }
    public void show2(){
        System.out.println("BASANTI");
    }
    public void display(){
        System.out.println("DHANNO");
    }
 }

public class interface7 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.show2();
        obj.display();
    }
}
