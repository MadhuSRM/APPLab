package com.srm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameDemo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField number1text;
	private JTextField number2text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameDemo frame = new FrameDemo();
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
	public FrameDemo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel number1Label = new JLabel("Enter Number 1");
		number1Label.setFont(new Font("Calibri", Font.BOLD, 20));
		number1Label.setBounds(77, 87, 132, 41);
		contentPane.add(number1Label);
		
		JLabel number2Label = new JLabel("Enter Number 2");
		number2Label.setFont(new Font("Calibri", Font.BOLD, 20));
		number2Label.setBounds(77, 164, 132, 21);
		contentPane.add(number2Label);
		
		number1text = new JTextField();
		number1text.setBounds(282, 97, 96, 19);
		contentPane.add(number1text);
		number1text.setColumns(10);
		
		number2text = new JTextField();
		number2text.setBounds(282, 166, 96, 19);
		contentPane.add(number2text);
		number2text.setColumns(10);
		
		JButton calculateButton = new JButton("Calculate");
		calculateButton.setFont(new Font("Tahoma", Font.PLAIN, 20));
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(number1text.getText());
				int n2 = Integer.parseInt(number2text.getText());
				int result = n1+n2;
				JOptionPane.showMessageDialog(null, "Result: " + result);
			}
		});
		calculateButton.setBounds(94, 266, 132, 33);
		contentPane.add(calculateButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number1text.setText("");
				number2text.setText("");
			}
		});
		btnNewButton_1.setBounds(351, 266, 85, 33);
		contentPane.add(btnNewButton_1);
	}
}
