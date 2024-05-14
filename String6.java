
public class String6 {
    public static void main(String[] args) {
        String s1 = "Rajsthan";
        System.out.println(s1.charAt(2)); // j

        System.out.println(s1.indexOf("j")); // 2
        System.out.println(s1.indexOf("aj")); // 1
        System.out.println(s1.indexOf("A")); // -1
        System.out.println(s1.indexOf("a")); // 1
        System.out.println(s1.indexOf("a" , 2)); // 3
        System.out.println(s1.indexOf("a" , 5)); // 7
        System.out.println(s1.indexOf("a" , 1)); // 1

    }
}
