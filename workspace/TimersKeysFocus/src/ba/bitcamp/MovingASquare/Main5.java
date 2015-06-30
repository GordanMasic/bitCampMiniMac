package ba.bitcamp.MovingASquare;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main5 extends JFrame {

	private static final long serialVersionUID = 3475316978439875252L;

	JPanel panel = new MyPanel();
	private int x = 0;
	private int y = 0;
	private int deltaX = 0;
	private int deltaY = 0;

	public Main5() {

		add(panel);
		addKeyListener(new Key());
		setTitle("Moving a square");
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

	private class Key implements KeyListener {

		@Override
		public void keyTyped(KeyEvent e) {

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyPressed(KeyEvent e) {

			if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//				deltaX = 5;
//				deltaY = 0;
//				x = x + deltaX;
//				y = y + deltaY;
				x++;
				
			} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
				deltaX = -5;
				deltaY = 0;
				x = x + deltaX;
				y = y + deltaY;
				
			} else if (e.getKeyCode() == KeyEvent.VK_UP) {
				deltaX = 0;
				deltaY = -5;
				x = x + deltaX;
				y = y + deltaY;
				
			} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
				deltaX = 0;
				deltaY = +5;
				x = x + deltaX;
				y = y + deltaY;
			
			}
			panel.repaint();
		}
	}

	public static void main(String[] args) {
		new Main5();

	}

}
