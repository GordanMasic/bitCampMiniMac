package example2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class NewServer {

	public static void main(String[] args) {

		try {

			ServerSocket server = new ServerSocket(6699);
			Socket client = server.accept();
			String connectedAt = "" + client.getInetAddress().getHostAddress()
					+ " has connected at " + Calendar.getInstance().getTime()
					+ "\n";

			FileWriter writer = new FileWriter(new File(
					"src/example2/statistics.txt"),true);
			writer.write(connectedAt);
			writer.close();

			OutputStream writer1 = client.getOutputStream();
			FileInputStream fis = new FileInputStream(new File(
					"src/example2/file.txt"));

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = fis.read(data, 0, data.length)) > 0) {
				writer1.write(data, 0, data.length);
				writer1.flush();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		;
	}
}
