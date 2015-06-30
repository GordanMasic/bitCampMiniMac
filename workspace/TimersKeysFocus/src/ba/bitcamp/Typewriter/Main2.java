package ba.bitcamp.Typewriter;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main2 extends JFrame {

	private static final long serialVersionUID = -2701029928031741006L;

	private JLabel label = new JLabel();

	public Main2() {
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				String s = "";
				if (e.getKeyChar() == KeyEvent.VK_BACK_SPACE) {
					for (int i = 0; i < label.getText().length(); i++) {
						s = label.getText().substring(0, i);
					}
					label.setText("" + s);
					label.repaint();
				} else {
					label.setText(label.getText() + e.getKeyChar());
					label.repaint();
				}

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {

			}
		});

		setTitle("Typewriter");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		new Main2();
	}

}
