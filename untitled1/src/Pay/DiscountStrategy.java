package Pay;

@FunctionalInterface
interface DiscountStrategy {
    double apply(double originalPrice);
}