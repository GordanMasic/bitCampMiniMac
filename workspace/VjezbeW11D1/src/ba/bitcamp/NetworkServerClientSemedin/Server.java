package ba.bitcamp.NetworkServerClientSemedin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Server {

	public static void main(String[] args) {

		URL url1 = null;
		try {
			url1 = new URL(
					"http://showmedesign.s3.amazonaws.com/wp-content/uploads/2012/03/20-cuteAnimals.jpg");
		} catch (MalformedURLException e) {
			System.out.println("Bad URL!");
			e.printStackTrace();
			System.exit(1);
		}

		System.out.println("Waiting for client...");
		try {
			ServerSocket server = new ServerSocket(6699);
			Socket client = server.accept();
			System.out.println("Client found!");

			OutputStream writer = client.getOutputStream();
//			writer.write("Welcome user. My name is Gordan and I'm your server!\n");
			writer.flush();

			BufferedReader reader = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			Scanner input = new Scanner(System.in);

			while (true) {
//				System.out.println("Client: " + reader.readLine());
//				System.out.println("Msg: ");
//				writer.write(input.nextLine());
//				writer.newLine();
//				writer.flush();
				URLConnection con = url1.openConnection();
				InputStream in = con.getInputStream();
				byte[] data = new byte[1024];
				int bytesRead;

				while ((bytesRead = in.read(data, 0, data.length)) > 0) {
					writer.write(data, 0, data.length);
					writer.flush();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
