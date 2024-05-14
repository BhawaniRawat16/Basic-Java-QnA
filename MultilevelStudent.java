import java.util.Scanner;
class Students{
    int stu_RollNo;
    String stu_Name;
    String stu_Cls;
    Scanner obj = new Scanner(System.in);
    void getInfo(){
        System.out.print("Enter Your Roll No. : ");
        stu_RollNo = obj.nextInt();
        System.out.print("Enter Your Name : ");
        stu_Name = obj.next();
        System.out.print("Enter Your Class : ");
        stu_Cls = obj.next();
    }

}

class Marks extends Students{
    int hindi , english , maths , sst , science , sansk , outOfMarks;

    void getMarks(){
        System.out.print("Enter Your Hindi Marks : ");
        hindi = obj.nextInt();
        System.out.print("Enter Your English Marks : ");
        english = obj.nextInt();
        System.out.print("Enter Your Maths Marks : ");
        maths = obj.nextInt();
        System.out.print("Enter Your SST Marks : ");
        sst = obj.nextInt();
        System.out.print("Enter Your Science Marks : ");
        science = obj.nextInt();
        System.out.print("Enter Your Sanskrit Marks : ");
        sansk = obj.nextInt();
        System.out.print("Enter Your Total Marks : ");
        outOfMarks = obj.nextInt();
    }
}

class Result extends Marks{
    double totalMarks , percentageOfMarks;

    void calculateResult(){
        totalMarks  = hindi+english+maths+sst+sansk+science;
        percentageOfMarks = (totalMarks/(outOfMarks*6))*100;
    }

    void showInfo(){
        System.out.println("Roll No. = "+stu_RollNo);
        System.out.println("Name = "+stu_Name);
        System.out.println("Class = "+stu_Cls);
    }

    void showMarks(){
        System.out.println("Marks of hindi : "+hindi);
        System.out.println("Marks of english : "+english);
        System.out.println("Marks of maths : "+maths);
        System.out.println("Marks of sst : "+sst);
        System.out.println("Marks of science : "+science);
        System.out.println("Marks of sanskrit : "+sansk);
    }

    void showResult(){
        System.out.println("Total Marks Is : "+totalMarks);
        System.out.println("Your Percentage : "+percentageOfMarks);
    }
}
public class MultilevelStudent {
    public static void main(String[] args) {
        Result ob = new Result();
        ob.getInfo();
        ob.getMarks();
        ob.calculateResult();
        ob.showInfo();
        ob.showMarks();
        ob.showResult();
    }
}
