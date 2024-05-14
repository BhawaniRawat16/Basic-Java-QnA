// String Buffer (mutable)

public class StringBuffer1 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("Hello");
        System.out.println(str.length());// 5
        System.out.println(str.capacity());// 21

        StringBuffer str1 = new StringBuffer();
        System.out.println(str1.capacity());// 16
        str1.append("Ajmer");
        System.out.println(str1.length());// 5
        System.out.println(str1.capacity());// 16

        StringBuffer str3 = new StringBuffer(5);
        str3.append("Sonu");
        System.out.println(str3.length());// 4
        System.out.println(str3.capacity());// 5

        str3.append(" Rawat");
        System.out.println(str3.length());// 10
        System.out.println(str3.capacity());// 12{( capacity*2) + 2}

        str3.append(", Ajmer");
        System.out.println(str3.length());// 17
        System.out.println(str3.capacity());// 26{( capacity*2) + 2}

    }
}
