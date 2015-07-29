package ba.bitcamp.Networking2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

	private static final String PATH_TO_PUBLIC = "./public";

	public static String getContent(String route) throws IOException {
		String fullPath = routeBuilder(route);
		StringBuilder sb = new StringBuilder();

		BufferedReader br = new BufferedReader(new FileReader(
				new File(fullPath)));

		while (br.ready()) {
			sb.append(br.readLine());
		}

		return sb.toString();
	}

	private static String routeBuilder(String route) {
		if (route.equals("/")) {
			route = "/index.html";
		}
		return PATH_TO_PUBLIC + route;
	}
}
