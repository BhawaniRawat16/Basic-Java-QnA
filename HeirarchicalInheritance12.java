class Shape{
    int len , breadth , area;

    void showArea(String str){
        area = len*breadth;
        System.out.println("The Area Of "+str+" Is : "+area);
    }
}

class Rectangle extends Shape{
    void set(int a , int b){
        len = a;
        breadth = b;
    }
}

class Square extends Shape{
    void set(int a){
        len = a;
        breadth = a;
    }
}

class HeirarchicalInheritance12 {
    public static void main(String[] args) {
        Ractangle obj = new Ractangle();
        obj.set(5, 6);
        obj.showArea();

        Square obj1 = new Square();
        obj1.set(5);;
        obj1.showArea("Square");
    }
}
