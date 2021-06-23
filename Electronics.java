public class Electronics extends Item {
    public Electronics(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Electronics";
    }
}
