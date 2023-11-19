package encapsulation;

class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }
}

public class BankAccountExample {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("123456", 1000.0);

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance: $" + myAccount.getBalance());

        // Performing transactions
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
    }
}
