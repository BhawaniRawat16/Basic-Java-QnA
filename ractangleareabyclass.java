import java.util.Scanner;

class Ractangle{
    int a , b;

    void set(int x , int y){
        a = x;
        b = y;
    }

    void showArea(){
        int ar = a*b;
        System.out.println("Area Of Rectangle : "+ar);
    }

    void showPerameter(){
        int pe = 2*(a+b);
        System.out.println("Perameter Of Rectangle : "+pe);
    }
}


public class ractangleareabyclass {
    public static void main(String[] args) {
       int a , b;
       Scanner ob = new Scanner(System.in);
       System.out.print("Enter A Height : ");
       a = ob.nextInt();
       System.out.print("Enter A Bass : ");
       b = ob.nextInt(); 

       Ractangle obj = new Ractangle();
       obj.set(a, b);
       obj.showArea();
       obj.showPerameter();
    }
}
