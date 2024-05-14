// Nested Of Constuctor
class NestedC{
    int a,b;
    NestedC(){
        a=0;
        b=0;
    }
    NestedC(int x){
        a=x;
        b=0;
    }
    NestedC(int x, int y){
        // a=x;
        // b=y;
        this(x);
    }
    void show(){
        System.out.println("a = "+a);
        System.out.println(" b = "+b);
    }
}

public class NestedConstructor {
    public static void main(String[] args) {
        NestedC n1 = new NestedC();
        n1.show(); 
    }
}