package prog;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Accounting5 {
	private JFrame frame;
	private JTextField textField;
	private JButton btnplus;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btnminus;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btnproduct;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btndivise;
	private JButton btnresult;
	private JButton btn0;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	private JButton btnadd;

	/**
	 * Launch the application.
	 */
	public void Screen4() {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Accounting5 window = new Accounting5();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accounting5() {
		initialize();
		calculator_button();
		answer();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(188, 143, 143));
		frame.setBounds(100, 100, 405, 520);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("\uF0E7");
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 14));
		btnNewButton.setBounds(10, 10, 61, 38);
		frame.getContentPane().add(btnNewButton);

		textField = new JTextField();
		textField.setFont(new Font("·L³n¥¿¶ÂÅé", Font.BOLD, 18));
		textField.setBounds(70, 77, 257, 38);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnB = new JButton("\uF0E7");
		btnB.setBackground(new Color(255, 245, 238));
		btnB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				if (textField.getText().length() > 0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length() - 1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnB.setBounds(70, 170, 65, 72);
		btnB.setFont(new Font("windings", Font.BOLD, 18));
		frame.getContentPane().add(btnB);
	}
	public void calculator_button() {
		btn0 = new JButton("0");
		btn0.setBackground(new Color(255, 245, 238));
		btn0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(134, 170, 65, 72);
		btn0.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn0);
		
		
		
		btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Accounting2 mytest = new Accounting2();
				String text=textField.getText().toString();
				frame.setVisible(false);
			}
		});
		btnadd.setFont(new Font("Dialog", Font.BOLD, 14));
		btnadd.setBackground(new Color(255, 250, 250));
		btnadd.setBounds(285, 10, 74, 38);
		frame.getContentPane().add(btnadd);
		btnplus = new JButton("+");
		btnplus.setBackground(new Color(255, 245, 238));
		btnplus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		btnplus.setBounds(262, 170, 65, 72);
		btnplus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btnplus);

		btn7 = new JButton("7");
		btn7.setBackground(new Color(255, 245, 238));
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(70, 241, 65, 65);
		btn7.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn7);

		btn8 = new JButton("8");
		btn8.setBackground(new Color(255, 245, 238));
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(134, 241, 65, 65);
		btn8.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn8);

		btn9 = new JButton("9");
		btn9.setBackground(new Color(255, 245, 238));
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(198, 241, 65, 65);
		btn9.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn9);

		btnminus = new JButton("-");
		btnminus.setBackground(new Color(255, 245, 238));
		btnminus.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnminus.setBounds(262, 241, 65, 65);
		btnminus.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btnminus);

		btn4 = new JButton("4");
		btn4.setBackground(new Color(255, 245, 238));
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(70, 305, 65, 65);
		btn4.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn4);

		btn5 = new JButton("5");
		btn5.setBackground(new Color(255, 245, 238));
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(134, 305, 65, 65);
		btn5.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn5);

		btn6 = new JButton("6");
		btn6.setBackground(new Color(255, 245, 238));
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(198, 305, 65, 65);
		btn6.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn6);

		btnproduct = new JButton("*");
		btnproduct.setBackground(new Color(255, 245, 238));
		btnproduct.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnproduct.setBounds(262, 305, 65, 65);
		btnproduct.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btnproduct);

		btn1 = new JButton("1");
		btn1.setBackground(new Color(255, 245, 238));
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(70, 370, 65, 65);
		btn1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn1);
		btn2 = new JButton("2");
		btn2.setBackground(new Color(255, 245, 238));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(134, 370, 65, 65);
		btn2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn2);

		btn3 = new JButton("3");
		btn3.setBackground(new Color(255, 245, 238));
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(198, 370, 65, 65);
		btn3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btn3);

		btndivise = new JButton("/");
		btndivise.setBackground(new Color(255, 245, 238));
		btndivise.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				first = Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btndivise.setBounds(262, 370, 65, 65);
		btndivise.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btndivise);

	}
	public void answer() {
		btnresult = new JButton("=");
		btnresult.setBackground(new Color(255, 245, 238));
		btnresult.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if (operation == "+") {
					result = first + second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "-") {
					result = first - second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "*") {
					result = first * second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				} else if (operation == "/") {
					result = first / second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				if (operation == "%") {
					result = first % second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}

			}
		});
		btnresult.setBounds(198, 170, 65, 72);
		btnresult.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		frame.getContentPane().add(btnresult);
	}

	

	
}
