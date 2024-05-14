import java.util.Scanner;

class Parent{
    Scanner obj = new Scanner(System.in);

    int a;
    void setA(){
      System.out.print("Enter A Number : ");  
      a = obj.nextInt();
    }

    void showA(){
        System.out.println(a);
    }
}

class Child extends Parent{
    int s;
    void squarOfA(){
      s = a*a;
    }

    void showSquar(){
        System.out.println(s);
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        Child ob = new Child();
        ob.setA();
        ob.showA();
        ob.squarOfA();
        ob.showSquar();
    }
}
