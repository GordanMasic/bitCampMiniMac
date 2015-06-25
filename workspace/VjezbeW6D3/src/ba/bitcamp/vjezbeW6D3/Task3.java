package ba.bitcamp.vjezbeW6D3;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Task3 extends JFrame {

	
	private static final long serialVersionUID = 1L;
	
	BorderLayout bl1 = new BorderLayout();
	JFrame window = new JFrame();
	JButton b1 = new JButton("Button1");
	JButton b2 = new JButton("Button2");
	JLabel l1 = new JLabel("Press one to enable the other...");
	int counter = 0;
	public Task3() {
		setVisible(true);
		setSize(400, 300);
		setLocationRelativeTo(null);
		add(b1, BorderLayout.NORTH);
		add(b2, BorderLayout.SOUTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l1.setFont(new Font("Cambria",NORMAL,18));
		l1.setHorizontalAlignment(JLabel.CENTER);
		add(l1);
		b2.setEnabled(false);
		b1.addActionListener(new Action());
		b2.addActionListener(new Action());
	}

	private class Action implements ActionListener {

		

		@Override
		public void actionPerformed(ActionEvent e) {
				if (e.getSource() == b1) {
					b1.setEnabled(false);
					b2.setEnabled(true);
					counter++;
					
				} else {
					b2.setEnabled(false);
					b1.setEnabled(true);
					counter++;
				}if(counter == 5){
					System.exit(3);
				}
			
		}

	}

	public static void main(String[] args) {
		new Task3();
	}
}
