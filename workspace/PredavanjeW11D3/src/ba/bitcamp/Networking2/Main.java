package ba.bitcamp.Networking2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	private static final int PORT = 7321;

	public static void main(String[] args) {

		try {
			ServerSocket server = new ServerSocket(PORT);

			while (true) {
				Socket client = server.accept();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(client.getInputStream()));

				String line = "";
				String requestType = "";
				String requestRoute = "";
				while ((line = reader.readLine()) != null) {
					if (line.contains("GET") || line.contains("POST")) {
						String[] parts = line.split(" ");
						requestType = parts[0];
						requestRoute = parts[1];
						break;
					}

				}

				PrintWriter pw = new PrintWriter(new OutputStreamWriter(
						client.getOutputStream()));
				try {
					String htmlContent = FileHandler.getContent(requestRoute);
					SearchResult.OK(pw, htmlContent);
				} catch (FileNotFoundException e) {
					SearchResult.notFound(pw);
				} catch (IOException e) {
					SearchResult.serverError(pw);
				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
