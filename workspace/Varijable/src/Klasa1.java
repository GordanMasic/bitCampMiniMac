public class Klasa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int meters = 33000;
		int kilometers = meters / 1000;
		int milimeters = meters * 1000;
		double feet = meters * 3.28084;
		double inches = meters * 39.3701;
		
		double celsius = 27;
		double kelvin = celsius + 273.15;
		double fahrenheit = celsius + 32;
		
		int degree = 90;
		double radian = (degree / 180.0);
		
		System.out.printf("%d [m]\n", meters);
		System.out.printf("%d [km]\n", kilometers);
		System.out.printf("%d [mm]\n", milimeters);
		System.out.printf("%f [feet]\n", feet);
		System.out.printf("%f [inch]\n\n", inches);
		
		System.out.printf("%.2f [ºC]\n", celsius);
		System.out.printf("%.2f [K]\n", kelvin);
		System.out.printf("%.2f [ºF]\n\n", fahrenheit);
		
		System.out.printf("%d [º]\n", degree);
		System.out.printf("%.1f π [rad]\n", radian);
	}

}
