abstract class Item {
    public String name;
    public double price;
    public int quantity;


    public Item() {
    }

    public Item(String name, int qty, double Prc) {
        this.name = name;
        this.quantity = qty;
        this.price = Prc;
    }
    public String Info() {
        return " Name: " + this.name + ", Price: " + this.price + ", Quantity: ";
    }


    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double prc) {
        this.price = prc;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Type: "+ getType() + " Name: " + name + " Quantity: " + quantity + " Price:" + price+"\n";
    }

    public abstract String getType();
}
