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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reverse_Word extends JFrame {

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
					Reverse_Word frame = new Reverse_Word();
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
	public Reverse_Word() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("REVERSE WORDS OF SENTENCE");
		heading.setBounds(71, 21, 281, 21);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 18));
		heading.setForeground(new Color(0, 100, 0));
		contentPane.add(heading);

		JLabel label1 = new JLabel("Enter a Sentence");
		label1.setBounds(44, 83, 130, 21);
		label1.setFont(new Font("SansSerif", Font.BOLD, 16));
		label1.setForeground(new Color(0, 0, 128));
		contentPane.add(label1);

		text1 = new JTextField();
		text1.setBounds(210, 81, 224, 29);
		text1.setFont(new Font("Serif", Font.PLAIN, 15));
		contentPane.add(text1);
		text1.setColumns(10);

		text2 = new JTextField();
		text2.setBounds(210, 207, 218, 29);
		text2.setFont(new Font("Serif", Font.BOLD, 15));
		text2.setColumns(10);
		contentPane.add(text2);

		JButton button = new JButton("Reverse Sentence");
		button.setBounds(137, 142, 186, 29);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic to reverse
				String data1 = text1.getText();
				String arr[] = data1.split(" ");
				String revsent = "";

				for (int i = 0; i <= arr.length - 1; i++) {
					String word = arr[i];
					String revword = "";
					for (int j = word.length() - 1; j >= 0; j--) {
						revword = revword + word.charAt(j);
					}
					revsent = revsent + revword + " ";
				}
				text2.setText(revsent);
			}

		});
		button.setForeground(new Color(139, 69, 19));
		button.setBackground(new Color(152, 251, 152));
		button.setFont(new Font("SansSerif", Font.BOLD, 16));
		contentPane.add(button);

		JLabel label2 = new JLabel("Reversed Sentence");
		label2.setBounds(44, 208, 149, 21);
		label2.setForeground(new Color(0, 0, 128));
		label2.setFont(new Font("SansSerif", Font.BOLD, 16));
		contentPane.add(label2);

	}

}
