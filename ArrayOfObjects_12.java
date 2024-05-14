import java.util.Scanner;
class Employee_12{
    Scanner ob = new Scanner(System.in);
    int emp_Code;
    String emp_Name;
    int emp_Salary;

    void set(){
            System.out.print("Enter Code : ");
            int a= ob.nextInt();
            System.out.print("Enter Name : ");
            String b = ob.next();
            System.out.print("Enter Salary : ");
            int c = ob.nextInt();

            emp_Code = a;
            emp_Name = b;
            emp_Salary = c;
    }

    void show()
    {
        System.out.println("Code : "+emp_Code+" Name : "+emp_Name+" Salary : "+emp_Salary);
    }
}

public class ArrayOfObjects_12 {
    public static void main(String[] args) {

        
        Employee_12 obj[] = new Employee_12[3];
        // Employee ob1 = new Employee();

        for(int i = 0; i<3; i++)
        {
              obj[i] = new Employee_12();
              obj[i].set();
        } 
        
        for(int i = 0; i<3; i++)
        {
            obj[i].show();
        }
    }
}