// setxxxx (Mutator Methods) , getXXXX(Accesser Methods)

class Employee{
    int empCode;
    String empName;
    int empBasicSalary;

    void setData(int c , String nm , int s){
        c = empCode;
        nm = empName;
        s = empBasicSalary;
    }

    

    void setEmpCode(int x){
        empCode = x;
    }

    int getEmpCode(){
        return empCode;
    }

    void setEmpName(String y){
        empName = y;
    }

    String getEmpName(){
        return empName;
    }

    void setEmpBasicSalary(int y){
        empBasicSalary = y;
    }

    int getEmpBasicSalary(){
        return empBasicSalary;
    }
}



public class MutatorAccessar {
    public static void main(String[] args) {
        Employee obj = new Employee();

        obj.setData(01, "Bhawani", 50000);

        obj.setEmpCode(02);
        obj.setEmpName("Chaman rawat");
        obj.setEmpBasicSalary(15000);

        System.out.println("Code = "+obj.getEmpCode());
        System.out.println("Name = "+obj.getEmpName());
        System.out.println("Basic Salary = "+obj.getEmpBasicSalary());
    }
}
