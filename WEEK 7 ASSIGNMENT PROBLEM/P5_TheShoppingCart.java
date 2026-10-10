class Cart {
    private final String id;
    private final double[] prices;
    private int itemCount;

    public Cart(String id, int maxSize) {
        this.id = id;
        this.prices = new double[maxSize];
        this.itemCount = 0;
    }

    public void addItem(double price) {
        if (itemCount < prices.length) {
            prices[itemCount] = price;
            itemCount++;
        }
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += prices[i];
        }
        return total;
    }

    public int getItemCount() {
        return itemCount;
    }

    public String getId() {
        return id;
    }
}

public class P5_TheShoppingCart {
    public static void main(String[] args) {
        Cart cart = new Cart("CART-5", 20);
        cart.addItem(250);
        cart.addItem(99);
        cart.addItem(151);
        System.out.println("Total: " + cart.getTotal());
        System.out.println("Count: " + cart.getItemCount());
    }
}
