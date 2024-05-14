// Stirng - compareTo();

public class String4 {
    public static void main(String[] args) {
        String s1 = "Bhawi";
        String s2 = "bhawi";
        String s3 = "Bhawi";
        String s4 = "Bhawi Lal";
     
       
        System.out.println(s1.compareTo(s3));   //0
        System.out.println(s1.compareTo(s2));   //-32
        System.out.println(s2.compareTo(s3));   //32
        System.out.println(s1.compareTo(s4));   //-4
        System.out.println(s4.compareTo(s1));   //4

        
    }
}
