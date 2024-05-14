/**
 * passing1daryinfun
 */
public class passing1daryinfun {

    static void fun(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int []x = {3 , 4 , 1 , 2 ,6};

        fun(x);
    }
}