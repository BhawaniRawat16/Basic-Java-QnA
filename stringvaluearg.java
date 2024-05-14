public class stringvaluearg {
    

        static void tmp(String ...x){
            for(String i : x){
                System.out.println("Hello "+i);
            }
    
            
        }
    
        public static void main(String[] args) {
    
            tmp("Salman" , "Shahrukh" , "Amitabh");
            System.out.println("Actoress---------------------------");
            tmp("Shruti" , "Shradha" , "Rashmika", "Kriti", "Tara");      
        }   
    
}
