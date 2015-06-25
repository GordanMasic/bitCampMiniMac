package ba.bitcamp.vjezbeW6D3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Task2 extends JFrame {

	private static final long serialVersionUID = 1L;

	BorderLayout bl1 = new BorderLayout();
	JFrame window = new JFrame();
	JLabel l1 = new JLabel("Choose one");
	JButton exitButton = new JButton("Exit");
	JButton doNotExitButton = new JButton("Don't exit");

	public Task2() {

		setVisible(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Task2");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		add(l1);

		add(exitButton, BorderLayout.SOUTH);
		exitButton.addActionListener(new Action());
		add(doNotExitButton, BorderLayout.NORTH);
		doNotExitButton.addActionListener(new Action());
	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == exitButton) {
				System.exit(3);
			} else {
				l1.setText("It didn't exit");
			}

		}

	}

	public static void main(String[] args) {
		new Task2();
	}
}