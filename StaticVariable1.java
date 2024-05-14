/**
 * StaticVariable1
 */

 class Staticvar1{
    static int a;

    void set(){
        a++;
    }

    void show(){
        System.out.println(a);
    }
 }
public class StaticVariable1 {

    public static void main(String[] args) {
        Staticvar1 ob1 = new Staticvar1();
        Staticvar1 ob2 = new Staticvar1();

        Staticvar1.a = 36;

        ob1.set();
        ob2.set();
        ob1.set();

        ob1.show();
    }
}