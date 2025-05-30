/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener {
    JButton btn1, btn2, btnSignUp;
    JTextField userf;
    JPasswordField passf;

    Login() {
        // Frame-section
        setLayout(null);
        setSize(1000, 600);
        setVisible(true);
        setLocation(700, 250);
        setTitle("Bank Management");
        getContentPane().setBackground(Color.decode("#0f2a3d"));

        // Heading-Section
        JLabel heading = new JLabel("Welcome to Bank Management System");
        add(heading);
        heading.setBounds(0, 0, 1000, 60);

        heading.setFont(new Font("Osward", Font.BOLD, 28));
        heading.setBackground(Color.BLACK);
        heading.setForeground(Color.white);
        heading.setOpaque(true);
        heading.setHorizontalAlignment(JLabel.CENTER);
        heading.setVerticalAlignment(JLabel.CENTER);

        // User-Section
        JLabel user = new JLabel("User Name:");
        add(user);
        user.setBounds(150, 200, 300, 40);
        user.setFont(new Font("Osward", Font.BOLD, 28));
        user.setForeground(Color.white);

        // User-textfield
        userf = new JTextField();
        add(userf);
        userf.setBounds(350, 200, 300, 40);
        userf.setFont(new Font("Osward", Font.BOLD, 20));
        userf.setBackground(Color.decode("#FFF4B7"));
        userf.setForeground(Color.black);
        userf.setOpaque(true);

        // Password-section
        JLabel pass = new JLabel("Pin:");
        add(pass);
        pass.setBounds(150, 300, 300, 40);
        pass.setFont(new Font("Osward", Font.BOLD, 28));
        pass.setForeground(Color.white);

        // Pass-textfield
        passf = new JPasswordField();
        add(passf);
        passf.setBounds(350, 300, 300, 40);
        passf.setFont(new Font("Osward", Font.BOLD, 20));
        passf.setBackground(Color.decode("#FFF4B7"));
        passf.setForeground(Color.black);
        passf.setOpaque(true);

        // Login Button
        btn1 = new JButton("Login");
        add(btn1);
        btn1.setBounds(350, 400, 100, 40);
        btn1.setFont(new Font("Osward", Font.BOLD, 18));
        btn1.setBackground(Color.decode("#FFF4B7"));
        btn1.setForeground(Color.black);
        btn1.addActionListener(this);

        // Clear Button
        btn2 = new JButton("Clear");
        add(btn2);
        btn2.setBounds(550, 400, 100, 40);
        btn2.setFont(new Font("Osward", Font.BOLD, 18));
        btn2.setBackground(Color.decode("#FFF4B7"));
        btn2.setForeground(Color.black);
        btn2.addActionListener(this);

        // SignUp Button
        btnSignUp = new JButton("SignUp");
        add(btnSignUp);
        btnSignUp.setBounds(450, 500, 100, 40);
        btnSignUp.setFont(new Font("Osward", Font.BOLD, 18));
        btnSignUp.setBackground(Color.decode("#FFF4B7"));
        btnSignUp.setForeground(Color.black);
        btnSignUp.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // SignUp Button action
        if (ae.getSource() == btnSignUp) {
            new SignUp().setVisible(true);  // Open SignUp page
            this.setVisible(false); // Hide Login page
        }

        // Login Button action: Check username and pin against stored values
        else if (ae.getSource() == btn1) {
              new InfoPage().setVisible(true); // Ensure the username and pin are checked against the stored values
            String inputUsername = userf.getText();
            String inputPin = String.valueOf(passf.getPassword());

            if (inputUsername.equals(SignUp.storedUsername) && inputPin.equals(SignUp.storedPin)) {
                setVisible(false);
                new InfoPage().setVisible(true);  // Show InfoPage after successful login
            } else {
                // Show error message for invalid username or pin
                JOptionPane.showMessageDialog(this, "Invalid Username or Pin. Please try again.");
            }
        }

        // Clear Button action: Clear the text fields
        else if (ae.getSource() == btn2) {
            userf.setText("");
            passf.setText("");
        }
    }
    

    public static void main(String[] args) {
        Login login = new Login(); // Initialize the login window
    }
}