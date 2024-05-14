// Multi-level inheritance
class A {
    int a;

    void showA() {
        System.out.println("Class A = " + a);
    }
}

class B extends A {
    int b;

    void showB() {
        System.out.println("Class B = " + b);
    }
}

class C extends B {
    int c;

    void showC() {
        System.out.println("Class C = " + c);
    }
}

public class multilevelInheritance {
    public static void main(String[] args) {
        C ob = new C();
     ob.a = 44; ob.b = 22; ob.c = 45;
    ob.showC();// class C = 45
    ob.showA();//class A = 44
    ob.showA();//class A = 44
    ob.showB();//class B = 22
     }
}
