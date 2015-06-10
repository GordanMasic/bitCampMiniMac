package ba.bitcamp.dreamteam;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.plaf.ColorChooserUI;

import ba.bitcamp.dreamteam.DrawWindow;

public class MainDrawRect {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800, BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****
		g.setColor(Color.BLACK);
		
		//g.drawRect(10,10,100,100);
		
		star(50,50,50,g);
		// *******************
		w.setImage(img);
	}

	public static void line(int x1, int y1, int x2, int y2,Graphics g){
		g.drawLine(x1,y1,x2,y2);
	}
	
	public static void dRect(int x1, int y1, int x2, int y2, Graphics g){
		g.drawRect(x1,y1,x2,y2);
	}
	
	public static void fRect(int x1, int y1, int x2, int y2,Graphics g){
		g.fillRect(x1,y1,x2,y2);
	}
	
	public static void dOval(int x1, int y1, int x2, int y2,Graphics g){
		g.drawOval(x1,y1,x2,y2);
	}
	
	public static void fOval(int x1, int y1, int x2, int y2,Graphics g){
		g.fillOval(x1,y1,x2,y2);
	}
	public static void color(String s, Graphics g){
		g.setColor(Color.decode(s));
	}
	public static void star(int x,int y, int length,Graphics g){
		 
		g.drawLine(x, y, x-length/2, y+2*length/3);
		g.drawLine(x, y, x+length/2, y+length);
		g.drawLine(x-length/3, y+length/6, x+length/3, y+length/6);
		g.drawLine(x-length/3, y+length/6, x+length/6, y+3*length/4);
		g.drawLine(x+length/3, y+length/6, x-length/6, y+3*length/4);
	}
}
