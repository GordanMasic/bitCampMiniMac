import java.awt.Color;
import java.awt.Graphics;


public class GraphicUserInterface {

	public static void main(String[] args) {
		
		Graphics g = null;
		int centerX;
		int centerY;
		int colorChoise;
		int count;
		
		for(count = 0; count < 500; count++){
			colorChoise = (int)(3*Math.random());
			switch (colorChoise){
			
			case 0:
				g.setColor(Color.RED);
				break;
			case 1:
				g.setColor(Color.BLUE);
				break;
			case 2:
				g.setColor(Color.GREEN);
				break;
				
			}
			
			double width = 0;
			centerX = (int)(width*Math.random());
			double height = 0;
			centerY = (int)(height*Math.random());
			
			g.fillOval(centerX -50, centerY-50, 100, 100);
			g.setColor(Color.BLACK);
			g.drawOval(centerX-50, centerY-50, 100, 100);
		}
		}
		
	}

	
	

