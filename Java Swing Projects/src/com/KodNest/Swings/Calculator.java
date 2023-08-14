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
import javax.swing.SwingConstants;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField text1;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setTitle("Calculator App");
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(120, 120, 480, 320);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(8, 8, 8, 8));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel heading = new JLabel("CALCULATOR");
		heading.setBounds(137, 23, 139, 24);
		heading.setFont(new Font("Times New Roman", Font.BOLD, 20));
		heading.setForeground(Color.WHITE);
		contentPane.add(heading);

		JLabel input1 = new JLabel("Input 1 ");
		input1.setBounds(100, 80, 41, 16);
		input1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		input1.setForeground(Color.WHITE);
		contentPane.add(input1);

		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text1.setBounds(156, 74, 120, 26);
		contentPane.add(text1);
		text1.setColumns(10);

		JLabel input2 = new JLabel("Input 2");
		input2.setBounds(100, 131, 38, 16);
		input2.setForeground(Color.WHITE);
		input2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		contentPane.add(input2);

		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text2.setBounds(156, 125, 120, 26);
		contentPane.add(text2);
		text2.setColumns(10);

		JLabel result = new JLabel("RESULT");
		result.setBounds(76, 183, 70, 17);
		result.setFont(new Font("Times New Roman", Font.BOLD, 15));
		result.setForeground(Color.YELLOW);
		contentPane.add(result);

		text3 = new JTextField();
		text3.setFont(new Font("Times New Roman", Font.BOLD, 16));
		text3.setBounds(156, 178, 120, 26);
		text3.setBackground(new Color(240, 255, 240));
		contentPane.add(text3);
		text3.setColumns(10);

		JButton add = new JButton("ADD");
		add.setBounds(10, 239, 70, 27);
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic of addition
				String data1 = text1.getText();
				String data2 = text2.getText();

				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);

				int res = var1 + var2;
				String result = String.valueOf(res);
				text3.setText(result);

			}
		});
		add.setBackground(UIManager.getColor("Button.light"));
		add.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		contentPane.add(add);

		JButton sub = new JButton("SUB");
		sub.setBounds(106, 239, 70, 27);
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic of subtract
				String data1 = text1.getText();
				String data2 = text2.getText();

				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);

				int res = var1 - var2;
				String result = String.valueOf(res);
				text3.setText(result);
			}
		});
		sub.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		sub.setBackground(SystemColor.controlHighlight);
		contentPane.add(sub);

		JButton mul = new JButton("MUL");
		mul.setBounds(197, 239, 70, 27);
		mul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic of multiplication
				String data1 = text1.getText();
				String data2 = text2.getText();

				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);

				int res = var1 * var2;
				String result = String.valueOf(res);
				text3.setText(result);

			}
		});
		mul.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		mul.setBackground(SystemColor.controlHighlight);
		contentPane.add(mul);

		JButton div = new JButton("DIV");
		div.setBounds(283, 239, 64, 27);
		div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic to division
				String data1 = text1.getText();
				String data2 = text2.getText();

				Float var1 = Float.valueOf(data1);
				Float var2 = Float.valueOf(data2);

				Float res = var1 / var2;
				String result = String.valueOf(res);
				text3.setText(result);

			}
		});
		div.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		div.setBackground(SystemColor.controlHighlight);
		contentPane.add(div);

		JButton rem = new JButton("REM");
		rem.setBounds(367, 239, 70, 27);
		rem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic to divide and find reminder
				String data1 = text1.getText();
				String data2 = text2.getText();

				int var1 = Integer.valueOf(data1);
				int var2 = Integer.valueOf(data2);

				int res = var1 % var2;
				String result = String.valueOf(res);
				text3.setText(result);

			}
		});
		rem.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		rem.setBackground(SystemColor.controlHighlight);
		contentPane.add(rem);

		JButton clear = new JButton("CLEAR");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// logic to reset
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
			}
		});
		clear.setHorizontalAlignment(SwingConstants.LEFT);
		clear.setBackground(SystemColor.inactiveCaptionBorder);
		clear.setFont(new Font("Calibri", Font.BOLD, 13));
		clear.setBounds(300, 182, 70, 24);
		contentPane.add(clear);

	}
}
