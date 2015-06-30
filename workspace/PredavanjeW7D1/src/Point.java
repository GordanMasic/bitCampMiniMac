import java.awt.Color;


public class Point {

	private int x;
	private int y;
	private int size;
	private Color color;
	
	
	public Point(int x, int y, int size, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
		this.size = size;
	}


	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public Color getColor() {
		return color;
	}


	public void setX(int x) {
		this.x = x;
	}


	public void setY(int y) {
		this.y = y;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	
	
}
