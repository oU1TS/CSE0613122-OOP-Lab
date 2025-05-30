import java.util.Scanner;
abstract class BankAccount{
    public int n,b,d,w;
    abstract void deposit(int d);
    abstract void withdraw(int w);  
}

class SavingsAccount extends BankAccount{
    @Override
    void deposit(int d){
        this.d = d;
        b = b+this.d;
        this.d=0;
        
    }
    @Override
    void withdraw(int w){
        this.w = w;
        b = b-this.w;
        this.w=0;
    }
    void display(){
        System.out.println("Current Balance: " + b);
    }
}
class CheckingAccount extends BankAccount{
    @Override
    void deposit(int d){
        this.d = d;
        b = b+this.d;
        this.d=0;
        
    }
    @Override
    void withdraw(int w){
        this.w = w;
        b = b-this.w;
        this.w=0;
    }
    void display(){
        System.out.println("Current Balance: " + b);
    }
    
}


public class Customer {
    
    public static void main(String[] args) {
        SavingsAccount S1 = new SavingsAccount();
        CheckingAccount C1 = new CheckingAccount(); 
        Scanner Scan = new Scanner(System.in);
        System.out.println("Account Type?\n1. Savings\n2. Checking\n\nInput Corresponding Numerals: ");
        int n = Scan.nextInt();
        if(n==1){
            S1.b=0;
            S1.display();
            System.out.println("Enter Amount to Deposit: ");
            int d = Scan.nextInt();
            S1.deposit(d);
            S1.display();
            System.out.println("Enter Amount to Withdraw: ");
            int w = Scan.nextInt();
            S1.withdraw(w);
            S1.display();
                    
            
        }
        else if(n==2){
            C1.b=0;
            C1.display();
            System.out.println("Enter Amount to Deposit: ");
            int d = Scan.nextInt();
            C1.deposit(d);
            System.out.println("Enter Amount to Withdraw: ");
            int w = Scan.nextInt();
            C1.withdraw(w);
            C1.display();
            
        }
        System.out.println("\nAll Operations Finished\n");
        
    }
    
}
