class Employee{
    int empCode;
    String empName;
    int empBasicSalary;

    Employee(){
        empCode = 101;
        empName = "Harshu";
        empBasicSalary = 2000000;
    }

    void showData(){
        System.out.println("Code = "+empCode);
        System.out.println("Name = "+empName);
        System.out.println("salary = "+empBasicSalary);
    }
}


public class defaultconstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.showData();
    }
}
