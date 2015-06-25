package ba.bitcamp.vjezbeW6D3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task5 extends JFrame {

	private static final long serialVersionUID = 1L;

	BorderLayout bl1 = new BorderLayout();
	JFrame window = new JFrame();
	String s = "_xample Sentence";
	JLabel l1 = new JLabel(s);
	JButton left = new JButton("<");
	JButton right = new JButton(">");
	JButton remove = new JButton("Remove");
	int index = 0;
	

	public Task5() {
		setVisible(true);
		setSize(700, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setFont(new Font("TimesNewRoman", NORMAL, 20));
		add(l1);

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == left) {
				for (int i = 0; i < s.length(); i++) {

				}
			}

		}

	}

	public static void main(String[] args) {
		new Task5();
	}
}
