import java.util.Scanner;

class StringCompare{
    static String StringCompare(String x , String y){
          if(x.length() == y.length()){
            return "Both Strings Are Equal";
          }
          else if(x.length() > y.length()){
            return x;
          }else{
            return y;
          }
    }

    public static void main(String[] args) {
        String st , str , k;

        Scanner ob = new Scanner(System.in);
        System.out.print("Enter First String : ");
        st = ob.next();
        System.out.print("Enter Second Number : ");
        str = ob.next();

        // ::::::::::::::::::::::::::::::::::::::----------------BHAWANI-------------::::::::::::::::::::::::::::::::::::::
        k = StringCompare(st ,str);
        System.out.print(" "+k);
    }
}