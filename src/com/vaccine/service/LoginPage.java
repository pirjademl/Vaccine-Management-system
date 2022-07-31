package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField Username;
	private JPasswordField passwordfield;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		panel_1.setBackground(new Color(0, 0, 0));
		panel_1.setBounds(0, 0, 776, 134);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("LOGIN      ");
		panel_1.add(lblNewLabel);
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_1 = new JLabel("Username");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(81, 204, 152, 48);
		contentPane.add(lblNewLabel_1);
		
		Username = new JTextField();
		Username.setBounds(273, 213, 255, 40);
		contentPane.add(Username);
		Username.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel_1_1.setBounds(81, 301, 152, 40);
		contentPane.add(lblNewLabel_1_1);
		
		passwordfield = new JPasswordField();
		passwordfield.setBounds(273, 306, 255, 40);
		contentPane.add(passwordfield);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.setBounds(195, 429, 134, 48);
		contentPane.add(btnNewButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClear.setBackground(new Color(135, 206, 250));
		btnClear.setBorderPainted(false);
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnClear.setBounds(440, 429, 134, 48);
		contentPane.add(btnClear);
	}
}
