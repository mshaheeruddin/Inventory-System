import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    public String customerName;
    public double orderTotal;
    public double quantity;
    public ArrayList<Item> orderItems = new ArrayList();
    public ArrayList ItemsQuantity = new ArrayList();


    public Order() {
    }

    public void addItem(Item item, int qty) {
        if (item.quantity >= qty) {
            orderItems.add(item);
            item.setQuantity(item.quantity-qty);
            this.ItemsQuantity.add(qty);
            this.orderTotal = this.orderTotal + item.price * qty;
            return;
        } else {
            System.out.println("Please enter valid quantity: ");
        }
        Scanner sc = new Scanner(System.in);
        addItem(item, sc.nextInt());
    }

    public void removeItem(Item i) {
        orderItems.remove(i);
    }


    @Override
    public String toString() {
        for (int i = 0; i < this.orderItems.size(); i++) {
            System.out.println("Order Total: "+ this.orderTotal);
            System.out.println(this.orderItems.get(i).Info() + this.ItemsQuantity.get(i));
        }System.out.println(" -------------------------------------------");
        return "";
    }
}