package ba.bitcamp.task06;

import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class XYCoordinates extends JFrame {

	private static final long serialVersionUID = -285033733070472487L;
	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private int coordinateX;
	private int coordinateY;
	private JPanel panel = new MyPanel();

	public XYCoordinates() {
		setSize(WIDTH, HEIGHT);
		panel.addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				coordinateX = e.getX();
				coordinateY = e.getY();
				panel.repaint();

			}

			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		add(panel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -4165490387094140390L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawString("X: " + coordinateX + " Y: " + coordinateY, 225, 225);
		}
	}

	public static void main(String[] args) {
		new XYCoordinates();
	}
}
