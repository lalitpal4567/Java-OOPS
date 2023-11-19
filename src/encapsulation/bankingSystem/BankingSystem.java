package encapsulation.bankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating a customer
        Customer johnDoe = new Customer("John Doe");

        // Adding bank accounts
        johnDoe.addAccount(AccountType.SAVINGS, "SAV123", 1000.0);
        johnDoe.addAccount(AccountType.CHECKING, "CHK456", 500.0);

        // Displaying customer information
        johnDoe.displayCustomerInfo();

        // Performing transactions
        johnDoe.performTransaction(AccountType.SAVINGS, 200.0, false); // Withdrawal
        johnDoe.performTransaction(AccountType.CHECKING, 300.0, true);  // Deposit

        // Displaying updated customer information
        johnDoe.displayCustomerInfo();
    }
}
