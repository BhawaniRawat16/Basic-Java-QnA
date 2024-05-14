class Assignment{
    int a , b;
    void set(int a , int b){
        this.a = a;
        this.b = b;
    }

    void showData(){
        System.out.println("a = "+a+" b = "+b);
    }

    void addObjectValue(Assignment a){
        this.a += a.a;
        this.b += a.b;
        // System.out.println("a = "+this.a+" b = "+this.b);
    }

    void showDataAgain(){
        System.out.println("a = "+this.a+" b = "+this.b);
    }

}

class twoobjectnested{
    public static void main(String[] args) {
        Assignment ob = new Assignment();
        ob.set(10, 20);
        ob.showData();

        Assignment ob1 = new Assignment();
        ob1.set(100, 200);
        ob1.showData();

        ob.addObjectValue(ob1);
        ob.showDataAgain();
    }
}