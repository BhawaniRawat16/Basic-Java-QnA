import java.util.Scanner;

class Squar{
    int x;
    void set(int a){
      x = a;  
    }

    void squarArea(){
        int area = x*x;
        System.out.println("The Area Of Squar Is : "+area);
    }

    void squarPerametre(){
        int pera =4*x;
        System.out.println("The Area Of Squar Is : "+pera);
    }
}

public class classSquar {
    public static void main(String[] args) {
        int x ;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter The Side  Of Squar : ");
        x = ob.nextInt();

        Squar obj = new Squar();
        obj.set(x);

        obj.squarArea();
        obj.squarPerametre();

    }
}
