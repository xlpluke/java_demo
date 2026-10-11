package Pay;

interface Priceable {
    double getPrice();
    default void printInfo(){
        System.out.println("商品原价："+getPrice());
    }
}
