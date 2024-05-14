import java.util.Scanner;

/**
 * harshapractice
 */
public class harshapractice {

  public static void main(String[] args) {
    String name;
    int rollNumber;
    float hindi, english, maths, science, socialScience, sancrit;

    Scanner ob = new Scanner(System.in);
    System.out.print("Enter Your Name : ");
    name = ob.nextLine();
    System.out.print("Enter Your Roll Number : ");
    rollNumber = ob.nextInt();
    System.out.print("Enter Your Hindi Marks : ");
    hindi = ob.nextFloat();
    System.out.print("Enter Your English Marks : ");
    english = ob.nextFloat();
    System.out.print("Enter Your Maths Marks : ");
    maths = ob.nextFloat();
    System.out.print("Enter Your Science Marks : ");
    science = ob.nextFloat();
    System.out.print("Enter Your Social Science Marks : ");
    socialScience = ob.nextFloat();
    System.out.print("Enter Your Sanscrit Marks : ");
    sancrit = ob.nextFloat();

    float totalMarks = hindi + english + maths + sancrit + science + socialScience;
    System.out.println("Total Number Is : " + totalMarks);

    float parsntage = (totalMarks / 600) * 100;
    System.out.println("Parsntage : " + parsntage);

    if (parsntage >= 80) {
      System.out.println("Grad A");
    } else if (parsntage >= 60 && parsntage < 80) {
      System.out.println("Grad B");
    } else if (parsntage >= 45 && parsntage < 36) {
      System.out.println("Grad C");
    }

    if (parsntage >= 60) {
      System.out.println("First Dision");
    } else if (parsntage >= 45 && parsntage < 60) {
      System.out.println("Second Dision");
    } else if (parsntage >= 36 && parsntage < 45) {
      System.out.println("Third Dision");
    }
  }
}