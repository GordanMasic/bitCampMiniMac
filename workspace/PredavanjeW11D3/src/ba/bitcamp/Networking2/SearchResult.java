package ba.bitcamp.Networking2;

import java.io.IOException;
import java.io.PrintWriter;

public class SearchResult {

	public static void OK(PrintWriter pw, String content) throws IOException{
		
		response(pw, "200 OK", content);
	}

	public static void notFound(PrintWriter pw) throws IOException {
		response(pw, "404 Not Found", "This page does not exist");
	}

	public static void serverError(PrintWriter pw) throws IOException {
		response(pw, "500 Internal Server Error", "Something went wrong");
	}

	private static void response(PrintWriter pw, String responseCode,
			String responseContent) {
		
		pw.printf("HTTP/1.1 %s \n",responseCode);
		pw.println("content-type: text/html");
		pw.println();
		pw.println(responseContent);
		pw.flush();
		pw.close();
	}
}
