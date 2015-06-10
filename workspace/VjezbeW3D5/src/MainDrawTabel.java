
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MainDrawTabel {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void drawRectangles(int n, int m, Graphics g) {
		g.setColor(Color.BLACK);
		for (int x = 100; x <= m*100; x += 100) {
			for (int y = 100; y <= n*100; y += 100) {
				g.drawRect(x, y, 100, 100);

			}

		}
	
		

	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		drawRectangles(4,6, g);
		
		w.setImage(img);
	}
}
