public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        double newBalance = balance + amount;
        System.out.println("Updated Balance: " + newBalance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountNumber = 1001;
        acc.accountHolderName = "John Doe";
        acc.balance = 1500;
        acc.deposit(500);
    }
}
