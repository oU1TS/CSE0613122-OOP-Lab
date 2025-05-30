import java.util.*;

interface Authenticatable {
    boolean authenticate(String password);
}

abstract class Account {
    String name, accType;
    int accNum, accBalance;
    private static final Set<Integer> usedAccountNumbers = new HashSet<>();

    // Constructor to initialize account details
    void initialize(String name, String accType, int accBalance) {
        this.name = name;
        this.accType = accType;
        this.accBalance = accBalance;
        this.accNum = generateAccountNumber();
    }

    // Method to generate unique account numbers
    protected static int generateAccountNumber() {
        int accNum;
        do {
            accNum = (int) ((Math.random() * 9000) + 1000); // Generate a 4-digit number
        } while (usedAccountNumbers.contains(accNum)); // Ensure it's unique
        usedAccountNumbers.add(accNum);
        return accNum;
    }

    // Abstract methods that need to be implemented by subclasses
    abstract void displayDetails();
    abstract void deposit(int amount);
    abstract void withdraw(int amount);
}

class SavingsAccount extends Account implements Authenticatable {
    private String password;
    private static final double INTEREST_RATE = 0.03; // 3% annual interest

    void initializeSavings(String name, String password, int initialBalance) {
        super.initialize(name, "Savings", initialBalance); // Initialize superclass with details
        this.password = password;
    }

    @Override
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    void computeAndDepositInterest() {
        int interest = (int) (accBalance * INTEREST_RATE);
        accBalance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + accBalance);
    }

    @Override
    void displayDetails() {
        System.out.println("Account Type: Savings");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + accBalance);
    }

    @Override
    void deposit(int amount) {
        accBalance += amount;
        System.out.println("Deposit successful. New balance: " + accBalance);
    }

    @Override
    void withdraw(int amount) {
        if (amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBalance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class CurrentAccount extends Account implements Authenticatable {
    private String password;
    private static final int MIN_BALANCE = 1000;
    private static final int PENALTY = 100;

    void initializeCurrent(String name, String password, int initialBalance) {
        super.initialize(name, "Current", initialBalance);
        this.password = password;
    }

    @Override
    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    void checkMinimumBalance() {
        if (accBalance < MIN_BALANCE) {
            accBalance -= PENALTY;
            System.out.println("Minimum balance not maintained. Penalty of " + PENALTY + " imposed. New balance: " + accBalance);
        }
    }

    @Override
    void displayDetails() {
        System.out.println("Account Type: Current");
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accNum);
        System.out.println("Balance: " + accBalance);
    }

    @Override
    void deposit(int amount) {
        accBalance += amount;
        System.out.println("Deposit successful. New balance: " + accBalance);
    }

    @Override
    void withdraw(int amount) {
        if (amount <= accBalance) {
            accBalance -= amount;
            System.out.println("Withdrawal successful. New balance: " + accBalance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        List<Account> accounts = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Display Account Details");
            System.out.println("7. Compute Interest (Savings Only)");
            System.out.println("8. Check Minimum Balance (Current Only)");
            System.out.println("0. Quit");
            System.out.print("Enter Your Choice: ");
            int choice = in.nextInt();

            switch (choice) {
                case 1: {
                    SavingsAccount savings = new SavingsAccount();
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Set Password: ");
                    String password = in.next();
                    System.out.print("Enter Initial Balance: ");
                    int balance = in.nextInt();
                    savings.initializeSavings(name, password, balance);
                    accounts.add(savings);
                    System.out.println("Savings Account created successfully.");
                    System.out.println("Account Number: " + savings.accNum);
                    break;
                }
                case 2: {
                    CurrentAccount current = new CurrentAccount();
                    System.out.print("Enter Name: ");
                    String name = in.next();
                    System.out.print("Set Password: ");
                    String password = in.next();
                    System.out.print("Enter Initial Balance: ");
                    int balance = in.nextInt();
                    current.initializeCurrent(name, password, balance);
                    accounts.add(current);
                    System.out.println("Current Account created successfully.");
                    System.out.println("Account Number: " + current.accNum);
                    break;
                }
                case 3: {
                    Account account = findAccount(accounts, in);
                    if (account != null) {
                        System.out.print("Enter Amount to Deposit: ");
                        int amount = in.nextInt();
                        account.deposit(amount);
                    }
                    break;
                }
                case 4: {
                    Account account = findAccount(accounts, in);
                    if (account != null) {
                        System.out.print("Enter Amount to Withdraw: ");
                        int amount = in.nextInt();
                        account.withdraw(amount);
                    }
                    break;
                }
                case 5: {
                    Account account = findAccount(accounts, in);
                    if (account != null) {
                        System.out.println("Balance: " + account.accBalance);
                    }
                    break;
                }
                case 6: {
                    Account account = findAccount(accounts, in);
                    if (account != null) {
                        account.displayDetails();
                    }
                    break;
                }
                case 7: {
                    Account account = findAccount(accounts, in);
                    if (account instanceof SavingsAccount savingsAccount) {
                        savingsAccount.computeAndDepositInterest();
                    } else {
                        System.out.println("This feature is for Savings Accounts only.");
                    }
                    break;
                }
                case 8: {
                    Account account = findAccount(accounts, in);
                    if (account instanceof CurrentAccount currentAccount) {
                        currentAccount.checkMinimumBalance();
                    } else {
                        System.out.println("This feature is for Current Accounts only.");
                    }
                    break;
                }
                case 0: quit = true; break;
                default: System.out.println("Invalid choice. Please try again."); break;
            }
        }
    }

    // Method to find an account by its number
    private static Account findAccount(List<Account> accounts, Scanner in) {
        System.out.print("Enter Account Number: ");
        int accNum = in.nextInt();
        for (Account account : accounts) {
            if (account.accNum == accNum) {
                return account;
            }
        }
        System.out.println("Account not found.");
        return null;
    }
}