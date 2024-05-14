public class String8 {
    public static void main(String[] args) {
        String s1  = "Rajasthan";
        System.out.println(s1.lastIndexOf("a"));//7
        System.out.println(s1.lastIndexOf("k"));//1
        System.out.println(s1.lastIndexOf("a", 5));//3
        System.out.println(s1.lastIndexOf("a" , 3));//3
        System.out.println(s1.lastIndexOf("a" , 2));//1
    }
}
