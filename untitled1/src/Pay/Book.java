package Pay;

class Book implements Priceable {
    private String title;
    private double price;

    public Book(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void printInfo() {
        System.out.println("《" + title + "》原价：" + price + "元");
    }
}