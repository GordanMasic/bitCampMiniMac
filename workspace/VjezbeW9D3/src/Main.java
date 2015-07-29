import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		Planet[] planets = new Planet[4];

		planets[0] = new Planet("Mercur", 0.3, 0.5, 0.5);
		planets[1] = new Planet("Venus", 1, 0.9, 0.7);
		planets[2] = new Planet("Jupiter", 150, 100, 150);
		planets[3] = new Planet("Uran", 60, 50, 300);

		Arrays.sort(planets);
		System.out.println(Arrays.toString(planets));

		Planet.sortByDiameter(planets);

		System.out.println();
		System.out.println(Arrays.toString(planets));

	}

}
