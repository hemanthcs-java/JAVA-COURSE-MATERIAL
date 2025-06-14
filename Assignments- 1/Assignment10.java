public class Assignment10 {

    public static void main(String[] args) {
        double principal = 500000.0;
        int time = 5;
        double rate = 6.8;

        //  Calculate interest amount using formula (P * T * R) / 100
        double interestAmount = (principal * time * rate) / 100;

        //  Calculate final amount after adding interest
        double finalAmount = principal + interestAmount;

        // Display all values
        System.out.println("Simple Interest Calculation for Mr. Sarath:");
        System.out.println("Principal Amount: ₹" + principal);
        System.out.println("Time Period: " + time + " years");
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Interest Earned: ₹" + interestAmount);
        System.out.println("Final Amount After Interest: ₹" + finalAmount);
    }
}
