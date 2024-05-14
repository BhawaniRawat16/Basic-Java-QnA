/// Heirarchical inhetitense
class A{
    int a;
    void showA(){
        a = 10;
        System.out.println(a);
    }
}

class B extends A{
    int b;
    void showB(){
        b = 20;
        System.out.println(b);
    }
}

class C extends A{
    int c;
    void showC(){
        c = 30;
        System.out.println(c);
    }
}


public class HeirarchicalInheritance {

    public static void main(String[] args) {
        B obj = new B();
        obj.showA();
        obj.showB();

        C obj1 = new C();
        obj1.showA();
        obj1.showC();
    }
}

