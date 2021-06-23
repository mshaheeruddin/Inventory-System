public class Cosmetics extends Item {
    public Cosmetics(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Cosmetics";
    }
}
