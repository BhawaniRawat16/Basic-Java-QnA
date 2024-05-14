// import java.util.Scanner;

// public class MatrixSumOFouter {
//     public static void main(String[] args) {
//         int ar[][] = new int[4][4];

//         Scanner ob = new Scanner(System.in);

//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print("Enter A Number : ");
//                 ar[i][j] = ob.nextInt();
//             }
//         }

//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 System.out.print(ar[i][j]);
//             }
//             System.out.println();
//         }

//         int sum = 0;

//         for (int i = 0; i < 4; i++) {
//             for (int j = 0; j < 4; j++) {
//                 if (i == j && (i != 0 && j != 3)) {
                   
//                         continue;
                    
//                 } else {
//                     sum += ar[i][j];
//                 }
//             }
//         }

//         System.out.println("The Sum Is : " + sum);
//     }
// }
/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class MatrixSumOFouter
{
	public static void main(String[] args) {
		int arr[][] = new int[4][4] , sum=0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter The Element Of An Matrix : ");
		for(int i = 0; i<4; i++){
		    for(int j=0; j<4; j++){
		        arr[i][j] = ob.nextInt();
		        
		    }
		}
		System.out.println("The Sum Of outer Element Of The Matrix : ");
		for(int i = 0; i<4; i++){
		    for(int j=0; j<4; j++){
		        
		        if(j==3-i&&(i!=0||i!=3)){
                    sum+=arr[i][j];
		        }
		        else{
		           continue; 
		            
		        }
		    }
		}
		System.out.print(sum+" ");
		
	}
}
