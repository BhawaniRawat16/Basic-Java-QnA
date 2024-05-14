import java.util.Scanner;

class Circle{
    float rad;

    void set(float a){
        rad = a;
    }

    float areaCircle(){
        float res = 3.14f*rad*rad;
        return res;
    }

    float circumtanceCircle(){
        float res = 3.14f*2f*rad;
        return res;
    }


}



public class classCircle {
    public static void main(String[] args) {
        float x;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Radius Of Circle : ");
        x = ob.nextFloat();

        Circle obj = new Circle();
        obj.set(x);

        float res = obj.areaCircle();
        System.out.println("The Area Of Circle Is : "+res);
        // float  = obj.circumtanceCircle();
        System.out.println("The Circumtance Of Circle Is : "+obj.circumtanceCircle());
    }
}
