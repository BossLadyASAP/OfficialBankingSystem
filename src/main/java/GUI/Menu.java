package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data.FileIO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import javax.swing.Icon;

import java.net.URL;
import javax.swing.ImageIcon;

public class Menu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Menu() {
		setTitle("Banking System");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 474);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Title Label
		JLabel lblBankingSystem = new JLabel("Banking System");
		lblBankingSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblBankingSystem.setFont(new Font("SansSerif", Font.BOLD, 28));
		lblBankingSystem.setBounds(150, 40, 300, 40); // Centered at the top
		contentPane.add(lblBankingSystem);
                
                 // Icon
        JLabel iconLabel = new JLabel();
        try {
           URL imageUrl = new URL("https://img.icons8.com/color/96/bank-building.png");
            ImageIcon icon = new ImageIcon(imageUrl);
            //String filePath = "C:\\Users\\HP\\Desktop\\1.png"; // Adjust for your OS
            //ImageIcon icon = new ImageIcon(filePath);
            
            Image scaledImage = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            iconLabel.setIcon(new ImageIcon(scaledImage));
        } catch (Exception e) {
            e.printStackTrace();
        }
        iconLabel.setBounds(510, 30, 100, 100);
        contentPane.add(iconLabel);
		
		FileIO.Read();
		
		JButton btnAddAccount = new JButton("Add Account");
		btnAddAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.addaccount.isVisible())
				{
					GUIForm.addaccount.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
                 btnAddAccount.setFont(new Font("Tahoma", Font.PLAIN, 14)); // Set font size to match the image
		btnAddAccount.setBounds(200, 120, 200, 40); // Centered below the title
		contentPane.add(btnAddAccount);
		
                // Deposit Button
		JButton btnDepositToAccount = new JButton("Deposit To Account");
		btnDepositToAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.depositacc.isVisible())
				{
					GUIForm.depositacc.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
			}
		});
                btnDepositToAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnDepositToAccount.setBounds(200, 170, 200, 40); // Centered below "Add Account"
		contentPane.add(btnDepositToAccount);
		
                // Withdraw Button
		JButton btnWithdrawFromAccount = new JButton("Withdraw From Account");
		btnWithdrawFromAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!GUIForm.withdraw.isVisible())
				{
					GUIForm.withdraw.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
				}
				
				
			}
			
		});
		 btnWithdrawFromAccount.setFont(new Font("Tahoma", Font.PLAIN, 14));
                 btnWithdrawFromAccount.setBounds(200, 220, 200, 40);
		contentPane.add(btnWithdrawFromAccount);
		
		// JButton btnDisplayAccountList = new JButton("Display Account List");
		// btnDisplayAccountList.addActionListener(new ActionListener() {
		//	public void actionPerformed(ActionEvent e) {
		//	
		//		if(!GUIForm.displaylist.isVisible())
		//		{
		//			GUIForm.displaylist.setVisible(true);
		//		}
		//		else
		//		{
		//			JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
		//		}
				
		//	}
		// });
		 // btnDisplayAccountList.setFont(new Font("Tahoma", Font.PLAIN, 14));
                 // btnDisplayAccountList.setBounds(200, 270, 200, 40);
		// contentPane.add(btnDisplayAccountList);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(getComponent(0), "Thanks For Using") ;
				FileIO.Write();
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 14));
                btnExit.setBounds(200, 320, 200, 40); // Centered below the other buttons
		contentPane.add(btnExit);
		
		JButton btnNewButton = new JButton("Add Account");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(!GUIForm.addaccount.isVisible())
			{
				GUIForm.addaccount.setVisible(true);
			}
			else
			{
				JOptionPane.showMessageDialog(getComponent(0), "Already Opened", "Warning", 0);
			}
				
				
			}
			
		});
		

       // JLabel lblNewLabel = new JLabel("New label");
      //  try {
            // Specify the URL for your image
           // URL imageUrl = new URL("https://cdn.vectorstock.com/i/1000v/72/97/bank-icon-vector-25177297.avif");
           // ImageIcon icon = new ImageIcon(imageUrl);
           // lblNewLabel.setIcon(icon);
        // } catch (Exception e) {
         //   e.printStackTrace();
       // }
      //  lblNewLabel.setBounds(397, 166, 216, 213);
       // contentPane.add(lblNewLabel);

        // Other code...
    }
}