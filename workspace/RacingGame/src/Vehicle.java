import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class Vehicle extends JPanel{

	
	private static final long serialVersionUID = -8988686487594711623L;
	
	private static final int STEP = 5;
	
	private int x;
	private int y;
	private Color color;
	

	public Vehicle(int x, int y, Color color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}


	
	protected void draw(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawRect(x, y, 40, 60);
	}

	public void moveLeft(){
		x -= STEP;
	}
	
	public void moveRight(){
		x += STEP;
	}
}
