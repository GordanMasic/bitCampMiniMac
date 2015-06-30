package ba.bitcamp.AnimationInFocus;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Main3 extends JFrame {

	private static final long serialVersionUID = -2325087134804108586L;

	JPanel panel = new MyPanel();
	private int x = 0;
	private int y = 0;

	private int deltaX = 1;
	private int deltaY = 1;

	public Main3() {
		add(panel);

		Timer t1 = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (y + 20 == panel.getHeight()-1) {
					deltaY = -1;
					x = x + deltaX;
					y = y + deltaY;
					panel.repaint();
				} else if (x + 20 == panel.getWidth()-1) {
					deltaX = -1;
					x = x + deltaX;
					y = y + deltaY;
					panel.repaint();
				} else if (x - 20 == -10) {
					deltaX = 1;
					x = x + deltaX;
					y = y + deltaY;
					panel.repaint();
				} else if (y - 20 == -10) {
					deltaY = 1;
					x = x + deltaX;
					y = y + deltaY;
					panel.repaint();
				} else {
					x = x + deltaX;
					y = y + deltaY;
					panel.repaint();
				}
				panel.repaint();
			}
		});

		t1.start();

		setTitle("Animation focus");
		setSize(400, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -2363661096616765877L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.fillRect(x, y, 20, 20);
			
		}

	}

	public static void main(String[] args) {
		new Main3();

	}

}
