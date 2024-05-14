class Employee{
    int empCode;
    String emName;
    int empBasicSalary;

    Employee(){
        empCode = 101;
        emName = "Bhavi";
        empBasicSalary = 100;
        System.out.println("Default Constuter called");
    }
    Employee(int c, String n, int bs){
        empCode = c;
        emName = n;
        empBasicSalary = bs;
        System.out.println("Pramiterize Constuter Called");
    }

    void showData(){
        System.out.println("Code = "+empCode);
        System.out.println("Name = "+emName);
        System.out.println("salary = "+empBasicSalary);
    }
}
public class perameterizeconstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        Employee e2 = new Employee(102, "Harshu", 200000);
        e1.showData();
        e2.showData();
    }
}
