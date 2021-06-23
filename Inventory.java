import java.util.ArrayList;

public class Inventory {
    public ArrayList<Item> items = new ArrayList<>();
    public ArrayList<Order> orders = new ArrayList<>();

    public Inventory() {

    }

    public void addToInventory(Item items) {

        this.items.add(items);
    }

    public String getInventory() {

        return items.toString();
    }

    public void addOrders(Order orders) {

        this.orders.add(orders);
    }

    public String getOrders() {

        return orders.toString();
    }
    @Override
    public String toString() {
        return items.toString();
    }
}
