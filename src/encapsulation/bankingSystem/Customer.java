package encapsulation.bankingSystem;

import java.util.HashMap;
import java.util.Map;

public class Customer {
    private String name;
    private Map<AccountType, BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(AccountType accountType, String accountNumber, double initialBalance) {
        if (!accounts.containsKey(accountType)) {
            BankAccount newAccount = new BankAccount(accountNumber, initialBalance);
            accounts.put(accountType, newAccount);
            System.out.println("New " + accountType + " account added successfully.");
        } else {
            System.out.println("Customer already has a " + accountType + " account.");
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer: " + name);
        for (Map.Entry<AccountType, BankAccount> entry : accounts.entrySet()) {
            System.out.println(entry.getKey() + " Account - Number: " + entry.getValue().getAccountNumber()
                    + ", Balance: $" + entry.getValue().getBalance());
        }
    }

    public void performTransaction(AccountType accountType, double amount, boolean isDeposit) {
        BankAccount account = accounts.get(accountType);
        if (account != null) {
            if (isDeposit) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        } else {
            System.out.println("Customer does not have a " + accountType + " account.");
        }
    }
}
