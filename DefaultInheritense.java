// Default Constructor in Inheritense
class Parent{
    Parent(){
        System.out.println("Parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("Child");
    }
}

public class DefaultInheritense {
    public static void main(String[] args) {
        Child ob = new Child();
        
    }
}
