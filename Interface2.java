// implimenting multiple interfaces

interface A{
    int a = 10;
    void show();
}
interface B{
    int b = 20;
    void display();
}

class C implements A ,B {
        public void show(){
            System.out.println(a);
        }
        public void display(){
            System.out.println(b);
        }

        void tmp(){
            System.out.println("Chhali");
        }
}

public class Interface2 {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.tmp();
        obj.display();
    }
}
