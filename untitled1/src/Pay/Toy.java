package Pay;

class Toy implements Priceable {
    private String name;
    private double price;

    public Toy(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}