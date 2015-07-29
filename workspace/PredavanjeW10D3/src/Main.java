import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Users/gordan.masic/Desktop/text.txt
		Scanner in = new Scanner(System.in);
		System.out.println("Insert file path: ");
		String fileName = in.nextLine();
		File f = new File(fileName);
		if (f.exists()) {
			if (f.isDirectory()) {
				System.out.println("It's directory");
			} else if (f.isFile()) {
			}
		} else {
			System.out.println("File doesn't exist!");
		}

	}
}
