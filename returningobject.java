//returning objects

class ReturnObj{
    int a;
    ReturnObj(){
        a = 0;
    }

    ReturnObj(int x){
        a = x;
    }

    void show(){
        System.out.println("a = "+a);
    }

    ReturnObj fun(ReturnObj t){
        ReturnObj obj = new ReturnObj();
        obj.a = t.a;
        return obj;
    }
}
public class returningobject {
  public static void main(String[] args) {
    ReturnObj d1 = new ReturnObj();
    ReturnObj d2 = new ReturnObj(12);
    ReturnObj d3 = new ReturnObj();

    d1.show();
    d2.show();
    d3.show();
    d3 = d1.fun(d2);

    d1.show();
    d2.show();
    d3.show();

  }  
}
