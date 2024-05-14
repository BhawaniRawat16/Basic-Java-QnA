public class String10 {
    public static void main(String[] args) {
        String s1 = "Rajasthan";

        System.out.println(s1.toUpperCase()); // Rajasthan
        System.out.println(s1.toLowerCase());//  rajasthan

        String s2 = "bhawi";
        String s3 = "            Singh          ";
        String s4 = "Rawat";

         System.out.println(s2 + s3 + s4);//  Bhawi         Singh     Rawat
          System.out.println(s2 + s3.trim()+ s4);//  Bhawi Singh Rawat
           System.out.println(s2.trim() + s3.trim() + s4.trim());//  bhawiShingRawat
    }
}
