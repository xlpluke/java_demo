package Pay;

public class ShopTest {
    public static void main(String[] args) {
        Priceable[] items = {
                new Book("Java编程思想", 89.0),
                new Toy("变形金刚模型", 45.0),
                new Book("算法导论", 120.0)
        };

        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("=== 购物车商品列表 ===");

        cart.printAllItems();

        System.out.println("\n=== 结算 ===");

        System.out.println("无折扣总价为:"+cart.calculateTotal(
                originalPrice -> originalPrice
        )+"元");

        System.out.println("九折总价为:"+cart.calculateTotal(
                originalPrice -> originalPrice*0.9
        )+"元");

        System.out.println("满减总价为:");
        double total=cart.calculateTotal(originalPrice -> originalPrice );
        if(total>=100){
            System.out.println((total - 20) + "元");
        } else {
            System.out.println(total + "元");
        }
    }
}