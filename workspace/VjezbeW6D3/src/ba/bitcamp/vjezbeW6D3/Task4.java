package ba.bitcamp.vjezbeW6D3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task4 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	BorderLayout bl1 = new BorderLayout();
	JFrame window = new JFrame();
	JButton b1 = new JButton("Button");
	JLabel l1 = new JLabel("Don't press this button!");
	int counter = 0;

	public Task4() {

		setVisible(true);
		setSize(600, 400);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(new Font("TimesNewRoman", NORMAL, 20));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(l1);
		b1.addActionListener(new Action());
		add(b1, BorderLayout.SOUTH);

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			if (e.getSource() == b1) {
				counter++;
				switch (counter) {
				case 1:
					l1.setText("I told you not to press it!");
					
					break;
				case 2:
					l1.setText("Look it's simple. Don't press this button!");
					
					break;
				case 3:
					l1.setText("Stupid human!Don't press this button!");
					break;
				default:
					l1.setText("Don't press this button!");
					
				}

			}
			if (counter > 3) {
				counter = 0;
			}

		}

	}

	public static void main(String[] args) {
		new Task4();
	}
}
