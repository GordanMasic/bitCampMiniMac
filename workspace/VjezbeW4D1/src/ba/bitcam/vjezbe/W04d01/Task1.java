package ba.bitcam.vjezbe.W04d01;

public class Task1 {

	public static void main(String[] args) {
		System.out.println(getAreaOfSquare(0));

	}

	/**
	 * Returns <b><i>area</i></b> of square with the a.
	 * 
	 * @param a
	 *            - length of square page
	 * 
	 * @return area - equals to a * a.
	 * 
	 * @throws IllegalArgumentException
	 *                - If value of a is negative.
	 */
	public static double getAreaOfSquare(double a) {
		double area = 0;

		if (a <= 0) {
			throw new IllegalArgumentException("Value of a is wrong!");
		}
		area = a * a;

		return area;
	}

}
