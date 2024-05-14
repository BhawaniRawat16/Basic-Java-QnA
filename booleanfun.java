import java.util.Scanner;

public class booleanfun {

    static float area(float x , float y){
        float res = x*y;
        return res;
    }

    static float area(int x , int y){
        float res = 0.5f*x*y;
        return res;
    }

    static float area(int rad){
        float pi = 3.14f;
        float res = pi*rad*rad;
        return res;

    }
    
    
    public static void main(String[] args) {
        float a , b;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter A length of ractangle : ");
        a = ob.nextFloat();
        System.out.print("Enter A breath of ractangle : ");
        b = ob.nextFloat();

        float f = area(a,b);
        System.out.println("The Area Of Ractangel Is : "+f);

        int x , y;
        System.out.print("Enter The Length of triangle : ");
        x = ob.nextInt();
        System.out.print("Enter The breath of triangle : ");
        y = ob.nextInt();
        
        float t = area(x , y);
        System.out.println("The Area Of Triangle Is : "+t);

        System.out.print("Enter The Radius Of Circle : ");
        int z = ob.nextInt();

        float c = area(z);
        System.out.println("The Area Of Circle Is : "+c);
    }
}
