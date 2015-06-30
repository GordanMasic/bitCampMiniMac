import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;


public class RacingGame extends JPanel{

	
	private static final long serialVersionUID = 782163722628328124L;

	private int roadWidth;
	private int roadHeight;
	private Vehicle myVehicle;
	
	public RacingGame(int roadWidth,int roadHeight) {
		this.roadWidth = roadWidth;
		this.roadHeight = roadHeight;
		this.myVehicle = new Vehicle(roadWidth/2, roadHeight-90, Color.BLUE);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		 myVehicle.draw(g);
		
	}
		
	
}
