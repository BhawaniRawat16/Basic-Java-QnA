class Item {
    int item_Id;
    String item_Name;
    float item_cost;
    float item_SellingPrice;
    float item_Gst;
    float item_TotalPrice;

    void setData(int ii, String in, float ic, float isp, float ig) {
        item_Id = ii;
        item_Name = in;
        item_cost = ic;
        item_SellingPrice = isp;
        item_Gst = ig;
        item_TotalPrice = item_SellingPrice * (item_Gst / 100) + item_SellingPrice;
    }

    void showData() {
        System.out.println("Item Code = " + item_Id + "Item Name = " + item_Name + "Item Pusrchase Cost = " + item_cost
                + "\t Item Selling Price = " + item_SellingPrice + "\t Totalinclude gst = " + item_Gst
                + "% \t Total Price = " + item_TotalPrice);
    }

    void setItemId(int id) {
        item_Id = id;
    }

    int getItemId() {
        return item_Id;
    }

    void setItemName(String name) {
        item_Name = name;
    }

    String getItemName() {
        return item_Name;
    }

    void setItemCost(float cost) {
        item_cost = cost;
    }

    float getItemCost() {
        return item_cost;
    }

    void setItemSellingPrice(float price) {
        item_SellingPrice = price;
    }

    float getItemSellingPrice() {
        return item_SellingPrice;
    }

    void setItemGst(float gst) {
        item_Gst = gst;
    }

    float getItemGst() {
        return item_Gst;
    }

    float getItemTotalPrice() {
        item_TotalPrice = item_SellingPrice * (item_Gst / 100) + item_SellingPrice;
        return item_TotalPrice;
    }

}

public class itemassign {
    public static void main(String[] args) {
        Item obj = new Item();
        obj.setData(101, "Fan", 2500.0f, 3000.0f, 18.0f);
        obj.showData();

        obj.setItemId(101);
        obj.setItemName("Cooler");
        obj.setItemCost(3500.0f);
        obj.setItemSellingPrice(4000.0f);
        obj.setItemGst(18.0f);

        System.out.println("Item Code = " + obj.getItemId() + "\t Item Name = " + obj.getItemName()
                + "\t Item Pusrchase Cost = " + obj.getItemCost() + "\t Item Selling Price = "
                + obj.getItemSellingPrice() + "\t Total(include gst) = " + obj.getItemGst() + "% \t Totl Price = "
                + obj.getItemTotalPrice());

    }
}
