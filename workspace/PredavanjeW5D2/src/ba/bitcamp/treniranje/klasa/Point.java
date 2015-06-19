package ba.bitcamp.treniranje.klasa;

public class Point {

	private int coordinateX;
	private int coordinateY;

	/**
	 * Constructor
	 * 
	 * @param x
	 *            coordinate x
	 * @param y
	 *            coordinate y
	 */
	public Point(int x, int y) {
		this.coordinateX = x;
		this.coordinateY = y;
	}

	/**
	 * toString method for Point class
	 */
	public String toString() {
		String output = String
				.format("\nX: %d \nY: %d", coordinateX, coordinateY);
		return output;
	}

	/**
	 * Equals method for comparing two points
	 * 
	 * @param other
	 *            point we want to compare with
	 * @return true if points are equal or false if points are not equal
	 */
	public boolean equals(Point other) {
		if (this.coordinateX == other.coordinateX
				&& this.coordinateY == other.coordinateY) {
			return true;
		} else {
			return false;
		}
	}

	// Getters and setters
	public int getCoordinateX() {
		return coordinateX;
	}

	public void setCoordinateX(int coordinateX) {
		this.coordinateX = coordinateX;
	}

	public int getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(int coordinateY) {
		this.coordinateY = coordinateY;
	}

	/**
	 * Calculates distance between two points
	 * 
	 * @param pointOne
	 *            first point
	 * @param pointTwo
	 *            second point
	 * @return distance (<b>double</b>)
	 */
	public static double getDistance(Point pointOne, Point pointTwo) {
		double distance;
		if (pointOne.coordinateX > pointTwo.coordinateX
				&& pointOne.coordinateY > pointTwo.coordinateY) {
			distance = Math
					.sqrt(Math
							.pow((double) (pointOne.coordinateX - pointTwo.coordinateX),
									2)
							+ Math.pow(
									(double) (pointOne.coordinateY - pointTwo.coordinateY),
									2));
		} else {
			distance = Math
					.sqrt(Math
							.pow((double) (pointTwo.coordinateX - pointOne.coordinateX),
									2)
							+ Math.pow(
									(double) (pointTwo.coordinateY - pointOne.coordinateY),
									2));
		}
		return distance;
	}

	/**
	 * Calculates distance between two points
	 * 
	 * @param other
	 *            second point
	 * @return distance (<b>double</b>)
	 */
	public double distance(Point other) {
		double distance;
		if (this.coordinateX > other.coordinateX
				&& this.coordinateY > other.coordinateY) {
			distance = Math.sqrt(Math.pow(
					(double) (this.coordinateX - other.coordinateX), 2)
					+ Math.pow((double) (this.coordinateY - other.coordinateY),
							2));
		} else {
			distance = Math.sqrt(Math.pow(
					(double) (other.coordinateX - this.coordinateX), 2)
					+ Math.pow((double) (other.coordinateY - this.coordinateY),
							2));
		}
		return distance;
	}

}
