package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddSavingsAccount extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField accountNumberField;
    private JTextField accountHolderField;
    private JTextField initialDepositField;

    /**
     * Create the frame.
     */
    public AddSavingsAccount() {
        setTitle("Add Savings Account");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Account Number Field
        JLabel lblAccountNumber = new JLabel("Account Number:");
        lblAccountNumber.setBounds(30, 30, 150, 25);
        contentPane.add(lblAccountNumber);

        accountNumberField = new JTextField();
        accountNumberField.setBounds(180, 30, 200, 25);
        contentPane.add(accountNumberField);
        accountNumberField.setColumns(10);

        // Account Holder Field
        JLabel lblAccountHolder = new JLabel("Account Holder:");
        lblAccountHolder.setBounds(30, 70, 150, 25);
        contentPane.add(lblAccountHolder);

        accountHolderField = new JTextField();
        accountHolderField.setBounds(180, 70, 200, 25);
        contentPane.add(accountHolderField);
        accountHolderField.setColumns(10);

        // Initial Deposit Field
        JLabel lblInitialDeposit = new JLabel("Initial Deposit:");
        lblInitialDeposit.setBounds(30, 110, 150, 25);
        contentPane.add(lblInitialDeposit);

        initialDepositField = new JTextField();
        initialDepositField.setBounds(180, 110, 200, 25);
        contentPane.add(initialDepositField);
        initialDepositField.setColumns(10);

        // Add Savings Account Button
        JButton btnAddSavingsAccount = new JButton("Add Savings Account");
        btnAddSavingsAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validating input fields
                String accountNumber = accountNumberField.getText();
                String accountHolder = accountHolderField.getText();
                String initialDepositText = initialDepositField.getText();

                if (accountNumber.isEmpty() || accountHolder.isEmpty() || initialDepositText.isEmpty()) {
                    JOptionPane.showMessageDialog(AddSavingsAccount.this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    double initialDeposit = Double.parseDouble(initialDepositText);
                    if (initialDeposit < 0) {
                        JOptionPane.showMessageDialog(AddSavingsAccount.this, "Initial deposit cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Here you would add the logic to save the new savings account details.
                    // For example, adding the account to a system or database:
                    // bankingSystem.createAccount(accountNumber, accountHolder, initialDeposit);
                    
                    JOptionPane.showMessageDialog(AddSavingsAccount.this, "Savings account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Optionally, dispose of the frame after successful creation
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AddSavingsAccount.this, "Invalid amount for initial deposit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnAddSavingsAccount.setBounds(120, 160, 200, 40);
        contentPane.add(btnAddSavingsAccount);

        // Title Label
        JLabel lblAddSavingsAccount = new JLabel("Add Savings Account");
        lblAddSavingsAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblAddSavingsAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddSavingsAccount.setBounds(100, 10, 250, 30);
        contentPane.add(lblAddSavingsAccount);
    }
}
