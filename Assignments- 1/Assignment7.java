public class Assignment7 {

    public static void main(String[] args) {
        double basePrice = 699.0;
        double gstRate = 18.0;

        // Formula: (Base Price × GST Rate) / 100
        double gstAmount = (basePrice * gstRate) / 100;

        // Step 4: Add GST to base price to get the final cost
        double finalPrice = basePrice + gstAmount;

        // Step 5: Print the breakdown of the calculation
        System.out.println("JioFiber Silver Plan Calculation:");

        // Show the original base price before tax
        System.out.println("Base Price: ₹" + basePrice);

        // Show the GST amount added
        System.out.println("GST @18%: ₹" + gstAmount);

        // Show the final price after adding GST
        System.out.println("Final Price (Including GST): ₹" + finalPrice);
    }
}
