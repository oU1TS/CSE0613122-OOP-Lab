
package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class InfoPage extends JFrame implements ActionListener {

    JButton btn_1, btn_2, btn_3;
    JTextField f1, f2;
    JLabel display;

    // Declare a variable to store the balance and account type
    double balance = 0.0;
    String accountType = SignUp.storedAccountType;  // Get the account type from SignUp

    // Constructor
    InfoPage() {
        setLayout(null);
        setSize(1000, 960);
        setVisible(true);
        setLocation(700, 50);
        setTitle("Bank Management");
        getContentPane().setBackground(Color.decode("#0f2a3d"));

        // Heading Section
        JLabel heading = new JLabel("Account Information");
        add(heading);
        heading.setBounds(0, 0, 1000, 60);
        heading.setFont(new Font("Osward", Font.BOLD, 28));
        heading.setBackground(Color.black);
        heading.setForeground(Color.white);
        heading.setOpaque(true);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setVerticalAlignment(JLabel.CENTER);

        // Account Information Section
        JLabel user = new JLabel("Account No: #26504169");
        add(user);
        user.setBounds(80, 100, 600, 40);
        user.setFont(new Font("Osward", Font.BOLD, 20));
        user.setForeground(Color.white);

        JLabel user1 = new JLabel("Account Holder Name: " + SignUp.storedName);  // Display stored name
        add(user1);
        user1.setBounds(80, 150, 600, 40);
        user1.setFont(new Font("Osward", Font.BOLD, 20));
        user1.setForeground(Color.white);

        JLabel user2 = new JLabel("NID No: " + SignUp.storedNid);  // Display stored NID
        add(user2);
        user2.setBounds(80, 200, 600, 40);
        user2.setFont(new Font("Osward", Font.BOLD, 20));
        user2.setForeground(Color.white);

        JLabel user3 = new JLabel("Address: " + SignUp.storedAddress);  // Display stored address
        add(user3);
        user3.setBounds(80, 250, 600, 40);
        user3.setFont(new Font("Osward", Font.BOLD, 20));
        user3.setForeground(Color.white);

        JLabel user4 = new JLabel("Account Type: " + accountType);  // Display account type (Savings/Current)
        add(user4);
        user4.setBounds(80, 300, 600, 40);
        user4.setFont(new Font("Osward", Font.BOLD, 20));
        user4.setForeground(Color.white);

        // Transaction Section Heading
        JLabel heading_2 = new JLabel("Transaction Section");
        add(heading_2);
        heading_2.setBounds(0, 350, 1000, 60);
        heading_2.setFont(new Font("Osward", Font.BOLD, 20));
        heading_2.setForeground(Color.white);
        heading_2.setBackground(Color.black);
        heading_2.setOpaque(true);
        heading_2.setHorizontalAlignment(JLabel.CENTER);
        heading_2.setVerticalAlignment(JLabel.CENTER);

        // Deposit Button
        btn_1 = new JButton("Deposit");
        add(btn_1);
        btn_1.setBounds(200, 600, 250, 40);
        btn_1.setFont(new Font("Osward", Font.BOLD, 18));
        btn_1.setBackground(Color.black);
        btn_1.setForeground(Color.white);
        btn_1.addActionListener(this);

        // Withdraw Button
        btn_2 = new JButton("Withdraw");
        add(btn_2);
        btn_2.setBounds(600, 600, 250, 40);
        btn_2.setFont(new Font("Osward", Font.BOLD, 18));
        btn_2.setBackground(Color.black);
        btn_2.setForeground(Color.white);
        btn_2.addActionListener(this);

        // Clear Button
        btn_3 = new JButton("Clear");
        add(btn_3);
        btn_3.setBounds(500, 800, 100, 40);
        btn_3.setFont(new Font("Osward", Font.BOLD, 18));
        btn_3.setBackground(Color.black);
        btn_3.setForeground(Color.white);
        btn_3.addActionListener(this);

        // TextField for Withdraw amount
        f1 = new JTextField("");
        add(f1);
        f1.setBounds(600, 535, 250, 40);
        f1.setFont(new Font("Osward", Font.BOLD, 20));
        f1.setBackground(Color.decode("#FFF4B7"));
        f1.setForeground(Color.black);
        f1.setOpaque(true);

        // TextField for Deposit amount
        f2 = new JTextField("");
        add(f2);
        f2.setBounds(200, 535, 250, 40);
        f2.setFont(new Font("Osward", Font.BOLD, 20));
        f2.setBackground(Color.decode("#FFF4B7"));
        f2.setForeground(Color.black);
        f2.setOpaque(true);

        // Label to show balance
        display = new JLabel("Balance: 0.0");
        add(display);
        display.setBounds(350, 700, 400, 60);
        display.setFont(new Font("Osward", Font.BOLD, 28));
        display.setBackground(Color.decode("#FFF4B7"));
        display.setForeground(Color.black);
        display.setOpaque(true);
        display.setHorizontalAlignment(JLabel.CENTER);
        display.setVerticalAlignment(JLabel.CENTER);
    }

    // Action performed when the buttons are clicked
    public void actionPerformed(ActionEvent ae) {
        // Handle deposit
        if (ae.getSource() == btn_1) {
            double depositAmount = Double.parseDouble(f2.getText());

            if (depositAmount >= 500) {  // Check if deposit is at least 500
                if (accountType.equals("Savings")) {
                    // Apply 5% interest if account type is "Savings"
                    double interest = depositAmount * 0.05;
                    depositAmount += interest;  // Add interest to the deposit amount
                    JOptionPane.showMessageDialog(this, "5% interest applied. Total deposit: " + depositAmount);
                }

                // Add the deposit (with or without interest) to balance
                balance += depositAmount;
                // Update display with new balance
                display.setText("Balance: " + balance);
            } else {
                JOptionPane.showMessageDialog(this, "Minimum deposit amount is 500.");
            }
        }

        // Handle withdraw
        if (ae.getSource() == btn_2) {
            double withdrawAmount = Double.parseDouble(f1.getText());

            if (withdrawAmount > 500) {  // Check if withdrawal exceeds 500
                // Calculate the penalty for exceeding 500
                double penalty =(withdrawAmount / 500) * 10;
                balance -= (withdrawAmount + penalty);  // Apply penalty along with the withdrawal amount
              display.setText("Balance: " + balance);
            } else if (withdrawAmount > 0 && withdrawAmount <= balance) {
                // Subtract withdraw amount from balance
                balance -= withdrawAmount;
                display.setText("Balance: " + balance);
                
            } else if (withdrawAmount > balance) {
                JOptionPane.showMessageDialog(this, "Insufficient balance.");
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a positive amount to withdraw.");
            }
        }

        // Clear button to reset display
        if (ae.getSource() == btn_3) {
            display.setText("Balance: 0.0");
            f1.setText("");
            f2.setText("");
        }
    }

    public static void main(String[] args) {
        InfoPage infoPage = new InfoPage();
    }
}

