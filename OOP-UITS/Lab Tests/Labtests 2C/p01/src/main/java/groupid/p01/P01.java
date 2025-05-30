package groupid.p01;

class BankAccount {

    String type;
    double balance = 0.0;
    String owner;

    BankAccount() {
        type = "Default";
//balance = 0;
        owner = "I am no one";
        //System.out.println("AccountType: " + type + "\nBalance: "+ balance + "\nOwner: "+owner);
    }
BankAccount(String n) {
        type = "Checking";
//balance = 0;
        owner = n;
    }
BankAccount(String n, double b,String t) {
        type = t;
balance = balance + b;
        owner = n;
        
    }
    void deposit(double d) {
        balance = balance + d;

    }

    void withdraw(double w) {
        balance = balance - w;
    }
    void withdraw(double w, String n) {
        balance = balance - w;

    }
   @Override
    public String toString(){
        
        return "AccountType: " + type + "\nBalance: "+ balance + "\nOwner: "+owner;
    }
}

public class P01 {

    public static void main(String[] args) {
        BankAccount empty = new BankAccount();
        BankAccount checking = new BankAccount("Alice");
        BankAccount savings = new BankAccount("Bob", 5000.0, "Savings");

        //Performing transactions
        System.out.println(empty);
        System.out.println("================");
        checking.deposit(1000.0);

        System.out.println(checking);
        checking.withdraw(500.0);
        System.out.println("================");
        System.out.println(checking);
        System.out.println("================");

        savings.withdraw(2000.0, "SecurePassword123");
        System.out.println(savings);
        System.out.println("================");
    }
}
