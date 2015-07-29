package ba.bitcamp.PrintWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MainTask1 {

	public static void main(String[] args) {

		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("text.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		for (int i = 1; i < 101; i++) {
			if (i == 100) {
				pw.print("" + i);
				pw.flush();
			} else {
				pw.print(i + " and ");
				pw.flush();
			}
		}
		
		pw = new PrintWriter(System.out);
		for (int i = 1; i < 101; i++) {
			if(i == 100){
				pw.println("" + i);
				pw.flush();
			}else{
			pw.print(i + " and ");
			pw.flush();
			}
		}
	}

}
