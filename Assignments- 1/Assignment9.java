public class Assignment9 {

    public static void main(String[] args) {
        double salary = 85000.0;
        double taxRate = 20.0;

        // Calculate the tax amount
        // Formula: (Salary × Tax Rate) / 100
        double taxAmount = (salary * taxRate) / 100;

        //Calculate the in-hand salary after tax
        double inHandSalary = salary - taxAmount;

        //Display the tax and final take-home salary
        System.out.println("Income Tax Calculation for Mr. Vikram:");
        System.out.println("Gross Salary: ₹" + salary);
        System.out.println("Tax Deducted @20%: ₹" + taxAmount);
        System.out.println("Take-Home Salary After Tax: ₹" + inHandSalary);
    }
}
