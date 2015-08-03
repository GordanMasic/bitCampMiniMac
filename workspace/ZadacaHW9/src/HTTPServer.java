import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class HTTPServer {

	public static int counter = 0;

	public static void main(String[] args) {

		ServerSocket server;
		try {
			server = new ServerSocket(8000);
			Socket client = server.accept();

			BufferedReader read = new BufferedReader(new InputStreamReader(
					client.getInputStream()));

			String s = read.readLine();

			try {
				if (s.indexOf("Normal") == 0) {
					String name = "image" + counter + ".jpg";
					counter++;
					InputStream readStream = client.getInputStream();
					FileOutputStream fileOut = new FileOutputStream(new File(
							"images/" + name));

					byte[] buffer = new byte[1024];
					int readBytes;

					while ((readBytes = readStream.read(buffer, 0, 1024)) > 0) {
						fileOut.write(buffer, 0, readBytes);
						fileOut.flush();
					}
					fileOut.close();

				} else if (s.split(" ")[1].equals("/")) {
					

				}
			} catch (NullPointerException e) {

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
