package pack1;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BMI extends JFrame {

	private static final long serialVersionUID = 1L;
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
					BMI frame = new BMI();
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
	public BMI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 449, 364);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BODY MASS INDEX");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(21, 11, 303, 39);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER YOUR HEIGHT(in Meters):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(21, 78, 281, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENTER YOUR WEIGHT(in Kg):");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(21, 126, 281, 26);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("YOUR BMI:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(52, 177, 95, 20);
		contentPane.add(lblNewLabel_3);
		
		text1 = new JTextField();
		text1.setFont(new Font("Tahoma", Font.BOLD, 20));
		text1.setBounds(312, 70, 104, 33);
		contentPane.add(text1);
		text1.setColumns(10);
		
		text2 = new JTextField();
		text2.setFont(new Font("Tahoma", Font.BOLD, 20));
		text2.setBounds(312, 121, 104, 33);
		contentPane.add(text2);
		text2.setColumns(10);
		
		text3 = new JTextField();
		text3.setFont(new Font("Tahoma", Font.BOLD, 20));
		text3.setBounds(180, 166, 157, 39);
		contentPane.add(text3);
		text3.setColumns(10);
		
		JButton button1 = new JButton("Calculate BMI");
		button1.setForeground(new Color(0, 0, 255));
		button1.setBackground(new Color(240, 248, 255));
		button1.setFont(new Font("Tahoma", Font.BOLD, 12));
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double height = Double.parseDouble(text1.getText());
				double weight = Double.parseDouble(text2.getText());
				double BMI = weight / (height*height);
				
				String calbmi = String.format("%.2f", BMI);
				text3.setText(calbmi);
				
				if(BMI<=24.9)
				{
					text3.setOpaque(true);
					text3.setBackground(Color.GREEN);
					text3.setForeground(Color.BLACK);
				}
				else if(BMI<=29.9)
				{
					text3.setOpaque(true);
					text3.setBackground(Color.BLUE);
					text3.setForeground(Color.WHITE);
				}
				else if(BMI<=34.9)
				{
					text3.setOpaque(true);
					text3.setBackground(Color.YELLOW);
					text3.setForeground(Color.BLACK);
				}
				else if(BMI<=39.9)
				{
					text3.setOpaque(true);
					text3.setBackground(Color.CYAN);
					text3.setForeground(Color.BLUE);
				}
				else if(BMI>=40)
				{
					text3.setOpaque(true);
					text3.setBackground(Color.RED);
					text3.setForeground(Color.BLACK);
				}
			 }
		});
		button1.setBounds(21, 249, 139, 33);
		contentPane.add(button1);
		
		JButton button2 = new JButton("Reset");
		button2.setForeground(new Color(0, 0, 255));
		button2.setBackground(new Color(240, 248, 255));
		button2.setFont(new Font("Tahoma", Font.BOLD, 12));
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				text1.setText(null);
				text2.setText(null);
				text3.setText(null);
				text3.setBackground(Color.WHITE);
			}
		});
		button2.setBounds(170, 250, 120, 30);
		contentPane.add(button2);
		
		JButton button3 = new JButton("BMI Table");
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				new BMITable().setVisible(true);
			}
		});
		button3.setForeground(new Color(0, 0, 255));
		button3.setBackground(new Color(240, 248, 255));
		button3.setFont(new Font("Tahoma", Font.BOLD, 12));
		button3.setBounds(300, 250, 116, 30);
		contentPane.add(button3);
		
		JButton button4 = new JButton("Exit");
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		button4.setBackground(new Color(240, 248, 255));
		button4.setForeground(new Color(0, 0, 255));
		button4.setFont(new Font("Tahoma", Font.BOLD, 12));
		button4.setBounds(170, 291, 132, 26);
		contentPane.add(button4);
	}
}
