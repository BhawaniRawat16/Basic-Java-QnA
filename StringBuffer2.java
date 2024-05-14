
public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str);// hello
        str.insert(2, "ABC");
        System.out.println(str); // heABCllo

        String st = "HARSHITA";
        StringBuffer str2 = new StringBuffer(st);
        str2.reverse();
        System.out.println(str2);

        StringBuffer str3 = new StringBuffer("Suresh");
        str3.deleteCharAt(1);
        System.out.print(str3);

    }
}