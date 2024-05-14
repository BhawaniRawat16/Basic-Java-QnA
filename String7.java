import java.util.Scanner;
public class String7 {
    public static void main(String[] args) {
        String word ;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enetr Any Word : ");
        word  = ob.nextLine();

        for(int i = 1; i<=word.length(); i++){
            System.out.print(word.charAt(i));
        }
    }
}
