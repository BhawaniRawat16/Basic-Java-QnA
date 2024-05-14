import java.util.*;

class A {
    int a;
    Scanner ob = new Scanner(System.in);
    void getA(){
        System.out.println("Enter a number : ");
        a = ob.nextInt();
    }
    void showA(){
        System.out.println(a);
    }
}
class B extends A{
    int b;
    void getB(){
        System.out.println("Enter a number : ");
        b = ob.nextInt();
    }
    void showB(){
        System.out.println(b);
    }
}
class C extends B{
    int c;
    void getTottal(){
       c = a+b;
    }
    void showTottal(){
        System.out.println("Tottal is = "+c);
    }
}

/**
 * multilevelInheritance12
 */
public class multilevelInheritance12 {

    public static void main(String[] args) {
        C ob = new C();
        ob.getA();
        ob.getB();
        ob.showA();
        ob.showB();
        ob.getTottal();
        ob.showTottal();
    }
}