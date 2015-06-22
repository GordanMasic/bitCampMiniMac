package ba.bitcamp.task01.w6d1.vjezbe;

public class Main {

	public static void main(String[] args) {

//		Rectangle r = new Rectangle(5, 4);
//		r.drawOnConsole();
//		System.out.println(r.getCircumference());
//		System.out.println(r.getArea());
//
//		System.out.println();
//		Line l = new Line(5);
//		l.drawOnConsole();

		Drawable[] d = new Drawable[50];
		for (int i = 0; i < 50; i++) {
			if (i % 2 == 0) {
				d[i] = new Line((int) (Math.random() * 3 + 2));

			} else {
				d[i] = new Rectangle((int) (Math.random() * 3 + 2),
						(int) (Math.random() * 3 + 2));

			}

		}
		
		for (int i = 0; i < d.length; i++) {
			d[i].drawOnConsole();
			System.out.println("\n");
		}

	}
}
