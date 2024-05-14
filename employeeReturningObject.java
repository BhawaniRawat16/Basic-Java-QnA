class Employee1{
    int emp_Code;
    String emp_Name;
    Employee1(){
        emp_Code = 0;
        emp_Name = null;
    }
    Employee1(int emp_Code, String emp_Name){
        this.emp_Code = emp_Code;
        this.emp_Name = emp_Name;
    }

    void show(){
        System.out.println("Code = " +emp_Code +"Name = "+ emp_Name );
    }

    Employee1 copy(Employee1 emp){
        Employee1 obj = new Employee1();
        obj.emp_Name = emp.emp_Name;
         obj.emp_Code = emp.emp_Code;
         return obj;

    }
}

public class employeeReturningObject {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        Employee1 e2 = new Employee1(101, "Harsha");
        Employee1 e3 = new Employee1();
        e1.show();
        e2.show();
        e3.show();
        e3 = e1.copy(e2);
        e1.show();
        e2.show();
        e3.show();
    }
}
