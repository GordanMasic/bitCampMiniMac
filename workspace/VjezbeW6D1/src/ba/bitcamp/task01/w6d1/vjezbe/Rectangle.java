package ba.bitcamp.task01.w6d1.vjezbe;

public class Rectangle implements Shape,Drawable{

	private int length;
	private int width;
	
	public Rectangle(int length,int width){
		this.length = length;
		this.width = width;
	}
	
	
	@Override
	public void drawOnConsole() {
	
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("*  ");
				
			}System.out.println();
		}
	}
	@Override
	public int getCircumference() {
		return 2*(length + width);
	}
	@Override
	public int getArea() {
		return length * width;
	}


	@Override
	public String toString() {
		return String.format("Rectangle [length=%s, width=%s]", length, width);
	}


	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	
}
