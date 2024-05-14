class StaticVar{
    static int a;

    void set(int x){
        a = x;
    }

    void show(){
        System.out.println(a);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
      StaticVar ob1 = new StaticVar(); 
      StaticVar ob2 = new StaticVar();  

      ob1.set(10);
      ob2.set(20);

      ob1.show();
      ob2.show();
    }
}
