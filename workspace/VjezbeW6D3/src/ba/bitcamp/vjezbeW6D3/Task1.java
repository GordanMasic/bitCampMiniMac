package ba.bitcamp.vjezbeW6D3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class Task1 extends JFrame {

	private static final long serialVersionUID = 1L;
	BorderLayout bl1 = new BorderLayout();
	JFrame window = new JFrame();
	public Task1() {
		
		JLabel l1 = new JLabel("Hello world");
		setVisible(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Message");
		l1.setHorizontalAlignment(SwingConstants.CENTER);
		add(l1);
		JButton helloButton = new JButton("Hello!");
		helloButton.setSize(150, 50);
		add(helloButton, BorderLayout.SOUTH);
		helloButton.addActionListener(new Action());

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			JOptionPane.showMessageDialog(null, "Hello");
			System.exit(3);
		}

	}

	public static void main(String[] args) {
		new Task1();

	}

}
