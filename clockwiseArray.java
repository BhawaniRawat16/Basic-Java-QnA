import java.util.Scanner;

public class clockwiseArray {
   public static void main(String[] args) {
    int arr[][] = new int[3][3];
    Scanner obj = new Scanner(System.in);
    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            System.out.print("Enter A Number : ");
            arr[i][j] = obj.nextInt();
        }
    }
    System.out.println("Your Entered Matrix ::: ");
    for(int i = 0; i<3; i++){
        for(int j = 0; j<3; j++){
            
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
    }

    
   } 
}
