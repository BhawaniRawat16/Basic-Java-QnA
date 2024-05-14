// Partial Implement
interface A{
    void show();
    void display();
}
class B implements A{
    public void show(){
        System.out.print("Sunn.....Deep");
    }
}
class C extends B{
    public void display(){
        System.out.print("Demo");
    }
}

public class Interface6 {
    public static void main(String[] args) {
        C ob = new C();
        ob.show();
        ob.display();
    }
}
