public class Assignment11 {

    public static void main(String[] args) {

        double basicSalary = 85000;

        double ta = 15;
        double da = 20;
        double hra = 18;
        double pf = 20;
        double tax = 25;

        // Calculate additions
        double taAmount = basicSalary * ta / 100;
        double daAmount = basicSalary * da / 100;
        double hraAmount = basicSalary * hra / 100;

        // Calculate deductions
        double pfAmount = basicSalary * pf / 100;
        double taxAmount = basicSalary * tax / 100;

        // Calculate gross and net salary
        double grossSalary = basicSalary + taAmount + daAmount + hraAmount;
        double netSalary = grossSalary - (pfAmount + taxAmount);

        // Display output
        System.out.println("as-11: Gross Salary = ₹" + grossSalary);
        System.out.println("as-11: Net Salary = ₹" + netSalary);
    }
}
