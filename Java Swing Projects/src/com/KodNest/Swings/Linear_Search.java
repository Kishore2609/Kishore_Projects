package com.KodNest.Swings;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Linear_Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Linear_Search frame = new Linear_Search();
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
	public Linear_Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 182, 193));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("LINEAR SEARCH");
		heading.setBounds(129, 11, 161, 24);
		heading.setForeground(Color.BLUE);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		contentPane.add(heading);

		JLabel label1 = new JLabel("Enter 5 Numbers");
		label1.setBounds(44, 66, 125, 19);
		label1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label1.setBackground(new Color(128, 128, 128));
		contentPane.add(label1);

		JLabel label2 = new JLabel("Enter Key to Search");
		label2.setBounds(20, 124, 149, 19);
		label2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		label2.setBackground(new Color(0, 0, 139));
		contentPane.add(label2);

		JTextArea text1 = new JTextArea();
		text1.setBounds(214, 65, 187, 24);
		text1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		contentPane.add(text1);

		JTextArea text2 = new JTextArea();
		text2.setBounds(214, 123, 187, 24);
		text2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		contentPane.add(text2);

		JTextArea text3 = new JTextArea();
		text3.setBounds(214, 178, 187, 24);
		text3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(text3);

		JButton button = new JButton("Linear Search");
		button.setBounds(155, 230, 135, 27);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for Linear Search
				String sentence = text1.getText();
				String arr[] = sentence.split(" ");

				String key = text2.getText();

				for (int i = 0; i <= arr.length - 1; i++) {
					if (Integer.valueOf(key) != Integer.valueOf(arr[i])) {
						text3.setText("Key not Found!");
					}
				}

				for (int i = 0; i <= arr.length - 1; i++) {
					if (Integer.valueOf(key) == Integer.valueOf(arr[i])) {
						text3.setText("Search success Key @ " + String.valueOf(i));
					}
				}

			}
		});
		button.setBackground(UIManager.getColor("CheckBox.background"));
		button.setFont(new Font("SansSerif", Font.BOLD, 14));
		contentPane.add(button);

		JLabel label3 = new JLabel("RESULT");
		label3.setBounds(124, 179, 57, 19);
		label3.setForeground(new Color(178, 34, 34));
		label3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		contentPane.add(label3);

	}
}
