public class funoverloading {
    static void fun(int x, int y){
        System.out.println(x+y);
    }

    static void fun(int x, int y , int z){
        System.out.println(x+y+z);
    }

    static void fun(int x, float y){
        System.out.println(x+y);
    }
    public static void main(String[] args) {
       fun(3,6); 
       fun(3,6 , 8); 
       fun(3,6.6f); 
    }
}
