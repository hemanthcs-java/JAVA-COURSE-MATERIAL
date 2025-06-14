public class Assignment8 {

    public static void main(String[] args) {
        double pizzaPrice = 399.0;
        int quantity = 2;

        // Formula: Total = price × quantity
        double totalBeforeDiscount = pizzaPrice * quantity;

        // Define the discount percentage offered by Dominos
        double discountRate = 20.0;

        // Calculate discount amount
        // Formula: (Total × Discount %) / 100
        double discountAmount = (totalBeforeDiscount * discountRate) / 100;

        // Subtract discount from total to get final bill
        double finalBillAmount = totalBeforeDiscount - discountAmount;

        // Display the entire bill breakdown
        System.out.println("Dominos Billing Summary:");
        System.out.println("Cost of one pizza: ₹" + pizzaPrice);
        System.out.println("Quantity ordered: " + quantity);
        System.out.println("Total before discount: ₹" + totalBeforeDiscount);
        System.out.println("Discount @20%: ₹" + discountAmount);
        System.out.println("Final Bill Amount to Pay: ₹" + finalBillAmount);
    }
}
