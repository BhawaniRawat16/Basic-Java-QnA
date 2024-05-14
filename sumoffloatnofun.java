public class sumoffloatnofun {

    static float Sum(float ...x){
        float sum = 0.0f;
        for(float i : x){
            sum += i;
        }

        // System.out.println("Sum = "+sum);
        return sum;

    }
    public static void main(String[] args) {

        
        float j = Sum(1.5f , 3.8f);
        System.out.println("Sum = "+j);
        float k = Sum(4.9f , 5.7f , 6.8f , 8.0f);
        System.out.println("Sum = "+k);
        float total = j+k;
        System.out.println("Sum = "+total);
    }
}
