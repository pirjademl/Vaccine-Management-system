package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Rectangle;
import java.awt.Component;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 900);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setAutoscrolls(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 822, 90);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION  PAGE");
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setForeground(Color.CYAN);
		lblNewLabel.setBackground(new Color(138, 43, 226));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		textField = new JTextField();
		textField.setBounds(266, 123, 210, 35);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name         :");
		lblNewLabel_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(113, 119, 135, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Middle Name      :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_1.setBounds(113, 167, 135, 38);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Last Name        :");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_2.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_2.setBounds(113, 226, 135, 38);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Phone No        :");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_3.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_3.setBounds(113, 283, 135, 38);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email-Id           :");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_4.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_4.setBounds(113, 342, 135, 38);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("D O B              :");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_5.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_5.setBounds(113, 397, 135, 38);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Gender              :");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_6.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_6.setBounds(113, 447, 135, 38);
		contentPane.add(lblNewLabel_1_6);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(266, 171, 210, 35);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(266, 230, 210, 35);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(266, 287, 210, 35);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(266, 342, 210, 35);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(266, 397, 210, 35);
		contentPane.add(textField_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male\r\n\r\n");
		rdbtnNewRadioButton.setToolTipText("");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnNewRadioButton.setBounds(268, 458, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBounds(390, 458, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Address             :");
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_1.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNewLabel_1_6_1.setBackground(new Color(176, 224, 230));
		lblNewLabel_1_6_1.setBounds(113, 503, 135, 38);
		contentPane.add(lblNewLabel_1_6_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(266, 503, 217, 146);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("REGISTER");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(184, 692, 128, 35);
		contentPane.add(btnNewButton);
		
		JButton btnReset = new JButton("RESET");
		btnReset.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		btnReset.setBorderPainted(false);
		btnReset.setBackground(new Color(135, 206, 250));
		btnReset.setBounds(365, 692, 128, 35);
		contentPane.add(btnReset);
	}
}
