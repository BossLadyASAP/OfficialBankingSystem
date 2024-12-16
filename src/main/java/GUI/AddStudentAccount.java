package GUI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddStudentAccount extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField studentIDField;
    private JTextField studentNameField;
    private JTextField initialDepositField;

    /**
     * Create the frame.
     */
    public AddStudentAccount() {
        setTitle("Add Student Account");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBackground(SystemColor.activeCaption);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Student ID Field
        JLabel lblStudentID = new JLabel("Student ID:");
        lblStudentID.setBounds(30, 30, 150, 25);
        contentPane.add(lblStudentID);

        studentIDField = new JTextField();
        studentIDField.setBounds(180, 30, 200, 25);
        contentPane.add(studentIDField);
        studentIDField.setColumns(10);

        // Student Name Field
        JLabel lblStudentName = new JLabel("Student Name:");
        lblStudentName.setBounds(30, 70, 150, 25);
        contentPane.add(lblStudentName);

        studentNameField = new JTextField();
        studentNameField.setBounds(180, 70, 200, 25);
        contentPane.add(studentNameField);
        studentNameField.setColumns(10);

        // Initial Deposit Field
        JLabel lblInitialDeposit = new JLabel("Initial Deposit:");
        lblInitialDeposit.setBounds(30, 110, 150, 25);
        contentPane.add(lblInitialDeposit);

        initialDepositField = new JTextField();
        initialDepositField.setBounds(180, 110, 200, 25);
        contentPane.add(initialDepositField);
        initialDepositField.setColumns(10);

        // Add Student Account Button
        JButton btnAddStudentAccount = new JButton("Add Student Account");
        btnAddStudentAccount.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Validating input fields
                String studentID = studentIDField.getText();
                String studentName = studentNameField.getText();
                String initialDepositText = initialDepositField.getText();

                if (studentID.isEmpty() || studentName.isEmpty() || initialDepositText.isEmpty()) {
                    JOptionPane.showMessageDialog(AddStudentAccount.this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                try {
                    double initialDeposit = Double.parseDouble(initialDepositText);
                    if (initialDeposit < 0) {
                        JOptionPane.showMessageDialog(AddStudentAccount.this, "Initial deposit cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
                        return;
                    }

                    // Here you would add the logic to save the new student account details.
                    // For example, adding the account to a system or database:
                    // bankingSystem.createAccount(studentID, studentName, initialDeposit);

                    JOptionPane.showMessageDialog(AddStudentAccount.this, "Student account created successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);

                    // Optionally, dispose of the frame after successful creation
                    dispose();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(AddStudentAccount.this, "Invalid amount for initial deposit.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnAddStudentAccount.setBounds(120, 160, 200, 40);
        contentPane.add(btnAddStudentAccount);

        // Title Label
        JLabel lblAddStudentAccount = new JLabel("Add Student Account");
        lblAddStudentAccount.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblAddStudentAccount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAddStudentAccount.setBounds(100, 10, 250, 30);
        contentPane.add(lblAddStudentAccount);
    }
}
