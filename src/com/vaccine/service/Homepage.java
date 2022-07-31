package com.vaccine.service;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class Homepage extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 836, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		contentPane.setForeground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setForeground(Color.BLACK);
		
		JButton login = new JButton("Login");
		login.setBackground(new Color(135, 206, 250));
		login.setBorderPainted(false);
		login.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lg= new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton signup = new JButton("Signup");
		signup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		signup.setBackground(new Color(135, 206, 250));
		signup.setBorderPainted(false);
		signup.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(223)
					.addComponent(signup, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addGap(47)
					.addComponent(login, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(290, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 137, GroupLayout.PREFERRED_SIZE)
					.addGap(200)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(login, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(signup, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(177, Short.MAX_VALUE))
		);
		
		JLabel lblVaccineManagementSystem = new JLabel("VACCINE  MANAGEMENT   SYSTEM");
		panel.add(lblVaccineManagementSystem);
		lblVaccineManagementSystem.setForeground(Color.CYAN);
		lblVaccineManagementSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblVaccineManagementSystem.setBackground(Color.CYAN);
		lblVaccineManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 27));
		contentPane.setLayout(gl_contentPane);
	}
}
