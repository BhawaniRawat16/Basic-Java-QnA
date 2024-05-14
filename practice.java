import java.util.Scanner;

public class practice {

    static String Sum(String a , String b){

        if(a.equals(b)){
            return "Entered Strings Are Equal";
        }else if(a.length() > b.length()){
            return a;
        }else{
            return b;
        }

         
    }
    public static void main(String[] args) {
        String a, b;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter A String : ");
        a = ob.next();
        System.out.print("Enter A String : ");
        b = ob.next();

        String k = Sum(a , b);
        System.out.println(" "+k);
    }
}