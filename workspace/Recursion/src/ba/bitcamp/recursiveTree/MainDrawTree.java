package ba.bitcamp.recursiveTree;

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

	public static void tree(int x1,int y1,int x2,int y2, int level, Graphics g,boolean b){
		if(b = true){
		g.drawLine(x1, y1, x2, y2);
		
		if(level == 0){
			return;
		}
		x2 = x1;
		y2= y1;
		level--;
		x1-=10;
		y1-=10;
		tree((int)(Math.random()*x1),(int)(Math.random()*y1),x2,y2,level,g,false);
		}else{
			if(level == 0){
				return;
			}
			x2 = x1;
			y2= y1;
			x1+=20;
			y2+=20;		
			level--;
			tree(x1,y1,x2,y2,level,g,true);
		}
	}
	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		g.setColor(Color.black);
		
		tree(500, 500, 500, 600,10,g,true);
		
		
		w.setImage(img);
	}
}
