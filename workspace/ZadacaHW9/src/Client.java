import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {

		try {
			Socket client = new Socket("localhost", 8000);

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
					client.getOutputStream()));
			bw.write("Normal");
			bw.newLine();
			bw.flush();

			FileInputStream fis = new FileInputStream(new File("/Users/gordan.masic/Desktop/tiger.jpg"));
			OutputStream out = client.getOutputStream();

			byte[] buffer = new byte[1024];
			int readBytes;
			while ((readBytes = fis.read(buffer, 0, 1024)) > 0) {
				out.write(buffer, 0, readBytes);
				out.flush();
			}
			bw.close();
			out.close();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
