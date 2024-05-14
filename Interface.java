//  Interface - only final variables and absrects method
interface A{
    int a=10;
    void show();
}

class B implements A{
    public void show(){
        System.out.println(a);
    }
}
public class Interface {
    public static void main(String[] args) {
        B ob = new B();
        ob.show();
    }
    
}
