import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main extends JFrame {

	
	private static final long serialVersionUID = -6544727963345200232L;
	
	private JButton[] buttons = new JButton[9];
	private String[] textOnButtons = new String[] { "1", "2", "3", "4", "5",
			"6", "7", "8", "9" };

	private int sum = 0;
	private int counter = 0;

	public Main() {
		setLayout(new GridLayout(3, 3));

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(textOnButtons[i]);
			buttons[i].addActionListener(new Action());
			buttons[i].setFont(new Font("Arial", Font.PLAIN, 50));
			add(buttons[i]);
		}

		setTitle("Calculator");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (counter <= 1) {
				for (int i = 0; i < buttons.length; i++) {
					if (e.getSource() == buttons[i]) {
						sum += Integer.parseInt(buttons[i].getText());
					}
				}
				counter++;

			}
			if (counter == 2) {
				JOptionPane.showMessageDialog(null, sum);
				sum = 0;
				counter = 0;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
