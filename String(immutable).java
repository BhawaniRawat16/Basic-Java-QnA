// String -(Immutable)

class Immutable {
    public static void main(String[] args) {
        String s1 = "Hello";//let s1 is pointing at memory location 1000
        System.out.println(s1);

        s1 = "Rajasthan"; //now s1 is pointing to a different memory location say 2000
        System.out.println(s1);
    }
}