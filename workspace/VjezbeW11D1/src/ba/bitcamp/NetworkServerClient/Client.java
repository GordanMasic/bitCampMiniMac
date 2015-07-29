package ba.bitcamp.NetworkServerClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) {

		try {
			System.out.println("[CLIENT] Application started.");
			Socket socket = new Socket("127.0.0.1", 6699);
			System.out.println("[CLIENT] Connected to localhost");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream()));
			writer.write("Very well thank you. How do you do?");
			writer.newLine();
			writer.flush();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					socket.getInputStream()));
			System.out.println("Server: " + reader.readLine());

			Scanner input = new Scanner(System.in);
			// System.out.println("Server: " + reader.readLine());
			// System.out.println("Message: ");
			// writer.write(input.nextLine());
			// writer.flush();

			boolean end = false;
			while (!end) {
				System.out.println("Server: " + reader.readLine());

				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
