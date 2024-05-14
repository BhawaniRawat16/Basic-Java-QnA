class PrivateClass{
    private int a;
    int b;
    private void show(){
        System.out.println("a = "+a);
    }

    void display(){
        show();
        System.out.println("b = "+b);
    }
}


public class privateaccessspecifier {
    public static void main(String[] args) {
        PrivateClass ob = new PrivateClass();
        // ob.a =12;  ///error
        // ob.show(); ///error

       ob.b = 13;
       ob.display(); 
    }
}
