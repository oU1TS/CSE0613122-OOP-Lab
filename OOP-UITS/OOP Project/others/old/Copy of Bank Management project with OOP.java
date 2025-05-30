/* **************************************
    Author: Khandakar Borhan Uddin
    ID: 0432310005101008
    Batch: 53
    Semester: Autumn
    University of Information Technology and Sciences
    Reference: [[[[Github]]]]
******************************************
*/
package bankmanagement;

import java.util.*;

// Define an interface for user authentication
interface Authenticatable {
    boolean authenticate(String password);
}

class Account {
    String name, acc_type;
    int Acc_num, Acc_Balance;

    Account(String n, int acc_num, int b, String a_t) {
        name = n;
        Acc_num = acc_num;
        Acc_Balance = b;
        acc_type = a_t;
    }
}

class create_account extends Account implements Authenticatable {
    private final String password;
    private String street;
    private String city;

    create_account(String n, String a_t, String password, String street, String city, int initialBalance) {
        super(n, generateAccountNumber(), initialBalance, a_t);
        this.password = password;
        this.street = street;
        this.city = city;
    }

    void display_details() {
        System.out.println("Depositor Name: " + name);
        System.out.println("Account Number: " + Acc_num);
        System.out.println("Account Balance: " + Acc_Balance);
        System.out.println("Account Type: " + acc_type);
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
    }

    void deposite(int money) {
        Acc_Balance += money;
    }

    int withdraw(int withd) {
        if (withd <= Acc_Balance) {
            Acc_Balance -= withd;
        } else {
            System.out.println("Insufficient balance. Withdrawal canceled.");
        }
        return Acc_Balance;
    }

    public boolean authenticate(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    // Generate a unique account number
    private static int generateAccountNumber() {
        return (int) ((Math.random() * 9000) + 1000);
    }
}

public class Main {
    public static void main(String[] args) {
        List<create_account> accounts = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        Scanner strng = new Scanner(System.in);
        int userChoice;
        boolean quit = false;

        do {
            System.out.println("1. Create Account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Check balance");
            System.out.println("5. Display Account Details");
            System.out.println("0. to quit: \n");
            System.out.print("Enter Your Choice: ");
            userChoice = in.nextInt();

            switch (userChoice) {
                case 1 -> {
                    System.out.print("Enter your Name: ");
                    String user_name = strng.nextLine();
                    System.out.print("Enter Account Type: ");
                    String type = strng.nextLine();
                    System.out.print("Enter Password: ");
                    String password = strng.nextLine();
                    System.out.print("Enter Street: ");
                    String street = strng.nextLine();
                    System.out.print("Enter City: ");
                    String city = strng.nextLine();
                    System.out.print("Set an initial balance: ");
                    int initialBalance = in.nextInt();
                    create_account user = new create_account(user_name, type, password, street, city, initialBalance);
                    accounts.add(user);
                    System.out.println("\n\tYour Account Details\n\tDon't Forget Account Number\n");
                    System.out.println("**************************");
                    user.display_details();
                }
                case 2 -> {
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts created yet. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Account Number: ");
                    int accountNumberDeposit = in.nextInt();
                    create_account depositAccount = findAccount(accounts, accountNumberDeposit);
                    if (depositAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.print("Enter Password: ");
                    String inputPassword = strng.nextLine();
                    if (depositAccount.authenticate(inputPassword)) {
                        System.out.print("Enter Amount Of Money: ");
                        int depositAmount = in.nextInt();
                        depositAccount.deposite(depositAmount);
                        System.out.println("Deposit Successful!!");
                    } else {
                        System.out.println("Wrong Password.");
                    }
                }
                case 3 -> {
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts created yet. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Account Number: ");
                    int accountNumberWithdraw = in.nextInt();
                    create_account withdrawAccount = findAccount(accounts, accountNumberWithdraw);
                    if (withdrawAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.print("Enter Password: ");
                    String inputPasswordWithdraw = strng.nextLine();
                    if (withdrawAccount.authenticate(inputPasswordWithdraw)) {
                        System.out.print("Enter Amount Of Money to Withdraw: ");
                        int withdrawAmount = in.nextInt();
                        int cb = withdrawAccount.withdraw(withdrawAmount);
                        System.out.println("Withdraw Successful!!\nYour Current Balance: " + cb);
                    } else {
                        System.out.println("Wrong Password.");
                    }
                }
                case 4 -> {
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts created yet. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Account Number: ");
                    int accountNumberCheck = in.nextInt();
                    create_account checkAccount = findAccount(accounts, accountNumberCheck);
                    if (checkAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    System.out.println("Your Current Balance: " + checkAccount.Acc_Balance);
                }
                case 5 -> {
                    if (accounts.isEmpty()) {
                        System.out.println("No accounts created yet. Please create an account first.");
                        break;
                    }
                    System.out.print("Enter Account Number: ");
                    int accountNumberDisplay = in.nextInt();
                    create_account displayAccount = findAccount(accounts, accountNumberDisplay);
                    if (displayAccount == null) {
                        System.out.println("Account not found.");
                        break;
                    }
                    displayAccount.display_details();
                }
                case 0 -> quit = true;
                default -> System.out.println("Wrong Choice.");
            }
            System.out.println("\n");
        } while (!quit);
        System.out.println("Thanks!");
    }

    // Helper function to find an account by account number
    private static create_account findAccount(List<create_account> accounts, int accountNumber) {
        for (create_account account : accounts) {
            if (account.Acc_num == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
