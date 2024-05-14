class SumOfTwo{
    int a;
    SumOfTwo(){
        a = 0;
    }
    SumOfTwo(int a){
        this.a = a;
    }

    void show(){
        System.out.println("a = "+ a);
    }

    SumOfTwo sum(SumOfTwo s){
        SumOfTwo obj = new SumOfTwo();
         obj.a += s.a;
        // obj.a = total;
        return obj; 
    }
}

public class SumOf2VarReturningObj {
    public static void main(String[] args) {
        SumOfTwo s1 = new SumOfTwo();
        SumOfTwo s2 = new SumOfTwo(10);
        SumOfTwo s3 = new SumOfTwo(20);
        SumOfTwo s4 = new SumOfTwo();

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        
        s4 = s2.sum(s3);

        s1.show();
        s2.show();
        s3.show();
        s4.show();
        
    }
}