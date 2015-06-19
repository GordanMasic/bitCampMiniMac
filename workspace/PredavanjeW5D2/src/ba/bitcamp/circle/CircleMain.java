package ba.bitcamp.circle;

import ba.bitcamp.treniranje.klasa.Point;

public class CircleMain {

	public static void main(String[] args) {
		
		Point center1 = new Point(100, 100);
		Point center2 = new Point(350, 350);
		
		Circle c1 = new Circle(center1, 200);
		Circle c2 = new Circle(center2, 30);
		
		System.out.println(c1 + "\n");
		System.out.println(c2 + "\n");
		System.out.println();
		
		System.out.println("Distance between two centers is: "+center1.distance(center2));
		System.out.println(c1.doesIntersect(c2));
	}

}
