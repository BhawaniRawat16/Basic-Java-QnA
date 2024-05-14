class AccessSpecifier{
    int a;

    void show(){
        System.out.println("a = "+a);
    }
}


public class defaultaccessspecifier {
    public static void main(String[] args) {
      AccessSpecifier ob1 = new AccessSpecifier();
      ob1.show();
      ob1.a = 12;
      ob1.show();  
    }
}
