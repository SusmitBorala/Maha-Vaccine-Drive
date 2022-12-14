package com.mvd.service;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomePage extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setLocationRelativeTo(null);		// To set the frame at the center of screen
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public HomePage() {
		setBackground(new Color(240, 230, 140));
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
		
		JPanel headerPanel = new JPanel();
		headerPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
		headerPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		headerPanel.setBackground(new Color(238, 232, 170));
		headerPanel.setBounds(0, 0, 900, 118);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel closeLabel = new JLabel("");
		closeLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		closeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		closeLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				dispose();
			}
		});
		closeLabel.setIcon(new ImageIcon(HomePage.class.getResource("/com/mvd/resources/exitButton.png")));
		closeLabel.setBounds(872, 3, 25, 25);
		headerPanel.add(closeLabel);
		
		JLabel leftHeading = new JLabel("<HTML>\r\nMINISTRY OF <BR>\r\n<b>HEALTH </b> AND <BR>\r\n<b>FAMILY WELFARE</b><br>\r\nGOVERNMENT OF INDIA\r\n</HTML>");
		leftHeading.setAlignmentY(Component.TOP_ALIGNMENT);
		leftHeading.setForeground(Color.WHITE);
		leftHeading.setHorizontalTextPosition(SwingConstants.CENTER);
		leftHeading.setHorizontalAlignment(SwingConstants.LEFT);
		leftHeading.setBounds(35, 11, 179, 96);
		leftHeading.setFont(new Font("Euclid Circular A", Font.PLAIN, 14));
		headerPanel.add(leftHeading);
		
		JLabel h1 = new JLabel("?????????????????? ?????? ???????????? ?????? ?????? ????????????????????? ?????? ???????????????");
		h1.setAlignmentY(Component.TOP_ALIGNMENT);
		h1.setForeground(Color.WHITE);
		h1.setHorizontalTextPosition(SwingConstants.CENTER);
		h1.setHorizontalAlignment(SwingConstants.CENTER);
		h1.setFont(new Font("Poppins", Font.BOLD, 22));
		h1.setBounds(262, 11, 376, 55);
		headerPanel.add(h1);
		
		JLabel h2 = new JLabel("MAHA VACCINATION DRIVE");
		h2.setAlignmentY(Component.TOP_ALIGNMENT);
		h2.setForeground(Color.WHITE);
		h2.setHorizontalTextPosition(SwingConstants.CENTER);
		h2.setHorizontalAlignment(SwingConstants.CENTER);
		h2.setFont(new Font("Teko", Font.BOLD, 34));
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
		headerImg.setBounds(0, 0, 900, 118);
		headerPanel.add(headerImg);
		headerImg.setIcon(new ImageIcon(HomePage.class.getResource("/com/mvd/resources/h1.jpg")));
		
		JButton login = new JButton("LOGIN");
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setFocusable(false);
		login.setAlignmentY(Component.TOP_ALIGNMENT);
		login.setHorizontalTextPosition(SwingConstants.CENTER);
		login.setForeground(new Color(255, 255, 255));
		login.setBorderPainted(false);
		login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		login.setFont(new Font("Teko", Font.BOLD, 19));
		login.setBorder(null);
		login.setBackground(new Color(0, 51, 102));
		login.setBounds(531, 146, 113, 46);
		contentPane.add(login);
		
		JButton register = new JButton("REGISTER");
		register.setAlignmentY(Component.TOP_ALIGNMENT);
		register.setFocusable(false);
		register.setForeground(new Color(255, 255, 255));
		register.setBorder(null);
		register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register.setHorizontalTextPosition(SwingConstants.CENTER);
		register.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();
				rp.setVisible(true);
				setVisible(false);
			}
		});
		register.setFont(new Font("Teko", Font.BOLD, 19));
		register.setBorderPainted(false);
		register.setBackground(new Color(0, 51, 102));
		register.setBounds(654, 146, 113, 46);
		contentPane.add(register);
		
		JLabel indiaMap = new JLabel("");
		indiaMap.setAlignmentY(Component.TOP_ALIGNMENT);
		indiaMap.setIcon(new ImageIcon(HomePage.class.getResource("/com/mvd/resources/indiaMap.png")));
		indiaMap.setBounds(54, 146, 415, 445);
		getContentPane().add(indiaMap);
		
		JLabel quote = new JLabel("<html><center>\r\nIndia is set to defeat Covid-19.\r\n<br>\r\nEvery Indian is making it possible.\r\n<br>\r\n<strong>PM Narendra Modi<strong>\r\n</center></html>");
		quote.setAlignmentY(Component.TOP_ALIGNMENT);
		quote.setHorizontalTextPosition(SwingConstants.CENTER);
		quote.setHorizontalAlignment(SwingConstants.CENTER);
		quote.setVerticalAlignment(SwingConstants.TOP);
		quote.setFont(new Font("Poppins Medium", Font.PLAIN, 18));
		quote.setBounds(461, 475, 377, 100);
		contentPane.add(quote);
		
		JLabel pmImg = new JLabel("New label");
		pmImg.setAlignmentY(Component.TOP_ALIGNMENT);
		pmImg.setIcon(new ImageIcon(HomePage.class.getResource("/com/mvd/resources/pmModi.png")));
		pmImg.setBounds(531, 228, 236, 236);
		contentPane.add(pmImg);
		
		JLabel backgroundImg = new JLabel("");
		backgroundImg.setAlignmentY(Component.TOP_ALIGNMENT);
		backgroundImg.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		backgroundImg.setIcon(new ImageIcon(HomePage.class.getResource("/com/mvd/resources/bg.png")));
		backgroundImg.setBounds(0, 0, 900, 600);
		getContentPane().add(backgroundImg);
	}
}
