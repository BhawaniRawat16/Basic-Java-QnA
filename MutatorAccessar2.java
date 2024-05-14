class TeacherManagement{
    String firstName;
    String lastName;
    String gender;
    int mobileNumber;
    String specialistSubject;
    int salary;

    void setData(String fn , String ln , String mf , int mn , String sub , int slr){
        firstName = fn;
        lastName = ln;
        gender = mf;
        mobileNumber = mn;
        specialistSubject = sub;
        salary = slr;
    }

    void getData(){
        System.out.println("Full Name : Mr. "+firstName+" "+lastName+"\t Gender = "+gender+ "\t Mobile No. = "+mobileNumber+"\t Specialist = "+specialistSubject+"\t Salary = "+salary);
    }

    void setFirstName(String fname){
        firstName = fname;
    }

    void setLastName(String lname){
        lastName = lname;
    }

    String getFullName(){
        if(gender == "male"){
        return ("Mr. "+firstName+" "+lastName);
        }
        else{
            return ("Miss "+firstName+" "+lastName);
        }
    }

    void setGender(String mf){
        gender = mf;
    }

    String getGender(){
        return gender;
    }

    void setMobileNumber(int mn){
        mobileNumber = mn;
    }

    int getMobileNumber(){
        return mobileNumber;
    }

    void setSpecialistSubject(String sub){
        specialistSubject = sub;
    }

    String getSpecialistSubject(){
        return specialistSubject;
    }

    void setSalary(int slr){
        salary = slr;
    }

    int getSalary(){
        return salary;
    }

}

public class MutatorAccessar2 {
   public static void main(String[] args) {
    TeacherManagement obj = new TeacherManagement();
    obj.setData("Bhawani Singh", "Rawat", "male", 7426, "Maths", 50000);
    obj.getData();

    obj.setFirstName("Chaman");
    obj.setLastName("Rawat");
    obj.setGender("male");
    obj.setMobileNumber(7516);
    obj.setSalary(15000);
    obj.setSpecialistSubject("Java");
    obj.setFirstName("chaman");
    obj.setLastName("Rawat");
    obj.setGender("male");
    // System.out.println();

    System.out.println("Full Name : "+obj.getFullName()+"\t Gender = "+obj.getGender()+ "\t Mobile No. = "+obj.getMobileNumber()+"\t Specialist = "+obj.getSpecialistSubject()+"\t Salary = "+obj.getSalary());
   } 
}
