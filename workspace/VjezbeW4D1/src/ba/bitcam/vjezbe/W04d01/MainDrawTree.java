package ba.bitcam.vjezbe.W04d01;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class MainDrawTree {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void drawRectangles(int n, int m, Graphics g) {
		g.setColor(Color.BLACK);
		for (int x = 100; x <= m * 100; x += 100) {
			for (int y = 100; y <= n * 100; y += 100) {
				g.drawRect(x, y, 100, 100);

			}

		}

	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.black);
		/*
		 * Main tree block
		 */
		g.drawRect(325, 120, 150, 30);
		g.setFont(new Font("Calibri", Font.BOLD, 16));
		g.drawString("API Packages", 340, 140);

		for (int i = 75; i <= 615; i += 105) {
			int j = 190;
			g.drawRect(i, j, 100, 30);
		}

		g.drawLine(125, 170, 655, 170);

		for (int i = 125; i <= 700; i += 106) {
			g.drawLine(i, 170, i, 190);
		}

		g.drawLine(390, 150, 390, 170);
		
		g.setFont(new Font("Calibri", Font.PLAIN, 16));

		g.drawString("lang", 90, 210);
		g.drawString("util", 195, 210);
		g.drawString("io", 300, 210);
		g.drawString("awt", 405, 210);
		g.drawString("net", 510, 210);
		g.drawString("applet", 615, 210);
		
		w.setImage(img);
	}
}
