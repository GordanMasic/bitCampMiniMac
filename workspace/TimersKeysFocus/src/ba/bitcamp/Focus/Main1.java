package ba.bitcamp.Focus;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main1 extends JFrame{

	
	private static final long serialVersionUID = -8285860444967309042L;

	private JLabel label = new JLabel("In focus");
	public Main1(){
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				label.setText("Not in fokus");
				label.repaint();
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				label.setText("Is in focus");
				label.repaint();
				
			}
		});
		setTitle("Focus");
		setSize(300, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Main1();
	}
}
