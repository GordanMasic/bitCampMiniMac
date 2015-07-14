public class Main {

	public static void main(String[] args) {

		double[] arr = { 1, 2, 3, 4, 5, 6, 7 };

		DynamicDouble dd = new DynamicDouble(8, 9);
		dd.addElement(6);
		System.out.println(dd);
		dd.addElement(arr);
		System.out.println(dd);

	}

}
