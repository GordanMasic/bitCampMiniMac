package ba.bitcamp.gordan.variables;

public class Area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float pageA = 9.55F; // Stranica a
		float pageB = 6.87F; // Stranica b

		double areaOfRectangle = pageA * pageB; // Povrsina pravougaonika se
												// racuna kao a*b

		double extentOfRectangle = 2 * pageA + 2 * pageB; // Obim praavougaonika
															// se racuna kao
															// 2*a+2*b

		System.out.println("Povrsina pravougaonika stranica a= " + pageA
				+ " i b= " + pageB + " iznosi P= " + areaOfRectangle
				+ " a obim pravougaonika iznosi O= " + extentOfRectangle);

		float radius = 5.85F; // Poluprecnik kruga
		float pi = 3.14F;

		double areaOfCircle = radius * radius * pi; // Povrsina kruga se racuna
													// kao r na kvadrat
													// pomnozeno sa pi

		double extentOfCircle = 2 * radius * pi; // Obim kruga se racuna kao
													// 2*r*pi
		System.out
				.printf("Povrsina kruga poluprecnika r= %.2f iznosi P= %.2f a obim iznosi O= %.2f",
						radius, areaOfCircle, extentOfCircle);
	}

}
