class Item{
    int item_Code;
    String item_Name;
    int item_SellingPrice;
    int item_Cost;
    int item_Gst;

    Item(){
        item_Code = 101;
        item_Name = "Cooler";
        item_SellingPrice = 3500;
        item_Cost = 4000;
        item_Gst = 18;
    }

    Item(int code , String name , int sp , int c , int gst){
        item_Code = code;
        item_Name = name;
        item_SellingPrice = sp;
        item_Cost = c;
        item_Gst = gst;
    }
}

public class itemConstructor {
    public static void main(String[] args) {
        Item I1 = new Item();
        System.out.println("Code = "+I1.item_Code+"\t Name = "+I1.item_Name+"\t Subject = "+I1.item_SellingPrice+"\t Contact = "+I1.item_Cost+"\t Salary = "+I1.item_Gst+"%");
        Item I2 = new Item(102, "Fan", 2500, 3000, 18);
        System.out.println("Code = "+I2.item_Code+"\t Name = "+I2.item_Name+"\t Subject = "+I2.item_SellingPrice+"\t Contact = "+I2.item_Cost+"\t Salary = "+I2.item_Gst+"%");

    }
}
