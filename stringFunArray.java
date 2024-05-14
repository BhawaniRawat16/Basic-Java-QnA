import java.util.Scanner;

public class stringFunArray {

    static void StringReverse(String arg[]){
        int n = arg.length;
        for(int i = n - 1; i >= 0; i--){
            System.out.println(arg[i]);
        }
    }
    public static void main(String[] args) {
        String ar[]  = new String[5];
        Scanner ob = new Scanner(System.in);
        int n = ar.length;
        for (int i = 0; i<n; i++) {
            System.out.print("Enter A String : ");
            ar[i] = ob.next();
        }

        StringReverse(ar);
    }
}
