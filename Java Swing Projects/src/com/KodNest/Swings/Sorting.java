package com.KodNest.Swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Sorting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sorting frame = new Sorting();
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
	public Sorting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 255, 212));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("SORTING");
		heading.setForeground(Color.RED);
		heading.setBounds(168, 11, 91, 24);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setBackground(new Color(192, 192, 192));
		contentPane.add(heading);

		JTextPane text1 = new JTextPane();
		text1.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 12));
		text1.setBounds(218, 71, 170, 24);
		contentPane.add(text1);

		JLabel label1 = new JLabel("Enter numbers to sort");
		label1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label1.setBounds(30, 74, 163, 21);
		contentPane.add(label1);

		JLabel label2 = new JLabel("Numbers after sorting");
		label2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		label2.setBounds(30, 135, 164, 21);
		contentPane.add(label2);

		JTextPane text2 = new JTextPane();
		text2.setFont(new Font("Microsoft YaHei Light", Font.PLAIN, 12));
		text2.setBounds(218, 132, 170, 24);
		contentPane.add(text2);

		JButton button = new JButton("BUBBLE SORT");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic of bubble sort
				String sentence = text1.getText();
				String arr[] = sentence.split(" ");

				String temp;
				String result = "";
				for (int i = 0; i <= arr.length - 2; i++) {
					for (int j = 0; j <= arr.length - 2 - i; j++) {
						if (Integer.valueOf(arr[j]) > Integer.valueOf(arr[j + 1])) {
							temp = arr[j];
							arr[j] = arr[j + 1];
							arr[j + 1] = temp;
						}
					}
				}

				for (int i = 0; i <= arr.length - 1; i++) {
					result = result + arr[i] + " ";
				}

				text2.setText(result);
			}
		});
		button.setFont(new Font("Arial", Font.BOLD, 14));
		button.setBackground(SystemColor.inactiveCaptionBorder);
		button.setBounds(153, 204, 141, 33);
		contentPane.add(button);
		
		JLabel lblNewLabel = new JLabel("(Give Space after each number)");
		lblNewLabel.setFont(new Font("Century Gothic", Font.BOLD, 12));
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setBounds(168, 106, 206, 14);
		contentPane.add(lblNewLabel);
	}
}
