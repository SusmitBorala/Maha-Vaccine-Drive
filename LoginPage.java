package com.mvd.service;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class LoginPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField username;
	private JPasswordField password;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
					frame.setLocationRelativeTo(null);		// To set the frame at the center of screen
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
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		
		JLabel LoginLabel = new JLabel("LOGIN");
		LoginLabel.setBounds(389, 186, 122, 35);
		contentPane.add(LoginLabel);
		LoginLabel.setForeground(new Color(0, 51, 102));
		LoginLabel.setIcon(new ImageIcon(RegistrationPage.class.getResource("/com/mvd/resources/bg.png")));
		LoginLabel.setFont(new Font("Euclid Circular A", Font.BOLD, 30));
		LoginLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		LoginLabel.setHorizontalAlignment(SwingConstants.CENTER);
		LoginLabel.setBackground(new Color(238, 232, 170));
		
		JPanel headerPanel = new JPanel();
		headerPanel.setLayout(null);
		headerPanel.setBackground(new Color(238, 232, 170));
		headerPanel.setAlignmentY(0.0f);
		headerPanel.setAlignmentX(0.0f);
		headerPanel.setBounds(0, 0, 900, 118);
		contentPane.add(headerPanel);
		
		JLabel closeLabel = new JLabel("");
		closeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		closeLabel.setIcon(new ImageIcon(LoginPage.class.getResource("/com/mvd/resources/exitButton.png")));
		closeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		closeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		closeLabel.setBounds(872, 3, 25, 25);
		headerPanel.add(closeLabel);
		
		JLabel leftHeading = new JLabel("<HTML>\r\nMINISTRY OF <BR>\r\n<b>HEALTH </b> AND <BR>\r\n<b>FAMILY WELFARE</b><br>\r\nGOVERNMENT OF INDIA\r\n</HTML>");
		leftHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		leftHeading.setHorizontalAlignment(SwingConstants.LEFT);
		leftHeading.setForeground(Color.WHITE);
		leftHeading.setFont(new Font("Euclid Circular A", Font.PLAIN, 14));
		leftHeading.setAlignmentY(0.0f);
		leftHeading.setBounds(35, 11, 179, 96);
		headerPanel.add(leftHeading);
		
		JLabel h1 = new JLabel("?????????????????? ?????? ???????????? ?????? ?????? ????????????????????? ?????? ???????????????");
		h1.setHorizontalTextPosition(SwingConstants.CENTER);
		h1.setHorizontalAlignment(SwingConstants.CENTER);
		h1.setForeground(Color.WHITE);
		h1.setFont(new Font("Poppins", Font.BOLD, 22));
		h1.setAlignmentY(0.0f);
		h1.setBounds(262, 11, 376, 55);
		headerPanel.add(h1);
		
		JLabel h2 = new JLabel("MAHA VACCINATION DRIVE");
		h2.setHorizontalTextPosition(SwingConstants.CENTER);
		h2.setHorizontalAlignment(SwingConstants.CENTER);
		h2.setForeground(Color.WHITE);
		h2.setFont(new Font("Teko", Font.BOLD, 34));
		h2.setAlignmentY(0.0f);
		h2.setBounds(262, 57, 376, 50);
		headerPanel.add(h2);
		
		JLabel rightHeading = new JLabel("<HTML><p style=\"text-align:right\">\r\nJOIN <b>INDIA'S<BR>\r\nGLORIOUS </b>JOURNEY<BR>\r\nOF <b>200 CRORE</b><br>\r\nVACCINATIONS\r\n</p></HTML>");
		rightHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		rightHeading.setHorizontalAlignment(SwingConstants.RIGHT);
		rightHeading.setForeground(Color.WHITE);
		rightHeading.setFont(new Font("Euclid Circular A", Font.PLAIN, 14));
		rightHeading.setAlignmentY(0.0f);
		rightHeading.setBounds(685, 11, 179, 96);
		headerPanel.add(rightHeading);
		
		JLabel headerImg = new JLabel("");
		headerImg.setIcon(new ImageIcon(LoginPage.class.getResource("/com/mvd/resources/h1.jpg")));
		headerImg.setBounds(0, 0, 900, 118);
		headerPanel.add(headerImg);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBorder(new LineBorder(new Color(0, 51, 102), 3, true));
		registerPanel.setOpaque(false);
		registerPanel.setBounds(206, 202, 487, 312);
		contentPane.add(registerPanel);
		registerPanel.setFont(new Font("Product Sans", Font.PLAIN, 16));
		registerPanel.setBackground(new Color(135, 206, 235));
		registerPanel.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Euclid Circular A", Font.BOLD, 17));
		lblUsername.setBounds(118, 54, 105, 29);
		registerPanel.add(lblUsername);
		
		username = new JTextField();
		username.setFont(new Font("Euclid Circular A", Font.PLAIN, 15));
		username.setColumns(10);
		username.setBounds(118, 85, 249, 34);
		registerPanel.add(username);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Euclid Circular A", Font.BOLD, 17));
		lblPassword.setBounds(118, 130, 105, 29);
		registerPanel.add(lblPassword);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setFont(new Font("Euclid Circular A", Font.BOLD, 17));
		btnLogin.setBorderPainted(false);
		btnLogin.setBackground(new Color(0, 128, 0));
		btnLogin.setBounds(186, 237, 115, 42);
		registerPanel.add(btnLogin);
		
		password = new JPasswordField();
		password.setFont(new Font("Euclid Circular A", Font.PLAIN, 15));
		password.setBounds(118, 160, 249, 34);
		registerPanel.add(password);
		
		JLabel backgroundImg = new JLabel("");
		backgroundImg.setIcon(new ImageIcon(LoginPage.class.getResource("/com/mvd/resources/bg.png")));
		backgroundImg.setAlignmentY(0.0f);
		backgroundImg.setBounds(0, 0, 900, 600);
		contentPane.add(backgroundImg);
	}
}
