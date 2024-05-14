import java.util.Scanner;
/**
 * matrixmultiply
 */
public class matrixmultiply {

    public static void main(String[] args) {
        int ar[][] = new int[3][3] , arr[][] = new int[3][3] , arr1[][] = new int[3][3];
        Scanner ob = new Scanner(System.in);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j<ar[i].length; j++){
                System.out.print("Enter A Number : ");
                ar[i][j] = ob.nextInt();
                
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j<ar[i].length; j++){
                System.out.print("Enter A Number : ");
                arr[i][j] = ob.nextInt();
                
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j<ar[i].length; j++){
                
                arr1[i][j] = ar[i][j]*arr[i][j];
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j<ar[i].length; j++){
                
                System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }

    }
}