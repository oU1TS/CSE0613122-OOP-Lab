
import java.util.Scanner;

class ID {
String name;
    int num;
    int type;
    int balance;
    String Type;
ID(int b){
    balance = b;
    System.out.println("Deposited 500tk\nEligible for account\n");
}
    void InfoNow(String name,int n,int t,int b) {
        this.name = name;
        num = n;
        type = t;
        balance = b;
        System.out.println("\n\nAccount Name: "+name+"\nNumber: "+num+"\nType: "+type+"\nBalance: "+balance+"\n\n");
    }
    void deposit(){
        
    }
            
            void withdraw(){
                
            }

}

public class Bank{

    public static void main(String[] args) {
        int type;
        //System.out.println("Account Types Available:\n1. Student\n2. Regular\n\n\nInput Credentials:\n\nName: ");
        
        ID m1 = new ID(500);
        
        Scanner S1 = new Scanner(System.in);
        String name = S1.nextLine();
        System.out.println("Number: ");
        int num = S1.nextInt();
        System.out.println("Type (1/2): ");
        type = S1.nextInt();
        System.out.println("Balance: ");
        int balance = S1.nextInt();
        //ID m1 = new ID();
        
        m1.InfoNow(name, num, type, balance);
        System.out.println("")
        

    }

}
