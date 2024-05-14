class Fruit{
    String fruitName;
    String fruitColour;

}



public class objectsyntax {
    public static void main(String[] args) {
      Fruit ob1 = new Fruit();
      ob1.fruitName = "Mango";
      ob1.fruitColour = "Yellow";  

      Fruit ob2 = new Fruit();
      ob2.fruitName = "Mango";
      ob2.fruitColour = "Green"; 

      
      System.out.println(ob1.fruitName+ " "+ob1.fruitColour);
      System.out.println(ob2.fruitName+ " "+ob2.fruitColour);
    }
}
