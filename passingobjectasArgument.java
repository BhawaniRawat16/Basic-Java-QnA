class MyDemo{
    int a;
    MyDemo(){
        a = 0;
    }

    MyDemo(int x){
        a = x;
    }

    void fun(MyDemo t){
        a = t.a;
    }

    void show(){
        System.out.println(a);
    }
}


public class passingobjectasArgument {
    public static void main(String[] args) {
        MyDemo d1 = new MyDemo();
        MyDemo d2 = new MyDemo(10);
        d1.fun(d2);

        d1.show();
        d2.show();
    }
}
