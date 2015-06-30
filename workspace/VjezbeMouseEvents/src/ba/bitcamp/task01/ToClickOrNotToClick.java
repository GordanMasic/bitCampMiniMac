package ba.bitcamp.task01;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * This class creates JFrame window with text "Not clicked". When we click with
 * mouse, text changes into "It is clicked"
 * 
 * @author gordan.masic
 *
 */
public class ToClickOrNotToClick extends JFrame {

	private static final long serialVersionUID = -9178179494536848908L;

	private JLabel label = new JLabel("Not clicked");
	private Font font1 = new Font("Serif", Font.PLAIN, 35);
	private Font font2 = new Font("Monospaced", Font.BOLD, 40);

	public ToClickOrNotToClick() {
		setLayout(new BorderLayout());

		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(font1);
		add(label);

		label.addMouseListener(new MouseAction());
		
		
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MouseAction implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getSource() == label){
				label.setText("It is clicked!");
				label.setFont(font2);
				
			}
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	public static void main(String[] args) {
		new ToClickOrNotToClick();
	}
}
