// String - startsWith and endsWith ............

public class String5 {
    public static void main(String[] args) {
        String  s1 = "Rajsthan";
        System.out.println(s1.startsWith("Raj"));  //true
        System.out.println(s1.startsWith("Rraj"));  //false
        System.out.println(s1.endsWith("Raj"));  //false
        System.out.println(s1.endsWith("sthan"));  //true
        System.out.println(s1.endsWith("Sthan"));  //false
    }
}
