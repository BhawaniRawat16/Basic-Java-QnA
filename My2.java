
class Fan1{
    String fanType;
    String companyName;
    int rpm;
}


public class My2 {
    public static void main(String[] args) {
        Fan1 ob = new Fan1();
    ob.fanType = "wall Fan";
    ob.companyName = "Indo";
    ob.rpm = 300;

    System.out.println(ob.fanType+" "+ob.companyName+" "+ob.rpm);
    }

    
}
