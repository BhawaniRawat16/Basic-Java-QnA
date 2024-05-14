import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        double principle , time , rate ;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter Principle : ");
        principle = ob.nextDouble();
        System.out.print("Enter Time : ");
        time = ob.nextDouble();
        System.out.print("Enter Rate : ");
        rate = ob.nextDouble();

        double CI;
        CI = principle*(Math.pow((1 + rate/100), time));

        System.out.println("Total Compound Interest : "+CI);


    }
}
