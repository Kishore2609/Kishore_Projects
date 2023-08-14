package com.KodNest.Swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reverse_String extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reverse_String frame = new Reverse_String();
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
	public Reverse_String() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("REVERSE STRING");
		heading.setBounds(126, 21, 167, 23);
		heading.setFont(new Font("Gill Sans MT", Font.BOLD, 19));
		heading.setForeground(new Color(255, 0, 0));
		contentPane.add(heading);

		JLabel label1 = new JLabel("Enter a String");
		label1.setBounds(64, 80, 105, 23);
		label1.setFont(new Font("Serif", Font.BOLD, 17));
		contentPane.add(label1);

		text1 = new JTextField();
		text1.setBounds(222, 80, 180, 29);
		text1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		contentPane.add(text1);
		text1.setColumns(10);

		JButton button = new JButton("Reverse String");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// String reverse logic
				String str = text1.getText();

				char arr1[] = str.toCharArray();
				char arr2[] = new char[arr1.length];
				int j = arr2.length - 1;

				for (int i = 0; i <= arr1.length - 1; i++) {
					arr2[j] = arr1[i];
					j--;
				}

				String str1 = new String(arr2);
				text2.setText(str1);
			}
		});
		button.setBounds(126, 148, 158, 29);
		button.setForeground(Color.BLUE);
		button.setFont(new Font("Georgia", Font.BOLD, 15));
		button.setBackground(SystemColor.control);
		contentPane.add(button);

		JLabel label2 = new JLabel("Reversed String ");
		label2.setBounds(46, 208, 123, 23);
		label2.setFont(new Font("Serif", Font.BOLD, 17));
		contentPane.add(label2);

		text2 = new JTextField();
		text2.setBounds(222, 208, 180, 29);
		text2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		text2.setColumns(10);
		contentPane.add(text2);
	}

}
