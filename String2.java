//String - length() , equals() , equalsIgnoreCase();

public class String2 {
    public static void main(String[] args) {
        String s1 = "Mohan";
        String s2 = "mohan";
        String s3 = "Mohan";

        System.out.println(s1.length());
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));

    }
}
