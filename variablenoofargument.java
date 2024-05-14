public class variablenoofargument {

    static void tmp(int ...x){
        for(int i : x){
            System.out.print(i+" ");
        }

        System.out.print("--------------");
    }

    public static void main(String[] args) {

        tmp(3 , 4 , 5);
        tmp(2 ,4 ,5, 6, 7, 8, 9);
        
    }
}
