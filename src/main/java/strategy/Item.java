package strategy;

public class Item {

    private String upcCode;
    private int price;

    public Item(String upcCode, int cost) {
        this.upcCode = upcCode;
        this.price = cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }
}
