package Pay;

class ShoppingCart {
    private Priceable[] items;

    public ShoppingCart(Priceable[] items) {
        this.items = items;
    }

    public double calculateTotal(DiscountStrategy strategy) {
        double total = 0;
        for(Priceable item : items){
            total += strategy.apply(item.getPrice());
        }
        return total;
    }

    public void printAllItems() {
        for(Priceable item : items){
            item.printInfo();
        }
    }
}