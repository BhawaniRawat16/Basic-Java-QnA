//  absract Method - Overriding is compulsary
 abstract class Parent{
    abstract void show();
}
class Child extends Parent{
    void show(){
        System.out.println("Hy");
    }
}

public class AbsractMethod {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.show();
    }
}
