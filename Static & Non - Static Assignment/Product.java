public class Product {
    int id;
    String name;
    double price;

    void calculateDiscount(double discountPercent) {
        double discount = (price * discountPercent) / 100;
        double finalPrice = price - discount;
        System.out.println("Discounted Price: " + finalPrice);
    }

    public static void main(String[] args) {
        Product p = new Product();
        p.id = 1;
        p.name = "Laptop";
        p.price = 50000;
        p.calculateDiscount(10);
    }
}
