package ba.bitcamp.PrintingACharArray;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainTask2 {

	public static void main(String[] args) {
		char[] englishAlphabet = new char[26];
		for (int i = 0; i < englishAlphabet.length; i++) {
			englishAlphabet[i] = (char) (i + 65);
		}

		PrintWriter pw = null;
		pw = new PrintWriter(System.out);
		for (int i = 0; i < englishAlphabet.length; i++) {
			pw.print(englishAlphabet[i] + " ");
			pw.flush();
		}

		try {
			pw = new PrintWriter(new File("Letters.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int start = 0;
		int sampleLength = 10;
		while (start + sampleLength <= englishAlphabet.length) {
			pw.write(englishAlphabet, start, sampleLength);
			start += 10;
			if (start + sampleLength > englishAlphabet.length) {
				sampleLength = englishAlphabet.length - start;
				pw.write(englishAlphabet, start, sampleLength);
				break;
			}
		}
		pw.close();
	}
}
