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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Binary_Search extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Binary_Search frame = new Binary_Search();
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
	public Binary_Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 320);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("BINARY SEARCH");
		heading.setBounds(141, 22, 158, 22);
		heading.setForeground(new Color(199, 21, 133));
		heading.setFont(new Font("Times New Roman", Font.BOLD, 19));
		contentPane.add(heading);

		JLabel label1 = new JLabel("Enter 5 Numbers");
		label1.setBounds(75, 86, 119, 20);
		label1.setFont(new Font("SansSerif", Font.BOLD, 15));
		label1.setForeground(new Color(153, 0, 0));
		contentPane.add(label1);

		JLabel label2 = new JLabel("Enter Key to Search");
		label2.setBounds(52, 132, 142, 20);
		label2.setForeground(new Color(153, 0, 0));
		label2.setFont(new Font("SansSerif", Font.BOLD, 15));
		contentPane.add(label2);

		JLabel label3 = new JLabel("RESULT");
		label3.setBounds(133, 186, 61, 22);
		label3.setForeground(Color.RED);
		label3.setFont(new Font("Microsoft Tai Le", Font.BOLD, 17));
		contentPane.add(label3);

		JTextArea text1 = new JTextArea();
		text1.setBounds(241, 86, 179, 22);
		text1.setFont(new Font("Monospaced", Font.PLAIN, 15));
		contentPane.add(text1);

		JTextArea text2 = new JTextArea();
		text2.setBounds(241, 132, 179, 22);
		text2.setFont(new Font("Monospaced", Font.PLAIN, 15));
		contentPane.add(text2);

		JTextArea text3 = new JTextArea();
		text3.setBounds(241, 186, 179, 22);
		text3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		contentPane.add(text3);

		JButton button = new JButton("Binary Search");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic for binary search
				String data1 = text1.getText();
				String arr[] = data1.split(" ");

				String key = text2.getText();

				int low = 0;
				int high = arr.length - 1;

				while (low <= high) {
					int mid = (low + high) / 2;
					if (Integer.valueOf(key) == Integer.valueOf(arr[mid])) {
						text3.setText("Search success Key @ : " + String.valueOf(mid));
					} else if (Integer.valueOf(key) > Integer.valueOf(arr[mid])) {
						low = mid + 1;
						high = high;
					} else {
						high = mid - 1;
						low = low;
					}
				}
				text3.setText("Key not Found!");
			}
		});
		button.setBackground(SystemColor.control);
		button.setBounds(158, 231, 141, 27);
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		contentPane.add(button);
	}

}
