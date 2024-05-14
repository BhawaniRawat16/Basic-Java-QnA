class Student{
    int student_RollNo;
    String student_Name;
    String student_Class;
    String student_Contact;
    ;

    Student(){
        student_RollNo = 101;
        student_Name = "Bhawani";
        student_Class = "b.tech 1st year";
        student_Contact = "7426966916";
    }

    Student(int roll , String name , String cls , String cont){
        student_RollNo = roll;
        student_Name = name;
        student_Class = cls;
        student_Contact = cont;
    }
}

public class studentConstructor {
    public static void main(String[] args) {
        Student t1 = new Student();
        System.out.println("Roll No. = "+t1.student_RollNo+"\t Name = "+t1.student_Name+"\t class = "+t1.student_Class+"\t Contact = "+t1.student_Contact);
        Student t2 = new Student(102, "Chaman", "BCA 2nd year", "6375169445");
        System.out.println("Roll No. = "+t2.student_RollNo+"\t Name = "+t2.student_Name+"\t class = "+t2.student_Class+"\t Contact = "+t2.student_Contact);

    }
}
