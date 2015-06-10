import java.util.Scanner;

public class WebStranica {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String page = in.next();
		in.close();
		int counter = 0;
		String subPage = "";
		for (int i = page.length() - 1; i >= 0; i--) {
			if (page.charAt(i) == '/') {
				break;
			} else {
				subPage = page.charAt(i) + subPage;
				counter++;
			}
		}
		System.out.println(subPage);
		counter += 2;
		String pageName = "";
		for (int i = page.length() - counter; i >= 0; i--) {
			if (page.charAt(i) == '/') {
				break;
			} else {
				pageName = page.charAt(i) + pageName;
			}
		}
		System.out.println(pageName);
	}
}
