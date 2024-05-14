import java.util.Scanner;

public class sumofvikarn {
    public static void main(String[] args) {
        int arr[][] = new int[3][3];

        Scanner ob = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter A Number : ");
                arr[i][j] = ob.nextInt();

            }
        }
        int sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j || (i == j+2 || j == i+2)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The Sum Is : "+sum);
    }
}
