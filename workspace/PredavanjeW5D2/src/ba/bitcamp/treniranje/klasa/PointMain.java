package ba.bitcamp.treniranje.klasa;


public class PointMain {

	public static void main(String[] args) {
		
		Point p1 = new Point(10, 10);
		System.out.println(p1 + "\n");
		Point p2 = new Point(20, 20);
		System.out.println(p2 + "\n");
		
		double distance = Point.getDistance(p1, p2);
		System.out.println(distance);
		
		System.out.println();
		System.out.println(p1.distance(p2));
	}

}
