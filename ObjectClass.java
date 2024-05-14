// Object - root class (every  class inherits object class implicity)
class Charry{
    void show(){
        System.out.println("She Loves & Cares Always..😘😘💕");
    }
}
public class ObjectClass {
    public static void main(String[] args) {
        Charry ob = new Charry();
        ob.show();

        System.out.println(ob.getClass());
    }
}