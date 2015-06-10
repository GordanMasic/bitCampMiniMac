package ba.bitcamp.dreamteam;

import java.awt.Color;
import java.awt.Graphics;

public class Line {

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
	
	public static void disp(Graphics g){
		g.dispose();
		
	}
	
	public static void star(int x,int y, int length,Graphics g){
		 
		g.drawLine(x, y, x-length/2, y+2*length);
		g.drawLine(x, y, x+length/2, y+2*length);
		g.drawLine(x-length, y+length, x+length, y+length);
		g.drawLine(x-length, y+length, x+length/2, y+2*length);
		g.drawLine(x+length, y+length, x-length/2, y+2*length);
	}
}
