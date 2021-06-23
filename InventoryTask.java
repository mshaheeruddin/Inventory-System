import java.util.Scanner;

public class InventoryTask {

    public static void MainMenuDisplay() {
        System.out.println("-----------------------------");
        System.out.println("Welcome to Inventory System!");
        System.out.println("-----------------------------");
        System.out.println("Please make your selection.");
        System.out.println("1.Add Inventory" + "\n" + "2.Add Order" + "\n" + "3.Show Inventory" + "\n" + "4.Show Orders" + "\n" + "5.Show All Details" + "\n" + "6.Exit System");
    }

    public static void displayINV() {
        System.out.println("You can add Items from the following List" + "\n" + "1.Clothes" + "\n" + "2.Cosmetics" + "\n" + "3.Electronics");
    }

    public static void displayAddInv() {
        System.out.println("You can add to your cart from following items" + "\n" + "[");

    }
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        while (true) {
            MainMenuDisplay();
            Scanner in = new Scanner(System.in);
            int mm = in.nextInt();
            switch (mm) {
                case 1:
                    displayINV();
                    int aI = in.nextInt();
                    switch (aI) {
                        case 1:
                            System.out.println("---Clothes---");
                            System.out.print("Enter Name:");
                            String name = in.next();
                            in.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int qty = in.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double prc = in.nextDouble();
                            Item c = new Clothes(name, qty, prc);
                            inv.addToInventory(c);
                            break;
                        case 2:
                            System.out.println("---Cosmetics---");
                            System.out.print("Enter Name:");
                            String n = in.next();
                            in.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int q = in.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double p = in.nextDouble();
                            Item cc = new Cosmetics(n, q, p);
                            inv.addToInventory(cc);
                            break;
                        case 3:
                            System.out.println("---Electronics---");
                            System.out.print("Enter Name:");
                            String na = in.next();
                            in.hasNextLine();
                            System.out.print("Enter quantity: ");
                            int qt = in.nextInt();
                            System.out.print("Enter Price per Unit: ");
                            double pr = in.nextDouble();
                            Item E = new Electronics(na, qt, pr);
                            inv.addToInventory(E);
                            break;
                    }
break;
                case 2:
                    Order order = new Order();
                    System.out.println("You can choose the items from following list: ");
                    System.out.println(inv.items.toString());
                    boolean b = true;
                    while (b) {
                        in.nextLine();
                        System.out.println("Please enter name: ");
                        String s1 = in.nextLine();
                        boolean b1 = true;
                        for (int s = 0; s < inv.items.size(); s++) {
                            if (inv.items.get(s).name.equalsIgnoreCase(s1)) {
                                b1=false;
                                System.out.println("Please enter quantity: ");
                                order.addItem(inv.items.get(s), in.nextInt());
                                break;
                            }
                        }
                        if(b1)System.out.println("No item with such name found!");
                        System.out.println("Press 1 to add something else \nPress 2 to complete order");
                        if (in.nextInt() == 2) {
                            System.out.println("Order Added");
                            System.out.println(order.toString());
                            b = false;
                        }
                    }
                    inv.addOrders(order);

                    break;
                        case 3:
                    System.out.println(inv.getInventory());
                    break;
                        case 4:
                        System.out.println(inv.orders.toString());
                        break;
                        case 5:
                    System.out.println("-----INVENTORY----- \n");
                    System.out.println(inv.toString());
                    System.out.println("\n------ ORDERS ------- \n");
                    System.out.println(inv.orders.toString());
                    break;

                case 6:
                    System.out.println("Hope to see You again!" + "\n" + "BYE!");
                    System.exit(0);
            }
        }
    }

}

