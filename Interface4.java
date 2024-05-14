// same method name in multiple interfaces
interface A{
    int a =10;
    public void show();
}
interface B{
    int b =20;
    public void show();
}

class C implements A,B{
    public void show(){
        System.out.println(a);
        System.out.println(b);
    }
    void tmp(){
        System.out.println("Charry");
    }
}

public class Interface4 {
    public static void main(String[] args) {
       C obj = new C();
       obj.show();
       obj.tmp(); 
    }
}
