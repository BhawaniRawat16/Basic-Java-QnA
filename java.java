import java.util.Scanner;

/**
 * java
 */
public class java {

  public static void main(String[] args) {
    int ar[][] , size1 , size2 , count =0 , countt = 0;
    Scanner ob = new Scanner(System.in);
    System.out.print("Enter The Size Of 2D Array : ");
    size1 = ob.nextInt();
    System.out.print("Enter The Size Of 2D Array : ");
    size2 = ob.nextInt();

    ar = new int[size1][size2];

    for(int i =0; i<ar.length; i++){
      for(int k = 0; k<ar[i].length; k++){
        System.out.print("Enter A Element : ");
        ar[i][k] = ob.nextInt();
      }
    }

    for(int i =0; i<ar.length; i++){
      for(int k = 0; k<ar[i].length; k++){
        if(ar[i][k]%2 == 0){
          count++;
        }
        else{
          countt++;
        }
      }
    }
   
  System.out.println("The Number Of Even Value Are : "+count);
  System.out.println("The Number Of Even Value Are : "+countt);
  }
}

