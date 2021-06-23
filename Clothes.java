class Clothes extends Item {
    public Clothes(String name, int qty, double Prc) {
        super(name, qty, Prc);
    }

    @Override
    public String getType() {
        return "Clothes";
    }
}