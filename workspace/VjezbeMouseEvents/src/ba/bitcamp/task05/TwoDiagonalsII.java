package ba.bitcamp.task05;


import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class TwoDiagonalsII extends JFrame {

	private static final long serialVersionUID = 6847344236553347775L;

	private static final int WIDTH = 500;
	private static final int HEIGHT = 500;
	private JPanel panel = new JPanel();

	public TwoDiagonalsII() {
		setLayout(new BorderLayout());
		
//		panel.addMouseListener(new Mouse());
			
			
		add(panel);
		
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

	private class MyPanel extends JPanel {

		private static final long serialVersionUID = -4165490387094140390L;

		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			panel.setBackground(Color.WHITE);
			g2d.setStroke(new BasicStroke(10));
			g2d.drawLine(0, 0, getWidth(), getHeight());
			g2d.drawLine(0, getHeight(), getWidth(), 0);
		}
	}

	public static void main(String[] args) {
		new TwoDiagonalsII();
	}

}
