class Students{
    int rollNumber;
    String studentName;
    String studentClass;
    long studentMobNumber;

    void setData(int rn , String sn , String sc , long smn){
        rollNumber = rn;
        studentName = sn;
        studentClass = sc;
        studentMobNumber = smn;
    }

    void showData(){
        System.out.println("Student Name : "+studentName+"\t Class : "+studentClass+"\t Roll No. : "+rollNumber+"\t Mobile No. : "+studentMobNumber);
    }

    void setRollNumber(int rollNo) {
        rollNumber = rollNo;
    }
    int getRollNumber() {
        return rollNumber;
    }

    void setStudentName(String name){
        studentName = name;
    }

    String getStudentName(){
        return studentName;
    }

    void setStudentClass(String cls){
        studentClass = cls;
    }

    String getStudentClass(){
        return studentClass;
    }

    void setMobileNumber(long mobno){
        studentMobNumber = mobno;
    }

    long getMobileNumber(){
        return  studentMobNumber;
    }
}


/**
 * studentsclass
 */
public class studentsclass {

    public static void main(String[] args) {
        Students obj = new Students();
        obj.setData(01, "Bhawani Singh", "B.tech 1st Year", 966916);
        obj.showData();

        obj.setRollNumber(02);
        obj.setStudentName("Chaman Rawat");
        obj.setStudentClass("BCA 1st Year");
        obj.setMobileNumber(742696);


        System.out.println("Student Name : "+obj.getStudentName()+"\t Class : "+obj.getStudentClass()+"\t Roll No. : "+obj.getRollNumber()+"\t Mobile No. : "+obj.getMobileNumber());



    }
}