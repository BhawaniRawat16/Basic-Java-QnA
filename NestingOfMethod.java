// Nested Of Methods
class Nested{
    int a,b;
    void set(int a, int b){
        this.a=a;
        this.b=b;
    }
    int addNow(){
        return(a+b);
    }
    void show(){
        System.out.println(addNow());
    }
}

public class NestingOfMethod {
    public static void main(String[] args) {
      Nested n1 = new Nested();
      n1.set(7, 8);  
      n1.show();
    }
}
