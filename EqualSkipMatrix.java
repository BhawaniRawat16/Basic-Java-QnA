import java.util.Scanner;

public class EqualSkipMatrix {
   public static void main(String[] args) {
      int arr[] = new int[9], sum = 0;
      int temp = 0;
      Scanner ob = new Scanner(System.in);

      int n = arr.length;

      for (int i = 0; i < n; i++) {

         System.out.print("Enter A Number : ");
         arr[i] = ob.nextInt();

      }

      for (int i = 0; i < 9; i++) {

         temp = arr[i];

         // for (int k = 0; k < n; k++) {

         int j = i + 1;
         while (j < n) {
            if (arr[i] == arr[j]) {
               break;
            }
            j++;
         }
         if (j == n) {
            sum += arr[i];
         }

         // }

      }
      // sum += arr[i][j];

      System.out.println("The Sum Is : " + sum);
   }
}
