package strategy;

public class StrategyTest {

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234",10);
        Item item2 = new Item("5678",40);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.pay(new PaypalStrategy("example@example.com", "pass"));
        cart.pay(new CreditCardStrategy("User name", "1234567890123456", "999", "12/31"));
    }
}
