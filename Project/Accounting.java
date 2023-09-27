package prog;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class Accounting {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accounting window = new Accounting();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Accounting() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(188, 143, 143));
		frame.setBounds(100, 100, 405, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("list");
		btnNewButton.setBounds(128, 82, 109, 55);
		setting(frame, btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accounting2 s1 = new Accounting2();
				s1.Screen1();
			}
		});
		JButton btnNewButton_1 = new JButton("reminder");
		btnNewButton_1.setBounds(110, 164, 144, 55);
		setting(frame, btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UIManager.put("OptionPane.background", new ColorUIResource(250, 240, 230));
				UIManager.put("Panel.background", new ColorUIResource(250, 240, 230));
				UIManager.put("OptionPane.buttonFont",
						new FontUIResource(new Font("MS Reference Sans Serif", Font.ITALIC, 13)));
				UIManager.put("OptionPane.messageFont",
						new FontUIResource(new Font("MS Reference Sans Serif", Font.ITALIC, 13)));
				String budget = JOptionPane.showInputDialog(btnNewButton_1, "Please input a budget:");
				JOptionPane.showMessageDialog(btnNewButton_1, "You enter: " + budget);
				int a = 0;
				int b = 0;
				int c = 0;
				int d = 0;
				int f = 0;
				String filePath = "hello\\data1.txt";
				File file = new File(filePath);
				Scanner scanner;
				try {
					scanner = new Scanner(file);// read line by line

					// process each line
					String line = scanner.nextLine();
					String line2 = scanner.nextLine();
					String line3 = scanner.nextLine();
					String line4 = scanner.nextLine();
					String line5 = scanner.nextLine();
					System.out.println(line);
					System.out.println(line2);
					a = Integer.parseInt(line);
					b = Integer.parseInt(line2);
					c = Integer.parseInt(line3);
					f = Integer.parseInt(line5);

					scanner.close();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				int budget2 = Integer.parseInt(budget);

				String filePath1 = "hello\\data2.txt";
				File file1 = new File(filePath1);
				try {
					FileWriter fw = new FileWriter(file1);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(budget);
					bw.close();
					fw.close();
				} catch (IOException ex) {

				}
				int budget666 = 0;
				String filePath11 = "hello\\data2.txt";
				File file11 = new File(filePath11);
				try {
					scanner = new Scanner(file11);// read line by line

					// process each line
					String linea = scanner.nextLine();
					budget666 = Integer.parseInt(linea);
					scanner.close();

				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (budget == null) {
				} else {
					if (f > budget666) {
						int res = JOptionPane.showConfirmDialog(btnNewButton_1, "Your settlement is larger than budget",
								null, JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		JButton btnNewButton_2 = new JButton("graph analysis");
		btnNewButton_2.setBounds(85, 248, 191, 55);
		setting(frame, btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accounting4 s3 = new Accounting4();
				s3.Screen3();
			}
		});

		JLabel lblNewLabel = new JLabel("Home page");
		lblNewLabel.setFont(new Font("Sitka Small", Font.ITALIC, 20));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(129, 42, 126, 49);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/mo.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(-12, 10, 299, 60);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("");
		img = new ImageIcon(this.getClass().getResource("/mp.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(70, 229, 261, 331);
		frame.getContentPane().add(lblNewLabel_2);

	}

	private static void setting(JFrame frame, JButton btnNewButton) {
		btnNewButton.setForeground(new Color(51, 51, 102));
		btnNewButton.setBackground(new Color(255, 250, 250));
		btnNewButton.setFont(new Font("Sitka Small", Font.BOLD, 15));
		btnNewButton.setBorder(new RoundedBorder(30));
		btnNewButton.setOpaque(false);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setForeground(new Color(255, 250, 250));
		btnNewButton.setContentAreaFilled(true);
		frame.getContentPane().add(btnNewButton);
	}

	private static class RoundedBorder implements Border {

		private int radius;

		RoundedBorder(int radius) {
			this.radius = radius;
		}

		public Insets getBorderInsets(Component c) {
			return new Insets(this.radius + 1, this.radius + 1, this.radius + 2, this.radius);
		}

		public boolean isBorderOpaque() {
			return true;
		}

		public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
			g.drawRoundRect(x, y, width - 1, height - 1, radius, radius);
		}
	}
}
