package ba.bitcamp.NetworkingCircle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Test {

	public static void main(String[] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(6699);

			Socket fromZeljko = server.accept();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					fromZeljko.getInputStream()));
			String message = reader.readLine();
			System.out.println("Poruka: " + message);

			Socket socket = new Socket("10.0.82.14", 2424);

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			writer.write("Poslao sam poruku Kristini!");
			writer.newLine();
			writer.close();

			System.out.println("Proslijedio Zeljku");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
