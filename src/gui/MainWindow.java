package gui;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MainWindow {

	private JFrame frame;
	private JTextField textInput1;
	private JTextField textInput2;
	private JTextField textOutput;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 466, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(10, 285, 101, 30);
		frame.getContentPane().add(btnDivide);

		textInput1 = new JTextField();
		textInput1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textInput1.setBounds(10, 28, 66, 42);
		frame.getContentPane().add(textInput1);
		textInput1.setColumns(10);

		textInput2 = new JTextField();
		textInput2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textInput2.setBounds(10, 80, 66, 42);
		frame.getContentPane().add(textInput2);
		textInput2.setColumns(10);

		JButton btnMultiply = new JButton("x");
		btnMultiply.addActionListener((e) -> textOutput.setText(String.valueOf(numbers()[0] * numbers()[1])));
		btnMultiply.setBounds(10, 232, 101, 30);
		frame.getContentPane().add(btnMultiply);

		JButton btnSubtract = new JButton("-");
		btnSubtract.setBounds(10, 192, 101, 30);
		frame.getContentPane().add(btnSubtract);

		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener((e) -> textOutput.setText(String.valueOf(numbers()[0] + numbers()[1])));
		btnAdd.setBounds(10, 143, 101, 30);
		frame.getContentPane().add(btnAdd);

		textOutput = new JTextField();
		textOutput.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textOutput.setBounds(105, 39, 196, 67);
		frame.getContentPane().add(textOutput);
		textOutput.setColumns(10);
	}

	public double[] numbers() {
		double[] values = { Double.parseDouble(textInput1.getText()), Double.parseDouble(textInput2.getText()) };
		return values;
	}
}
