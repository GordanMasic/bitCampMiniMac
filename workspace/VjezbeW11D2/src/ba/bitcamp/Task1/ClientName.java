package ba.bitcamp.Task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientName {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("10.0.82.98", 7777);

			InputStream in = socket.getInputStream();
			File file = new File("File.txt");
			FileOutputStream fileWrite = new FileOutputStream(file);

			byte[] data = new byte[1024];
			int bytesRead;

			while ((bytesRead = in.read(data, 0, data.length)) > 0) {
				fileWrite.write(data, 0, bytesRead);
			}
			fileWrite.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
