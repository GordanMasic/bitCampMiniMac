package ba.bitcamp.task01.w6d1.vjezbe;

public class Line implements Shape, Drawable {

	private int length;

	/**
	 * Constructor for creating Line objects
	 * 
	 * @param length
	 */
	public Line(int length) {
		this.length = length;
	}

	@Override
	public void drawOnConsole() {
		for (int i = 0; i < length; i++) {
			System.out.print("*  ");
}
	}

	@Override
	public int getCircumference() {
		return 0;
	}

	@Override
	public int getArea() {
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return String.format("Line [length=%s]", length);
	}
	
	
}
