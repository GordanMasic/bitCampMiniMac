package ba.bitcamp.task07;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Graph extends JFrame{

	
	private static final long serialVersionUID = 1051707430930707571L;

	private JPanel panel = new MyPanel();
	private int[] values = new int[]{10,20,30,40,50,40,30,20,30,40,50,40,30,20,10};
	
	public Graph(){
		setLayout(new BorderLayout());
		setSize(500, 500);
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
			int x = 100;
			int y = 100;
			for (int i = 0; i < values.length; i++) {
				g.setColor(Color.RED);
				g.fillRect(x+1, y-values[i], 5, values[i]);
				x += 21;
				
			}
			g.setFont(new Font("Cambria", Font.BOLD, 60));
			g.drawString("Cisco", 150, 150);
		}
	}
	
	public static void main(String[] args) {
		new Graph();
	}
}
