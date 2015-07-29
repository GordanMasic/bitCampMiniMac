package ba.bitcamp.NetworkServerClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {
		try {
			System.out.println("Application started.");
			ServerSocket server = new ServerSocket(6699);
			System.out.println("Server socket made.");

			System.out.println("Waiting for client...");
			Socket client = server.accept();
			System.out.println("Client found!");

			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			writer.write("How dou you do?");
			writer.newLine();
			writer.flush();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));
			System.out.println("Client: " + reader.readLine());

			Scanner input = new Scanner(System.in);

			boolean end = false;
			while (!end) {
				System.out.println("Msg: ");
				writer.write(input.nextLine());
				writer.newLine();
				writer.flush();
				System.out.println("Client: " + reader.readLine());
			}

			input.close();
			reader.close();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
