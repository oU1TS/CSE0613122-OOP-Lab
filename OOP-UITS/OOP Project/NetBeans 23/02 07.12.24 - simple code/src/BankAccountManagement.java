import java.util.Scanner;

// Base class representing a generic bank account
class Account {
    String customerName;   // Name of the account holder
    long accountNumber;    // Unique identifier for the account
    String accountType;    // Type of account (Savings/Current)
    double balance;        // Current balance in the account

    // Method to initialize account details
    void initialize(String name, long accNo, String type, double initialBalance) {
        this.customerName = name;
        this.accountNumber = accNo;
        this.accountType = type;
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    void deposit(double amount) throws IllegalArgumentException {
        if (amount <= 0) { 
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
        balance += amount; // Update the balance
        System.out.println("Deposit successful! New balance: " + balance);
    }

    // Method to display the current balance
    void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    // Method to withdraw money from the account
    void withdraw(double amount) throws IllegalArgumentException, IllegalStateException {
        if (amount <= 0) { 
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) { 
            throw new IllegalStateException("Insufficient balance for withdrawal.");
        }
        balance -= amount; // Deduct the amount from balance
        System.out.println("Withdrawal successful! New balance: " + balance);
    }
}

// Subclass representing a savings account
class SavAcct extends Account {
    final double interestRate = 0.04; // Annual interest rate (4%)

    // Method to compute and deposit interest
    void computeAndDepositInterest() {
        double interest = balance * interestRate; // Calculate interest
        balance += interest; // Add interest to balance
        System.out.println("Interest computed and deposited! New balance: " + balance);
    }
}

// Subclass representing a current account
class CurrAcct extends Account {
    final double minimumBalance = 500; // Minimum balance requirement
    final double penalty = 50;        // Penalty for falling below minimum balance

    // Method to check and enforce the minimum balance requirement
    void checkMinimumBalance() {
        if (balance < minimumBalance) { 
            balance -= penalty; // Deduct penalty if balance is below minimum
            System.out.println("Balance below minimum! Penalty of " + penalty + " imposed. New balance: " + balance);
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }
}

// Main class to manage the bank account system
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Input scanner
        SavAcct savingsAccount = new SavAcct();
        CurrAcct currentAccount = new CurrAcct();

        try {
            // Prompt user to enter account details
            System.out.println("Enter account type (Savings/Current): ");
            String accountType = scanner.next();
            
            System.out.println("Enter customer name: ");
            String name = scanner.next();
            
            System.out.println("Enter account number: ");
            long accountNumber = scanner.nextLong();
            
            System.out.println("Enter initial balance: ");
            double initialBalance = scanner.nextDouble();
            
            // Handle account type and initialize appropriate object
            switch (accountType.toLowerCase()) {
                case "savings": {
                    savingsAccount.initialize(name, accountNumber, accountType, initialBalance);
                    manageSavingsAccount(scanner, savingsAccount); // Manage savings account operations
                    break;
                }
                case "current": {
                    currentAccount.initialize(name, accountNumber, accountType, initialBalance);
                    manageCurrentAccount(scanner, currentAccount); // Manage current account operations
                    break;
                }
                default: {
                    System.out.println("Invalid account type!"); // Handle invalid input
                    break;
                }
            }
        } catch (Exception e) {
            // Handle any unexpected errors
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner to free resources
        }
    }

    // Method to manage savings account operations
    static void manageSavingsAccount(Scanner scanner, SavAcct account) {
        boolean exit = false; // Flag to exit the menu
        while (!exit) {
            try {
                // Display menu options
                System.out.println("\n1. Deposit\n2. Display Balance\n3. Compute Interest\n4. Withdraw\n5. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                
                // Handle menu options
                switch (choice) {
                    case 1: {
                        System.out.println("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                        break;
                    }
                    case 2: {
                        account.displayBalance();
                        break;
                    }
                    case 3: {
                        account.computeAndDepositInterest();
                        break;
                    }
                    case 4: {
                        System.out.println("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                        break;
                    }
                    case 5: {
                        exit = true; // Exit the menu
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice!");
                    }
                }
            } catch (Exception e) {
                // Handle any menu-specific errors
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    // Method to manage current account operations
    static void manageCurrentAccount(Scanner scanner, CurrAcct account) {
        boolean exit = false; // Flag to exit the menu
        while (!exit) {
            try {
                // Display menu options
                System.out.println("\n1. Deposit\n2. Display Balance\n3. Check Minimum Balance\n4. Withdraw\n5. Exit");
                System.out.println("Enter your choice: ");
                int choice = scanner.nextInt();
                
                // Handle menu options
                switch (choice) {
                    case 1: {
                        System.out.println("Enter amount to deposit: ");
                        double amount = scanner.nextDouble();
                        account.deposit(amount);
                        break;
                    }
                    case 2: {
                        account.displayBalance();
                        break;
                    }
                    case 3: {
                        account.checkMinimumBalance();
                        break;
                    }
                    case 4: {
                        System.out.println("Enter amount to withdraw: ");
                        double amount = scanner.nextDouble();
                        account.withdraw(amount);
                        break;
                    }
                    case 5: {
                        exit = true; // Exit the menu
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice!");
                    }
                }
            } catch (Exception e) {
                // Handle any menu-specific errors
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}