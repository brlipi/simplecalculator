import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

/*
 * Testado com Eclipse Java Oxygen.3A, utilizando a biblioteca "jre1.8.0_181".
 */
public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField display;

	double firstnum;
	double secondnum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		display = new JTextField();
		contentPane.add(display, BorderLayout.NORTH);
		display.setColumns(10);

		JButton button_equals = new JButton("=");
		button_equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				secondnum = Double.parseDouble(display.getText());
				if (operations == "+") {
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if (operations == "-") {
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if (operations == "*") {
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
				else if (operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					display.setText(answer);
				}
			}
		});
		contentPane.add(button_equals, BorderLayout.SOUTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 0, 0));

		JButton button_1 = new JButton("1");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = display.getText() + button_1.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_1);

		JButton button_2 = new JButton("2");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_2.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_2);

		JButton button_3 = new JButton("3");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_3.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_3);

		JButton button_plus = new JButton("+");
		button_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(display.getText());
				display.setText("");
				operations = "+";
			}
		});
		panel.add(button_plus);

		JButton button_4 = new JButton("4");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_4.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_4);

		JButton button_5 = new JButton("5");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_5.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_5);

		JButton button_6 = new JButton("6");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_6.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_6);

		JButton button_minus = new JButton("-");
		button_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(display.getText());
				display.setText("");
				operations = "-";
			}
		});
		panel.add(button_minus);

		JButton button_7 = new JButton("7");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_7.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_7);

		JButton button_8 = new JButton("8");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_8.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_8);

		JButton button_9 = new JButton("9");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_9.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_9);

		JButton button_mult = new JButton("*");
		button_mult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(display.getText());
				display.setText("");
				operations = "*";
			}
		});
		panel.add(button_mult);

		JButton button_dot = new JButton(".");
		button_dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(! display.getText().contains("."))
		          {
		          display.setText(display.getText() + button_dot.getText());
		          }
			}
		});
		panel.add(button_dot);

		JButton button_0 = new JButton("0");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = display.getText() + button_0.getText();
				display.setText(EnterNumber );
			}
		});
		panel.add(button_0);

		JButton button_clear = new JButton("C");
		button_clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(null);
			}
		});
		panel.add(button_clear);

		JButton button_div = new JButton("/");
		button_div.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum = Double.parseDouble(display.getText());
				display.setText("");
				operations = "/";
			}
		});
		panel.add(button_div);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
