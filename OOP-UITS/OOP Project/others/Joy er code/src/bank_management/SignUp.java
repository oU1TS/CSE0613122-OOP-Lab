/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignUp extends JFrame implements ActionListener {
    // Declare the components
    JLabel titleLabel, nameLabel, nidLabel, addressLabel, userLabel, passLabel, accountTypeLabel;
    JTextField namef, nidf, addressf, userf;
    JPasswordField passf;
    JButton btnSignUp, btnClear;
    JCheckBox savingsCheckBox, currentCheckBox;

    // Static variables to store user credentials and details
    public static String storedUsername = "";
    public static String storedPin = "";
    public static String storedName = "";
    public static String storedNid = "";
    public static String storedAddress = "";
    public static String storedAccountType = "";

    // Constructor to set up the UI
    public SignUp() {
        setLayout(null);
        setSize(400, 500);
        setLocation(750, 250);
        setTitle("Sign Up");
        getContentPane().setBackground(Color.decode("#0f2a3d"));

        // Heading Label
        titleLabel = new JLabel("Sign Up");
        titleLabel.setBounds(150, 20, 100, 30);
        titleLabel.setFont(new Font("Osward", Font.BOLD, 28));
        titleLabel.setForeground(Color.white);
        add(titleLabel);

        // Name Label and TextField
        nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 70, 100, 30);
        nameLabel.setFont(new Font("Osward", Font.BOLD, 18));
        nameLabel.setForeground(Color.white);
        add(nameLabel);

        namef = new JTextField();
        namef.setBounds(150, 70, 200, 30);
        add(namef);

        // NID Label and TextField
        nidLabel = new JLabel("NID No:");
        nidLabel.setBounds(50, 120, 100, 30);
        nidLabel.setFont(new Font("Osward", Font.BOLD, 18));
        nidLabel.setForeground(Color.white);
        add(nidLabel);

        nidf = new JTextField();
        nidf.setBounds(150, 120, 200, 30);
        add(nidf);

        // Address Label and TextField
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 170, 100, 30);
        addressLabel.setFont(new Font("Osward", Font.BOLD, 18));
        addressLabel.setForeground(Color.white);
        add(addressLabel);

        addressf = new JTextField();
        addressf.setBounds(150, 170, 200, 30);
        add(addressf);

        // Username Label and TextField
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 220, 100, 30);
        userLabel.setFont(new Font("Osward", Font.BOLD, 18));
        userLabel.setForeground(Color.white);
        add(userLabel);

        userf = new JTextField();
        userf.setBounds(150, 220, 200, 30);
        add(userf);

        // Pin Label and PasswordField
        passLabel = new JLabel("Pin:");
        passLabel.setBounds(50, 270, 100, 30);
        passLabel.setFont(new Font("Osward", Font.BOLD, 18));
        passLabel.setForeground(Color.white);
        add(passLabel);

        passf = new JPasswordField();
        passf.setBounds(150, 270, 200, 30);
        add(passf);

        // Account Type Label and Checkboxes
        accountTypeLabel = new JLabel("Account Type:");
        accountTypeLabel.setBounds(50, 300, 150, 30);
        accountTypeLabel.setFont(new Font("Osward", Font.BOLD, 15));
        accountTypeLabel.setForeground(Color.white);
        add(accountTypeLabel);

        savingsCheckBox = new JCheckBox("Savings");
        savingsCheckBox.setBounds(150, 320, 100, 30);
        savingsCheckBox.setFont(new Font("Osward", Font.PLAIN, 18));
        savingsCheckBox.setForeground(Color.white);
        savingsCheckBox.setBackground(Color.decode("#0f2a3d"));
        add(savingsCheckBox);

        currentCheckBox = new JCheckBox("Current");
        currentCheckBox.setBounds(260, 320, 100, 30);
        currentCheckBox.setFont(new Font("Osward", Font.PLAIN, 18));
        currentCheckBox.setForeground(Color.white);
        currentCheckBox.setBackground(Color.decode("#0f2a3d"));
        add(currentCheckBox);

        // Sign Up Button
        btnSignUp = new JButton("Sign Up");
        btnSignUp.setBounds(50, 370, 90, 40);
        btnSignUp.setFont(new Font("Osward", Font.BOLD, 18));
        btnSignUp.setBackground(Color.decode("#FFF4B7"));
        btnSignUp.setForeground(Color.black);
        btnSignUp.addActionListener(this);
        add(btnSignUp);

        // Clear Button
        btnClear = new JButton("Clear");
        btnClear.setBounds(250, 370, 90, 40);
        btnClear.setFont(new Font("Osward", Font.BOLD, 18));
        btnClear.setBackground(Color.decode("#FFF4B7"));
        btnClear.setForeground(Color.black);
        btnClear.addActionListener(this);
        add(btnClear);
    }

    // ActionListener method to handle button actions
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnSignUp) {
            // Store user information
            storedUsername = userf.getText();
            storedPin = String.valueOf(passf.getPassword());
            storedName = namef.getText();
            storedNid = nidf.getText();
            storedAddress = addressf.getText();
            
            // Determine the selected account type
            if (savingsCheckBox.isSelected()) {
                storedAccountType = "Savings";
            } else if (currentCheckBox.isSelected()) {
                storedAccountType = "Current";
            }

            JOptionPane.showMessageDialog(this, "Account Created Successfully!");
            this.setVisible(false);
            new Login().setVisible(true);  // Show the login page after sign up
        } else if (ae.getSource() == btnClear) {
            // Clear the text fields
            namef.setText("");
            nidf.setText("");
            addressf.setText("");
            userf.setText("");
            passf.setText("");
            savingsCheckBox.setSelected(false);
            currentCheckBox.setSelected(false);
        }
    }

    // Main method to launch the SignUp window
    public static void main(String[] args) {
        new SignUp().setVisible(true);
    }
}