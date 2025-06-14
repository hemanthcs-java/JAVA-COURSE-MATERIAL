public class EmployeeTracker {
    int empId;
    String name;
    double salary;
    static int totalEmployees = 0;
    static double totalExpense = 0;

    EmployeeTracker(int id, String n, double sal) {
        empId = id;
        name = n;
        salary = sal;
        totalEmployees++;
        totalExpense += sal;
    }

    public static void main(String[] args) {
        new EmployeeTracker(1, "Sam", 40000);
        new EmployeeTracker(2, "Lily", 50000);

        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total Salary Expense: " + totalExpense);
    }
}
