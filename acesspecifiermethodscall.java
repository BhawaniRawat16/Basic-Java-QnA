class Example{
    int a , b;
    void set(int x, int y){
        a=x;
        b=y;
    }

    void sum(){
        System.out.println("Sum = "+a + b); //Sum = 1020
        System.out.println("Sum = "+ (a+b));//Sum = 30
    }

    void sub(){
        System.out.println("Sub = "+(a-b));
    }
}


public class acesspecifiermethodscall {
   public static void main(String[] args) {
    Example obj = new Example();
    obj.set(10, 20);
    obj.sum();
    obj.sub();


    Example obj1 = new Example();
    obj1.set(100 , 200);
    obj1.sum();
    obj1.sub();
   } 
}
