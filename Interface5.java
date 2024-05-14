// same variable in both interfaces
interface A{
    int a = 10;
    void show();
}

interface B{
    int a = 20;
    void show();
}

class C implements A,B{
    public void show(){
        System.out.println(B.a);
        System.out.println(A.a);
    }
}
public class Interface5 {
    public static void main(String[] args) {
        C ob = new C();
        ob.show();
    }
}
