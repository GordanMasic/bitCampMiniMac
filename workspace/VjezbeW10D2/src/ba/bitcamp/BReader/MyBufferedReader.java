package ba.bitcamp.BReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class MyBufferedReader {

	private InputStream stream;

	public MyBufferedReader(InputStream in) {
		this.stream = in;
	}

	public char read() {
		int in = 0;
		try {
			in = stream.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return (char)in;
	}

	public String readLine() {
		int in = 0;
		String s = "";
		try {
			while (stream.available() > 0) {
				s += in;
				in = stream.read();
				if (in != 10) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return s;

	}

	
	public static void main(String[] args) {

		InputStream is = null;

		try {
			is = new FileInputStream("txt.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
		MyBufferedReader br = new MyBufferedReader(is);
		
		System.out.println(br.readLine());
	}
}
