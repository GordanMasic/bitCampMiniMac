package ba.bitcamp.BWriter;

import java.io.IOException;
import java.io.OutputStream;

public class MyBufferedWriter {

	private OutputStream stream;

	public MyBufferedWriter(OutputStream out) {
		this.stream = out;
	}

	public void write(char c) {
		try {
			stream.write(c);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(int a) {
		try {
			stream.write(a);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String s) {
		try {
			for (int i = 0; i < s.length(); i++) {
				stream.write(s.charAt(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void flush() {
		try {
			stream.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void newLine() {
		try {
			stream.write(10);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
