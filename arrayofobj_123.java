import java.util.Scanner;
class Employee12
{
    int empCode;
    String empName;
    int empSalary;
    Scanner s = new Scanner(System.in);
    void setA()
    {
        System.out.print("Enter employee code : ");
        empCode = s.nextInt();
        System.out.print("Enter employee name: ");
        empName = s.next();
        System.out.print("Enter employee salary: ");
        empSalary = s.nextInt();
    }
    void showA()
    {
        System.out.println("Code = " + empCode);
        System.out.println("Name = " + empName);
        System.out.println("Salary = " + empSalary);
    }
    Employee12 employeeWithLargestSalary(Employee12[] emp){
        Employee12 l = emp[0];
        for(int i=0;i<emp.length;i++){
            if (emp[i].empSalary == 1) {
                l.empSalary = emp[i].empSalary ;            
            }
            if (emp[i].empSalary > l.empSalary) {
                l.empSalary = emp[i].empSalary ;            
            }
        }
        return l;
    }
}
class arrayobj_123   
{
    public static void main(String ddd[])
    {
        Employee12 obj[] = new Employee12[2];
             Employee12 obj1 = new Employee12();
        for(int i=0; i<obj.length; i++)
        {
            obj[i] = new Employee12();
            obj[i].setA();
        }
        for(int i=0; i<obj.length; i++)
        {
            obj[i].showA();
        }
      obj1 = obj1.employeeWithLargestSalary(obj);
        System.out.println("Employee with the largest salary:");
        obj1.showA();
    }    
}