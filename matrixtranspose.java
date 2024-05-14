import java.util.Scanner;

class Matrix{
    public static void main(String[] args) {
        int arr[][] = new int[2][3];
        int ar[][] = new int[3][2];
        Scanner ob = new Scanner(System.in);
        for(int i =0 ; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Enter A Number : ");
                arr[i][j] = ob.nextInt();
            }
        }

        
        for(int i =0 ; i < 3; i++){
            ar[i][0] = arr[0][i];
            ar[i][1] = arr[1][i];
            
        }

        for(int i =0 ; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(" "+ar[i][j]);
                
            }
            System.out.println();
        }
    }
}