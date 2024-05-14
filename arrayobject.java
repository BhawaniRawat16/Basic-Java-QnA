class IsEqualObject{
    int a , b;
    void set(int a , int b){
        this.a = a;
        this.b = b;
    }

    void showData(){
        System.out.println("a = "+a+" b = "+b);
    }

    boolean isEqual(IsEqualObject t){
        if((this.a == t.a) && (this.b == t.b)){
          return true;
        }else{
            return false;
        }
        
    }  
        
       
}

class arrayobject{
    public static void main(String[] args) {
        IsEqualObject ob = new IsEqualObject();
        ob.set(10, 20);
        ob.showData();

        IsEqualObject ob1 = new IsEqualObject();
        ob1.set(100, 200);
        ob1.showData();

        boolean res = ob.isEqual(ob1);
        System.out.println(res);
        // ob.showDataAgain();
    }
}