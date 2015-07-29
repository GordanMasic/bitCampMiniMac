package example2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("10.0.82.22", 2707);
			
			InputStream reader = socket.getInputStream();
			
			FileOutputStream fos = new FileOutputStream(new File("Ajla.jpg"));
			
			byte[] data = new byte[1024];
			int bytesRead = 0;
			while((bytesRead = reader.read(data, 0, data.length))>0){
				fos.write(data, 0, bytesRead);
				
			}
			fos.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
